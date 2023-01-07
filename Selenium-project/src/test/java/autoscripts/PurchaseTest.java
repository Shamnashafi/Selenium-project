package autoscripts;

import org.testng.annotations.Test;

import pageelements.LoginPage;
import pageelements.PurchasePage;
import utilities.DriverLaunch;
import utilities.ExcelRead;
import utilities.ScrollElement;
import utilities.Waits;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PurchaseTest {
	WebDriver driver;
	DriverLaunch objdriver=new DriverLaunch();
	ScrollElement objscroll=new ScrollElement();
	Waits objwaits=new Waits();
	PurchasePage objpurchase;
	ExcelRead objexcel;
	LoginPage objloginpage;
	
	@Test(priority = 1, enabled=true, description = "Uploading Document")
	  public void uploadImageTC17() throws IOException, InterruptedException {
		objpurchase=new PurchasePage(driver);
		objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		objpurchase.attachDocumentValidation();
	}
	
	@Test(priority = 2, enabled=true, description = "Selecting Card payment mehod")
	  public void SelectingCardPaymentTC18() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		objpurchase.cardPaymentValidation();
		
	}
	@Test(priority = 3, enabled=true, description = "Selecting Cheque payment mehod")
	  public void SelectingChequePaymentTC19() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		objpurchase.chequePaymentValidation();
		
	}
	@Test(priority = 4, enabled=true, description = "Selecting Bank payment mehod")
	  public void SelectingBankPaymentTC20() throws InterruptedException, IOException {
		
		objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		objpurchase.bankPaymentValidation();
		
	}
	
	 @Test(priority = 5, enabled=true,description = "Without mandatory field-Supplier Name")
	public void withoutSupplierNameTC21() throws InterruptedException, IOException {
		
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		objpurchase.withoutSupplierNameValidation();
		
	}
	 
	 @Test(priority = 6, enabled=true,description = "Without mandatory field-Purchase Status")
		public void withoutPurchaseStatusTC22() throws InterruptedException, IOException {
		 
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		 objpurchase.withoutPurchaseStatusValidation();
	 }
	
	 @Test(priority = 7, enabled=true,description = "Without mandatory field-Location")
		public void withoutLocationTC23() throws InterruptedException, IOException {
		 
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		 objpurchase.withoutLocationValidation();
	 }
	 @Test(priority = 8, enabled=true,description = "Without mandatory field-Add Product")
		public void withoutAddProductTC24() throws InterruptedException, IOException {
		 
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		 objpurchase.withoutAddProductValidation();
	 }
	 @Test(priority = 9, enabled=true,description = "Without mandatory field-Amount")
		public void withoutAmountTC25() throws InterruptedException, IOException {
		 
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		 objpurchase.withoutAmountValidation(); 
	 }
	 @Test(priority = 10, enabled=true,description = "Adding a new Purchase")
	  public void verifyingAddSupplierTC26() throws InterruptedException, IOException {
	 
	  objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
	  objpurchase.addSupplierValidation();
	 }
	 @Test(priority = 11, enabled=true,description = "Verifying supplier name from the purchase list")
	 public void verifySupplierNameTC27() throws IOException, InterruptedException {
	  
	  objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
	  objpurchase.supplierNameValidation();
	 }
	 @Test(priority = 12, enabled=true,description = "Verifying purchase status from the purchase list")
	 public void verifyPurchaseStatusTC28() throws IOException, InterruptedException {
	  objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
	  objpurchase.purchaseStatusValidation();
	 }
	 @Test(priority = 13, enabled=true,description = "Verifying the location from the purchase list")
	 public void verifyLocationTC29() throws IOException, InterruptedException {
	  objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
	  objpurchase.purchaseLocationValidation();
	 }
	 @Test(priority = 14, enabled=true,description = "Deleting the purchase from the list")
	 public void deletePurchaseTC30() throws IOException, InterruptedException {
		 objwaits.waitForElementTobeVisible(driver, objpurchase.purchases, 30);
		 objpurchase.deletePurchaseValidation();
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
	 public void afterTest() {
	  objdriver.closeBrowser();
	 }


}
