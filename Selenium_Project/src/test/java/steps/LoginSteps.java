package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();
	
	@Given("user nevigate to facebook website")
	public void user_nevigate_to_facebook_website() {
		driver.get("https://www.facebook.com/");
	}

	@When("user validate the website Title")
	public void user_validate_the_website_title() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText().contains("Facebook");
			System.out.println("elements = "+driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText());
			System.out.println(b);
			
//		}
		Assert.assertEquals(b, true, "It is Not Facebook website");
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {}

	@And("user click the login button")
	public void user_click_the_login_button() {}


}
