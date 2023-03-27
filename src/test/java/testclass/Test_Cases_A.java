package testclass;

import org.testng.annotations.Test;

public class Test_Cases_A extends Base_Test {
	@Test(priority = 2)
	public void ReqOtp() throws InterruptedException {
		
		ls.requestsOTP();
		
	}
	@Test(priority = 3)
	public void Verify() {
		ls.Verify_Account_and_Redirect_to_Page();
	}
	@Test(priority = 4)
	public void Verify_Page() throws InterruptedException {
		ls.redirected_to_the_correct_page_after_successful_OTP();
	}

}
