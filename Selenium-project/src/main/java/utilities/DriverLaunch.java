package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageelements.LoginPage;

public class DriverLaunch  {
	
	public WebDriver driver;

	public void launchBrowser(String browser, String url)
	{		 	
		if(browser.equals("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Libraries\\chromedriver_win32\\chromedriver.exe"); 	// setting chrome location
		driver= new ChromeDriver(); 		// creating chrome instance
		driver.manage().window().maximize(); // maximize the window
		driver.get(url); 	// launching url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait for driver
		}
		else if(browser.equals("Firefox")) 
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver-v0.32.0-win64\\geckodriver.exe"); 	
			driver= new FirefoxDriver(); 		
			driver.manage().window().maximize(); 	
			driver.get(url); 
		}
		else if(browser.equals("Edge")) 
		{
			
			System.setProperty("webdriver.edge.driver", "E:\\Libraries\\edgedriver_win64\\msedgedriver.exe"); 	
			driver= new EdgeDriver(); 		
			driver.manage().window().maximize(); 	
			driver.get(url); 
		}
		else
		{
			System.out.println("Failed");
		}
}
	public void closeBrowser()
	{
		driver.close();
	}
	public void userLogin(String username,String password) throws InterruptedException
	{
		LoginPage objloginpage=new LoginPage(driver);
		objloginpage.userType(username);
	
		objloginpage.passwordType(password);
		
		objloginpage.loginClick();
		 
	
		
	}
	public void dropDownByVisibleText(WebElement dropdown,String VisibleText)
	{
		  Select objselect=new Select(dropdown);
		  objselect.selectByVisibleText(VisibleText);
	}
	public void dropDownByIndex(WebElement dropdown,int Index)
	{
		  Select objselect=new Select(dropdown);
		objselect.selectByIndex(Index);
	}
	public void dropDownByValue(WebElement dropdown,String value)
	{
		  Select objselect=new Select(dropdown);
		  objselect.selectByValue(value);
	}
	
	public void switchToIframe(WebElement value)
	  {		 		
		  driver.switchTo().frame(value); 	
		  
	  } 	 
	  public void switchToParent() 
	  {		 		
		  driver.switchTo().defaultContent(); 	
	  }
}
