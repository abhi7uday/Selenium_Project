package makemytrip;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login_Page {
	
	@BeforeTest
	void login() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.makemytrip.com/");
	 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

     try {
         FileUtils.copyFile(screenshot, new File("screenshot.png"));
     } catch (IOException e) {
         e.printStackTrace();
     }
	
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
	driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("9167240409");
	driver.findElement(By.xpath("//button[@data-cy ='continueBtn']")).click();
	driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@data-cy ='login']")).click();
	System.out.println(driver.findElement(By.xpath("//p[contains(@class, 'validity font12' )]")).getText());
	driver.quit();
	}
	public static void main(String args[]) {
		Login_Page lp = new Login_Page();
		lp.login();
	}
}
