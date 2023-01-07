package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage  {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		 this.driver = driver;
        PageFactory.initElements(driver, this);
       
    }
	
	@FindBy(id="username")
	public WebElement uname;
	
	@FindBy(id="password")
	public WebElement pword;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"step-0\"]/div[3]/button[3]")
	public WebElement endtour;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li/a/i")
	public WebElement bellicon;
	
	@FindBy(xpath="//span[@class='help-block']/strong")
	public WebElement validationmsg;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[2]/a/span")
	public WebElement ajumathew;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']/li[2]/div[2]/a")
	public WebElement signout;
	
	public void userType(String username)
	{
		uname.sendKeys(username);
	}
	
	public void passwordType(String password)
	{
		pword.sendKeys(password);
		
	}
	public void loginClick()
	{
		loginbutton.click();
		
	}
	public void endTour()
	{
		endtour.click();
		
	}
	public void ajuLogout()
	{
		ajumathew.click();
		
	}
	
	public void signOut()
	{
		signout.click();
		
	}
	public void elementDisplay()
	{
		if(bellicon.isDisplayed())
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	public void verifyInvalidLogin()
	{
	String msgexpected = "These credentials do not match our records."; 		
	  String msgactual = validationmsg.getText();
		
	  Assert.assertEquals(msgactual, msgexpected);// hard assert
	  
	}
	
}
