package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    
	@FindBy(xpath = "//*[text()='Sign Up / Login']")
	WebElement log;
    
    
    WebDriver driver;
    public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	public void login() throws InterruptedException {
		
		driver.get("https://www.zyapaar.com/");
		
		Thread.sleep(3000);
		
		log.click();
	}

}
