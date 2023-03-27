package pages;

import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Otp_Page {
    
	@FindBy (xpath = "//*[@id='mobileNo']")
    WebElement mobile;
	
	@FindBy(xpath = "//*[text()='Send OTP']")
	WebElement otpbutton;
	
	@FindBy (xpath = "//*[text()='Verify']")
	WebElement verifyotp;
    
	WebDriver driver;
	public Otp_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        
		PageFactory.initElements(driver, this);
		
        
	}
	public void requestsOTP() throws InterruptedException {
		
		Thread.sleep(3000);
		
		mobile.sendKeys("9503044450");
		
		otpbutton.click();
		
		Thread.sleep(40000);// script stop for 40 minute to enter otp manually
	     
		}
	public void Verify_Account_and_Redirect_to_Page(){
		
		verifyotp.click();
		
	}
	
	public void redirected_to_the_correct_page_after_successful_OTP() throws InterruptedException {
		String aa = driver.getTitle();
		System.out.println(aa);//Zypaar
		System.out.println();
		String bb = "growwr";
		Thread.sleep(2000);
		org.testng.Assert.assertEquals(aa,bb);
	
		
	}
}
