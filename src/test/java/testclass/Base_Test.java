package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login_Page;
import pages.Otp_Page;

public class Base_Test {
	static WebDriver driver;
	Login_Page lp;
	Otp_Page ls;
	@BeforeSuite
	public void intbrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ch = new ChromeOptions();
		
		driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	@BeforeClass
	public void object() {
		
		lp = new Login_Page(driver);
		
		ls = new Otp_Page(driver);
		
	}

}
