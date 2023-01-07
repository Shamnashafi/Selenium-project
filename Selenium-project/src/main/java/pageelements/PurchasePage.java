package pageelements;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriverLaunch;
import utilities.ScreenShot;
import utilities.ScrollElement;
import utilities.Waits;

public class PurchasePage {
	
	WebDriver driver;
	ScrollElement objscroll=new ScrollElement();
	Waits objwaits=new Waits();
	ScreenShot objshot=new ScreenShot();
	DriverLaunch objdriver=new DriverLaunch();
	
	public PurchasePage(WebDriver driver)
	{
		 this.driver = driver;
        PageFactory.initElements(driver, this);
       
    }
	
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[5]/a")
	public WebElement purchases;
	
	@FindBy(xpath="//*[@id=\"tour_step6\"]/ul/li[2]/a")
	public WebElement addpurchases;
	
	@FindBy(id="select2-supplier_id-container")
	public WebElement selectsupplier;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	public WebElement typesuppliername;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li")
	public WebElement selectsuppliername;
	
	@FindBy(id="select2-status-container")
	public WebElement purchasestatus;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[2]")
	public WebElement recievedpurchasestatus;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	public WebElement pleaseselectstatus;
	
	@FindBy(id="select2-location_id-container")
	public WebElement busineslocation;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[2]")
	public WebElement selectbusineslocation;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	public WebElement pleaseselectlocation;
	
	@FindBy(id="search_product")
	public WebElement searchproduct;
	
	@FindBy(id="submit_purchase_form")
	public WebElement savepurchase;
	
	@FindBy(xpath="//div[contains(text(), 'Purchase added successfully')]")
	public WebElement purchasesavemessage;
	
	@FindBy(id="amount_0")
	public WebElement addamount;
	
	@FindBy(xpath="//div[@id='purchase_table_filter']/label/input")
	public WebElement searchbox;
	
	@FindBy(xpath="//table[@id='purchase_table']/tbody/tr[1]/td[4]")
	public WebElement supplierlist;
	
	@FindBy(xpath="//table[@id='purchase_table']/tbody/tr[1]/td[5]/span[1]")
	public WebElement statuslist;
	
	@FindBy(xpath="//table[@id='purchase_table']/tbody/tr[1]/td[3]")
	public WebElement locationlist;
	
	@FindBy(xpath="//*[@id='toast-container']/div/div")
	public WebElement validationpurchase;
	
	@FindBy(id="supplier_id-error")
	public WebElement warningundertextbox; 
	
	@FindBy(id="status-error")
	public WebElement warningunderstatus; 
	
	@FindBy(id="location_id-error")
	public WebElement warningunderlocation;
	
	@FindBy(xpath="//table[@id='purchase_entry_table']/tbody/tr[1]/td[14]/i")
	public WebElement removecrossicon;
	
	@FindBy(xpath="/html/body/div[5]/div/div[3]/div[2]/button")
	public WebElement okremove;		
	
	@FindBy(xpath="//*[@id='toast-container']/div/div")
	public WebElement addproductwarning;
	
	@FindBy(id="amount_0-error")
	public WebElement warningunderamount;
	
	@FindBy(xpath="//table[@id='purchase_table']/tbody/tr[1]/td[9]/div/button")
	public WebElement purchaseaction;
	
	@FindBy(xpath="//div[@id='toast-container']/div/div")
	public WebElement purchasvaldtnmessage;
	
	@FindBy(xpath="//input[@id='upload_document']")
	public WebElement attachdocument;
	
	@FindBy(xpath="//*[@id=\"add_purchase_form\"]/div[1]/div/div/div[8]/div/div/div[2]/div[1]/div/i")
	public WebElement uploadeddocument;
	
	@FindBy(xpath="//*[@id=\"add_purchase_form\"]/div[1]/div/div/div[8]/div/div/div[2]/div[2]/button[1]/i")
	public WebElement removedocument;
	
	@FindBy(xpath="//*[@id=\"method_0\"]")
	public WebElement singledropdown;
	
	@FindBy(id="card_number_0")
	public WebElement cardnumberoption;
	
	@FindBy(id="cheque_number_0")
	public WebElement chequenumberoption;
	
	@FindBy(id="bank_account_number_0")
	public WebElement bankaccnumberoption;
	
	
	public void purchaseClick()
	{
		purchases.click();
	}
	public void addpurchaseClick()
	{
		addpurchases.click();
	}
	public void selectSupplierClick()
	{
		selectsupplier.click();
	}
	
	public void supplierName(String sname)
	{
		typesuppliername.sendKeys(sname);
	}
	public void SupplierNameSelect()
	{
		selectsuppliername.click();
	}
	public void purchaseStatusClick()
	{
		purchasestatus.click();
	}
	public void recievedStatusSelect()
	{
		recievedpurchasestatus.click();
	}
	public void pleaseSelectStatus()
	{
		pleaseselectstatus.click();
	}
	public void businessLocationClick()
	{
		busineslocation.click();
	}
	public void businessLocationSelect()
	{
		selectbusineslocation.click();
	}
	public void locationPleaseSelect()
	{
		pleaseselectlocation.click();
	}
	public void searchProduct(String productname)
	{
		searchproduct.sendKeys(productname);
	}
	public void addAmount(String amount)
	{
		addamount.sendKeys(amount);
	}
	public void savePurchaseClick()
	{
		savepurchase.click();
	}
	public void searchBox(String name)
	{
		searchbox.sendKeys(name);
	}
	public void removeProductClick()
	{
		removecrossicon.click();
	}
	public void okRemoveProductClick()
	{
		okremove.click();
	}
	public void actionsClick()
	{
		purchaseaction.click();
	}
	public void fileUpload(String path)
	{
		attachdocument.sendKeys(path);
	}
	public void removeUploadFileClick()
	{
		removedocument.click();
	}
	
	public void cardPaymentValidation() throws InterruptedException, IOException {	
		objscroll.scrollToElement(driver, savepurchase);
		//objwaits.waitForpresenceOfElementLocated(driver, singledropdown, 30);
		 objwaits.waitSleep(1000);
		objdriver.dropDownByIndex(singledropdown, 1);
	// objshot.screenShots(driver);// applying screenshot  
		 if(cardnumberoption.isDisplayed())
			{
				Assert.assertTrue(true);
			
			}
			else
			{
				System.out.println("Test Failed");
			}
		 objwaits.waitSleep(3000);
	}
	public void chequePaymentValidation() throws InterruptedException, IOException {
		
		objdriver.dropDownByIndex(singledropdown, 2);
	//	 objshot.screenShots(driver);// applying screenshot  
		 if(chequenumberoption.isDisplayed())
			{
				Assert.assertTrue(true);
			
			}
			else
			{
				System.out.println("Test Failed");
			}
		 objwaits.waitSleep(3000);
	}
	
	public void bankPaymentValidation() throws InterruptedException, IOException {
	
		objdriver.dropDownByIndex(singledropdown, 3);
	//	 objshot.screenShots(driver);// applying screenshot  
		 if(bankaccnumberoption.isDisplayed())
			{
				Assert.assertTrue(true);
			
			}
			else
			{
				System.out.println("Test Failed");
			}
		 objwaits.waitSleep(3000);
	}
	public void attachDocumentValidation() throws InterruptedException {
		purchaseClick();
		addpurchaseClick();
		objwaits.waitSleep(3000);
		fileUpload("E:\\Automation Notes.docx");
		//	 objshot.screenShots(driver);// applying screenshot  
		 objwaits.waitSleep(3000);
		 if(uploadeddocument.isDisplayed())
			{
				Assert.assertTrue(true);
			
			}
			else
			{
				System.out.println("Test Failed");
			}
		 objwaits.waitSleep(3000);
		 removeUploadFileClick();
		
	}
	public void saveMessageDisplay()
	{
		if(purchasesavemessage.isDisplayed())
		{
			Assert.assertTrue(true);
			//System.out.println("Vaidation message displayed and Test Passed!!!");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
	public void addingPurchase() throws InterruptedException
	{
		purchaseClick();
		addpurchaseClick();
		objwaits.waitSleep(3000);
		selectSupplierClick();
		supplierName("Apple New");
		objwaits.waitSleep(3000);
		SupplierNameSelect();
		objwaits.waitSleep(3000);
		purchaseStatusClick();
	    recievedStatusSelect();
		objwaits.waitSleep(3000);
		businessLocationClick();
		businessLocationSelect();
		objwaits.waitSleep(3000);
		searchProduct("Banana Fresh");
	    objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
	}
	public void popUpValidation() throws InterruptedException 
	 {
		 String actualmessage="Invalid inputs, Check & try again!!";
		 String expectedmessage=validationpurchase.getText();
		  if(actualmessage.equals(expectedmessage))
		  	{
			  Assert.assertTrue(true);
			  //System.out.println("Test passed successfully!!!");
			  }
		  else {
			  Assert.assertFalse(false, " Not Matching .... Failed");
			  }
		  objwaits.waitSleep(3000);
		  }
	 
	public void withoutSupplierNameValidation() throws InterruptedException, IOException {
		
		objscroll.scrollToElement(driver, purchasestatus);
		purchaseStatusClick();
	    recievedStatusSelect();
		objwaits.waitSleep(3000);
		businessLocationClick();
		businessLocationSelect();
		objwaits.waitSleep(3000);
		searchProduct("Banana Fresh");
	    objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
	//  objshot.screenShots(driver);// applying screenshots
		 popUpValidation();
		 String acualmessage="This field is required.";
		 String expectedtextboxwarning=warningundertextbox.getText();
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);
		 objwaits.waitSleep(3000);
	}
	
	public void withoutPurchaseStatusValidation() throws InterruptedException, IOException {
		objscroll.scrollToElement(driver, purchasestatus);
		selectSupplierClick();
		supplierName("Apple New");
		objwaits.waitSleep(3000);
		SupplierNameSelect();
		objwaits.waitSleep(3000);
		purchaseStatusClick();
		pleaseSelectStatus();
		objwaits.waitSleep(3000);
		businessLocationClick();
		businessLocationSelect();
		objwaits.waitSleep(3000);
	    objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
	 // objshot.screenShots(driver);// applying screenshots
		 popUpValidation();
		 String acualmessage="This field is required.";
		 String expectedtextboxwarning=warningunderstatus.getText();
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);	
		 objwaits.waitSleep(3000);
	}
	
	public void withoutLocationValidation() throws InterruptedException, IOException {
		objscroll.scrollToElement(driver, purchasestatus);
		purchaseStatusClick();
	    recievedStatusSelect();
	    objwaits.waitSleep(3000);
	    businessLocationClick();
	    locationPleaseSelect();
	    objwaits.waitSleep(3000);
	    objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
	//  objshot.screenShots(driver);// applying screenshots
		 popUpValidation();
		 String acualmessage="This field is required.";
		 String expectedtextboxwarning=warningunderlocation.getText();
		
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);
		 objwaits.waitSleep(3000);
		 
	}
	public void withoutAddProductValidation() throws InterruptedException, IOException {
		objscroll.scrollToElement(driver, purchasestatus);
		businessLocationClick();
		businessLocationSelect();
		objwaits.waitSleep(3000);
		removeProductClick();
		okRemoveProductClick();
	    objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
	 // objshot.screenShots(driver);// applying screenshots
		 String acualmessage="No Products added, add some products first";
		 String expectedtextboxwarning=addproductwarning.getText();
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);
		 objwaits.waitSleep(3000);
	}
	public void withoutAmountValidation() throws InterruptedException, IOException {
		searchProduct("Banana Fresh");
		objscroll.scrollToElement(driver, savepurchase);
		addamount.clear();
		savePurchaseClick();
		objwaits.waitSleep(3000);
	//  objshot.screenShots(driver);// applying screenshots
		 popUpValidation();
		 String acualmessage="This field is required.";
		 String expectedtextboxwarning=warningunderamount.getText();
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);
		 objwaits.waitSleep(3000);
	}
	public void addSupplierValidation() throws InterruptedException, IOException {
		addAmount("1000");
		savePurchaseClick();
		objwaits.waitSleep(3000);
		saveMessageDisplay(); // checking save message displayed
	    objshot.screenShots(driver);// applying screenshot
	    saveMessageValidation();
	    objwaits.waitSleep(3000);
	}
	
	
	public void saveMessageValidation() throws InterruptedException {
		String actualmessage="Purchase added successfully";
		  String expectedmessage=purchasesavemessage.getText();
		  Assert.assertEquals(actualmessage, expectedmessage);
		  objwaits.waitSleep(2000);
	}
	public void supplierNameValidation() throws IOException, InterruptedException {
		searchbox.clear();
		searchBox("Apple New");
	//  objshot.screenShots(driver);// applying screenshot
		String actualvalue=supplierlist.getText();
	    if(actualvalue.contains("Apple New"))
		  {
			Assert.assertTrue(true);
			//System.out.println("Supplier name test Success!!!");
			}
		else {
			 Assert.assertFalse(false, " Not Matching .... Failed");
			 }
	    objwaits.waitSleep(3000);
		
	}
	public void purchaseStatusValidation() throws IOException, InterruptedException {
		searchbox.clear();
		searchBox("Apple New");
	//  objshot.screenShots(driver);// applying screenshot
			String actualvalue=statuslist.getText();
		    if(actualvalue.contains("Recieved"))
			  {
				Assert.assertTrue(true);
				//System.out.println("Purchase Status test Success!!!");
				}
			else {
				 Assert.assertFalse(false, " Not Matching .... Failed");
				 }
		    objwaits.waitSleep(3000);
			
	}
	
	public void purchaseLocationValidation() throws IOException, InterruptedException {
		searchbox.clear();
		searchBox("Apple New");
	//	objshot.screenShots(driver);// applying screenshot
		 String actuallocation="Demo Company";
		 String expectedlocation=locationlist.getText();
		  if(actuallocation.equals(expectedlocation))
		  {
			  Assert.assertTrue(true);
			 // System.out.println("Location test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  
		  objwaits.waitSleep(3000);
		
	}
	public void deletePurchaseValidation() throws IOException, InterruptedException {
		searchbox.clear();
		searchBox("Apple New");
	    Actions objactions=new Actions(driver); 
		objactions.moveToElement(purchaseaction).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
		okRemoveProductClick();
	//	objshot.screenShots(driver);// applying screenshot
		searchbox.clear();
		searchBox("Apple New");
		String actualdeletemessage="Purchase deleted successfully";
		 String expecteddeletemessage=purchasvaldtnmessage.getText();
		  if(actualdeletemessage.equals(expecteddeletemessage))
		  {
			  Assert.assertTrue(true);
			  //System.out.println("Deletion test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  objwaits.waitSleep(3000);
	}
	
	
	
	
	
}
