package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {
	
public static void good(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
				
		String path = System.getProperty("user.dir")+"\\Screen\\"+name+".png";
		
		File destination = new File(path);
		
		org.openqa.selenium.io.FileHandler.copy(source,destination);
		
	}

}
