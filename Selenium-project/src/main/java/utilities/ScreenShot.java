package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	 
	public void  screenShots(WebDriver driver) throws IOException 
	  {     	
		
		
		DateFormat objdateFormat =new SimpleDateFormat("dd-MM-yyyy HH-mm-ss-ms");  // Create object of SimpleDateFormat class and decide the format
		 
		Date daydate =new Date();   //get current date time with Date()
		
		String date1=objdateFormat.format(daydate); // Now format the date
		 //System.out.println("Current date and time is "+date1);
		 
		  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  
		 
		  File path =new File("C:\\Users\\cheppu\\eclipse-workspace\\selenium-project\\src\\test\\resources\\screenshots"+date1+".png"); 
		  Files.copy(screenshotFile, path);     
		  }
	

}

