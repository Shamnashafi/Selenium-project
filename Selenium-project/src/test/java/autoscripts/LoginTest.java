package autoscripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageelements.LoginPage;
import utilities.DriverLaunch;
import utilities.ExcelRead;
import utilities.ReadConfig;
import utilities.ScreenShot;
import utilities.Waits;



public class LoginTest {
	
	WebDriver driver;
	ExcelRead objexcel;
	ScreenShot objshot=new ScreenShot(); 
	LoginPage objloginpage;
	Waits objwaits;
	DriverLaunch objdriver=new DriverLaunch();
	ReadConfig objconfig=new ReadConfig();
	
  @Test(priority = 2, enabled=true, description = "Login with valid username and valid password")
  public void validLoginTC01() throws IOException, InterruptedException 
  {
	  objloginpage.uname.clear();
	   objexcel=new ExcelRead("sheet1");
	  String user=objexcel.readData(0, 0);
	  String pass=objexcel.readData(0, 1);
	  objdriver.userLogin(user, pass); // login the application
	  objloginpage.endTour();
		 objwaits=new Waits();
		 objwaits.waitForElementTobeVisible(driver, objloginpage.bellicon, 30); // wait condition and 
		 objloginpage.elementDisplay(); // verifying login 
	    // objshot.screenShots(driver);
	    // objloginpage.ajuLogout(); // selecting logout menu
	    // objloginpage.signOut();  // clicking signout icon
	  } 
  
  @Test(priority = 1, enabled=true, dataProvider="login-invalid", description = "Login with invalid credentials")
  public void invalidLoginTC02(String user,String pass) throws IOException, InterruptedException {

	  objdriver.userLogin(user, pass);
	  objloginpage=new LoginPage(driver);
	  objloginpage.verifyInvalidLogin();
	    // objshot.screenShots(driver);      
  }
  @DataProvider (name="login-invalid")
  public Object[][] dpMethod()
  {
	  return new Object[][] {
		  {"shamna","123456"}
	  };
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  String url=objconfig.getUrl();
      String Browser=objconfig.getBrowser();
	  objdriver.launchBrowser(Browser,url);
	  this.driver=objdriver.driver;
	  
	  
	  
  }

  @AfterTest
  public void afterTest()
  {
	  objdriver.closeBrowser();
  }

}
