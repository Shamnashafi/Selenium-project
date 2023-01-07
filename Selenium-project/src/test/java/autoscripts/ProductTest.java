package autoscripts;

import org.testng.annotations.Test;

import pageelements.LoginPage;
import pageelements.ProductPage;
import utilities.DriverLaunch;
import utilities.ExcelRead;
import utilities.ReadConfig;
import utilities.ScreenShot;
import utilities.ScrollElement;
import utilities.Waits;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ProductTest {
	WebDriver driver;
	ProductPage objproduct;
	ScreenShot objshot=new ScreenShot();
	DriverLaunch objdriver=new DriverLaunch();
	Waits objwaits=new Waits();
	LoginPage objloginpage;
	ExcelRead objexcel;
	ScrollElement objscroll=new ScrollElement();
	ReadConfig objconfig;
	@Test(priority = 1, enabled=true, description = "Adding Unit with '+' symbol")
	  public void addUnitUsingIconTC03() throws InterruptedException, IOException {
		objproduct=new ProductPage(driver);
		objwaits.waitForElementTobeVisible(driver, objproduct.products, 30);
		objproduct.addingUnitUsingIconValidation();
	}
	@Test(priority = 2, enabled=true, description = "Adding Brand name with '+' symbol")
	  public void addBrandUsingIconTC04() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objproduct.products, 30);
		objproduct.addingBrandUsingIconValidation();
	}
	@Test(priority = 3, enabled=true, description = "Uploading Image")
	  public void uploadImageTC05() throws IOException, InterruptedException {
		objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
		objproduct.uploadImageValidation();
	}
	@Test(priority = 4, enabled=true, description = "Selecting variable product type")
	  public void variableProductTypeTC06() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objproduct.products, 30);
		objproduct.variableProductTypeValidation();
	}
	@Test(priority = 5, enabled=true,description = "Without mandatory field-Product Name")
	  public void withoutProductNameTC07() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objproduct.products, 30);
		  objproduct.withoutProductNameValidation("250", "20", "This field is required.");
	  }
	@Test(priority = 6, enabled=true,description = "Without mandatory field-Unit")
	  public void withoutUnitTC08() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
		  objproduct.withoutUnitValidation("0000 Apple", "This field is required.");
		  
		  }
	  @Test(priority = 7, enabled=true,description = "Without mandatory field-Quantity")
	  public void withoutQuantityTC09() throws InterruptedException, IOException {
		  
		  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
		  objproduct.withoutQuantityValidation("20", "This field is required.");
	  }
	  @Test(priority = 8, enabled=true,description = "Without mandatory field-Tax")
	  public void withoutTaxTC10() throws InterruptedException, IOException {
		  
		  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
		  objproduct.withoutTaxValidation("250", "This field is required.");
		  
	  }
	
	@Test(priority = 9, enabled=true,description = "Adding a new product")
	  public void verifyingAddProductTC11() throws InterruptedException, IOException {
		 
		 objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
		
		 objproduct.addProductValidation();
	}
	
  @Test(priority = 10, enabled=true,description = "Verifying the product name from product list")
  public void verifyProductNameTC12() throws InterruptedException, IOException {
	  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
	  objproduct.productNameValidation("0000 Apple");
  }
  @Test(priority = 11, enabled=true,description = "Verifying the selling price from product list")
  public void verifyingSellingPriceTC13() throws InterruptedException, IOException {
	  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
	  objproduct.sellingPriceValidation("0000 Apple", "33,20 €");
  }
  @Test(priority = 12, enabled=true,description = "Verifying the category from product list")
  public void verifyingCategoryTC14() throws InterruptedException, IOException {
	  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
	 objproduct.categoryValidation("0000 Apple", "food");
  }
  @Test(priority = 13, enabled=true,description = "Verifying the Brand from product list")
  public void verifyingBrandTC15() throws InterruptedException, IOException {
	  objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
	  objproduct.brandNameValidation("0000 Apple", "Berry Fruit");
  }
  @Test(priority = 14, enabled=true,description = "Deleting the added product from the product list")
  public void deletingProductTC16() throws InterruptedException, IOException {
	 objwaits.waitForElementTobeVisible(driver, objproduct.addproduct, 30);
	  objproduct.deleteProductValidation("0000 Apple", "No matching records found");
  }   
  @BeforeTest
  public void beforeTest() throws InterruptedException, IOException {

	  objexcel=new ExcelRead("sheet2");  // reading url and browser from excel
	  String url=objexcel.readData(0, 1);
	  String Browser=objexcel.readData(1, 1);
	  objdriver.launchBrowser(Browser,url);
	  this.driver=objdriver.driver;
	  objexcel=new ExcelRead("sheet1"); // reading user and password from excel
	  String user=objexcel.readData(0, 0);
	  String pass=objexcel.readData(0, 1);
	  objdriver.userLogin(user, pass);
	  objloginpage=new LoginPage(driver);
	  objloginpage.endTour();
  }	  
  @AfterTest
  public void afterTest()
  {
	  objdriver.closeBrowser();
  }

}
