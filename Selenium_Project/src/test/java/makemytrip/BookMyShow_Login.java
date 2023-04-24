package makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BookMyShow_Login {
	
	@BeforeTest
	void login() {
	WebDriver driver = new ChromeDriver();

	driver.get("https://in.bookmyshow.com/explore/home/");
	
	driver.findElement(By.xpath("//img[@alt = 'BANG']")).click();
	driver.findElement(By.xpath("//a[@class = 'sc-eKZiaR.caGbXw']")).click();
	driver.findElement(By.xpath("//div[class='sc-7o7nez-0.jwHqQG']")).click();
	driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@data-cy ='login']")).click();
	System.out.println(driver.findElement(By.xpath("//p[contains(@class, 'validity font12' )]")).getText());
	driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
