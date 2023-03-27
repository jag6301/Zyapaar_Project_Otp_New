package testclass;

import org.testng.annotations.Test;

public class Test_Cases extends Base_Test{
    @Test(priority = 1)
	public void navigatestotheloginURL() throws InterruptedException {
		
		lp.login();
		
	}
}
