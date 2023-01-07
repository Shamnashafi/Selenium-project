package pageelements;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ScreenShot;
import utilities.ScrollElement;
import utilities.Waits;

public class ProductPage {
	
	WebDriver driver;
	ScrollElement objscroll=new ScrollElement();
	Waits objwaits=new Waits();
	ScreenShot objshot=new ScreenShot();
	public ProductPage(WebDriver driver)
	{
		 this.driver = driver;
        PageFactory.initElements(driver, this);
       
    }
	
	@FindBy(xpath="//a[@id='tour_step5_menu']")
	public WebElement products;

	@FindBy(xpath="//*[@id=\"tour_step5\"]/ul/li[2]/a/i")
	public WebElement addproduct;
	
	@FindBy(id="name")
	public WebElement productname;

	@FindBy(xpath="//*[@id=\"product_add_form\"]/div[1]/div/div/div[2]/div/div/span[2]/button/i")
	public WebElement addsymbolbrand;
	
	@FindBy(xpath="//input[@class='form-control' and @placeholder='Brand name']")
	public WebElement addbrandname;
	
	@FindBy(xpath="//span[@id='select2-brand_id-container']")
	public WebElement addbrand;
	
	@FindBy(xpath="//ul[@id='select2-brand_id-results']/li[1]")
	public WebElement brandpleaseselect;
	
	@FindBy(xpath="//button[@class='btn btn-primary' and @type='submit']")
	public WebElement savebutton;
	
	@FindBy(xpath="//*[@id=\"select2-unit_id-container\"]")
	public WebElement unit;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[3]")
	public WebElement selectunitbox;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	public WebElement pleaseselectunit;
	
	@FindBy(xpath="//button[@class='btn btn-default bg-white btn-flat btn-modal' and @title='Add Unit']")
	public WebElement uniticonselect;
	
	@FindBy(xpath="//input[@id='actual_name']")
	public WebElement addunitname;
	
	@FindBy(xpath="//input[@id='short_name']")
	public WebElement addunitshortname;
	
	@FindBy(xpath="//select[@id='allow_decimal']")
	public WebElement addunitallowdecimal;
	
	@FindBy(xpath="//select[@id='allow_decimal']/option[2]")
	public WebElement unitdecimalyesselect;
	
	@FindBy(xpath="//*[@id=\"quick_add_unit_form\"]/div[3]/button[1]")
	public WebElement uniticonsave;
	
	@FindBy(id="select2-category_id-container")
	public WebElement category;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[4]")
	public WebElement selectcategory;
	
	@FindBy(id="sku")
	public WebElement sku;
	
	@FindBy(id="select2-barcode_type-container")
	public WebElement barcodetype;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[2]")
	public WebElement barcodeselect;
	
	@FindBy(id="alert_quantity")
	public WebElement alertquantity;
	
	@FindBy(xpath="//div[@class='btn-group']/button[4]")
	public WebElement lastsavebutton;
	
	@FindBy(id="single_dpp")
	public WebElement exctax;
	
	@FindBy(xpath="//div[@id='product_table_filter']/label/input")
	public WebElement searchicon;
	
	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td[3]")
	public WebElement productnamelisted;
	
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	public WebElement savemessage;
	
	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td[4]/div/span")
	public WebElement selingprice;

	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td[7]")
	public WebElement categorylisted;
	
	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td[9]")
	public WebElement brandlisted;
	
	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td[12]/div/button")
	public WebElement actionsbutton;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[4]/a")
	public WebElement deleteicon;
	
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[2]/button")
	public WebElement okdeleteicon;
	
	@FindBy(xpath="//table[@id='product_table']/tbody/tr[1]/td")
	public WebElement messageafterdelete;
	
	@FindBy(xpath="//div[@id='toast-container']/div/div")
	public WebElement validationmessage; // leaving mandatory field 
	
	@FindBy(id="name-error")
	public WebElement undertextboxwarning; // warning under text box -leaving mandatory field
	
	@FindBy(xpath="//*[@id=\"unit_id-error\"]")
	public WebElement underunitboxwarning;
	
	@FindBy(id="alert_quantity-error")
	public WebElement underquantityboxwarning;
	
	@FindBy(id="single_dpp-error")
	public WebElement undertaxboxwarning;
	
	@FindBy(xpath="//div[@id='toast-container']/div/div")
	public WebElement brandaddsuccessmsg;
	
	@FindBy(xpath="//input[@id='upload_image']")
	public WebElement fileuploadbox;
	
	@FindBy(xpath="//*[@id=\"product_add_form\"]/div[1]/div/div/div[14]/div/div/div[3]/div[1]")
	public WebElement uploadedfile;
	
	@FindBy(xpath="//*[@id=\"product_add_form\"]/div[1]/div/div/div[14]/div/div/div[3]/div[2]/button[1]/span")
	public WebElement removeuploadfile;
	
	@FindBy(xpath="//span[@id='select2-type-container']")
	public WebElement producttype;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[2]")
	public WebElement variableproducttype;
	
	@FindBy(xpath="//button[@id='add_variation']")
	public WebElement adddvariation;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	public WebElement singleproducttype;
	
	public void productClick()
	{
		products.click();
	}
	public void addProductClick()
	{
		addproduct.click();
	}
	public void addProductname(String pname)
	{
		productname.sendKeys(pname);
	}
	
	public void addBrandSymbolClick()
	{
		addsymbolbrand.click();
	}
	public void addBrandName(String bname)
	{
		addbrandname.sendKeys(bname);
	}
	public void addBrandClick()
	{
		addbrand.click();
	}
	public void brandPleaseSelectClick()
	{
		brandpleaseselect.click();
	}
	public void saveButtonClick()
	{
		savebutton.click();
	}

	public void unitClick()
	{
		unit.click();
	}
	public void selectUnitClick()
	{
		selectunitbox.click();
	}
	public void pleaseSelectUnitClick()
	{
		pleaseselectunit.click();
	}
	public void unitIconClick()
	{
		uniticonselect.click();
	}
	public void addUnitName(String uname)
	{
		addunitname.sendKeys(uname);
	}
	public void addUnitShortName(String usname)
	{
		addunitshortname.sendKeys(usname);
	}
	public void unitDecimalIconClick()
	{
		addunitallowdecimal.click();
	}
	public void unitYesDecimalClick()
	{
		unitdecimalyesselect.click();
	}
	public void unitIconSaveClick()
	{
		uniticonsave.click();
	}

	public void categoryClick()
	{
		category.click();
	}
	public void selectCategoryClick()
	{
		selectcategory.click();
	}
	public void skuValues(String skuvalue)
	{
		sku.sendKeys(skuvalue);
	}
	public void barCodeClick()
	{
		barcodetype.click();
	}
	public void barCodeSelect()
	{
		barcodeselect.click();
	}
	public void alertQuantity(String alertvalue)
	{
		alertquantity.sendKeys(alertvalue);
	}
	public void excTaxValues(String excvalue)
	{
		exctax.sendKeys(excvalue);
	}
	public void lastSaveOption()
	{
		lastsavebutton.click();
	}
	public void searchProduct(String productname)
	{
		searchicon.sendKeys(productname);
	}
	public void actionsClick()
	{
	 actionsbutton.click();
	}
	public void deleteClick()
	{
	 deleteicon.click();
	}
	public void okdeleteingClick()
	{
	 okdeleteicon.click();
	}
	public void removeUploadFileClick()
	{
		removeuploadfile.click();
	}
	public void fileUpload(String path)
	{
		fileuploadbox.sendKeys(path);
	}
	public void productTypeClick()
	{
		producttype.click();
	}
	public void productVariableClick()
	{
		variableproducttype.click();
	}
	public void singleProductTypeClick()
	{
		singleproducttype.click();
	}
	 public void saveMessageDisplay()
		{
			if(savemessage.isDisplayed())
			{
				Assert.assertTrue(true);
			}
			else
			{
				System.out.println("Test Failed");
			}
			
		}
	 
	 public void variableProductTypeValidation() throws InterruptedException, IOException {
		
		 objscroll.scrollToElement(driver, lastsavebutton);
		 productTypeClick();
		 productVariableClick();
	//   objshot.screenShots(driver);// applying screenshot
		 objwaits.waitSleep(2000);
		 if(adddvariation.isDisplayed())
			{
				Assert.assertTrue(true);
			}
			else
			{
				System.out.println("Test Failed");
			}
		// objwaits.waitSleep(2000);
		 //productTypeClick();
		 //singleProductTypeClick();
		 driver.navigate().refresh();
		 objwaits.waitSleep(2000);
	 }
	 public void addingProduct() throws InterruptedException {
		 productClick();
		 addProductClick();
		 addProductname("0000 Apple");
		 addBrandSymbolClick();
		 addBrandName("Berry Fruit");
		 saveButtonClick();
		 unitClick();
		 selectUnitClick();
		 categoryClick();
		 selectCategoryClick();
		 barCodeClick();
		 barCodeSelect();
		 alertQuantity("250");
		 objscroll.scrollToElement(driver, lastsavebutton);
		 excTaxValues("20");
		 lastSaveOption();
		 
	 }
	 public void addingBrandUsingIconValidation() throws InterruptedException, IOException {
		 
		 addBrandSymbolClick();
		 objwaits.waitSleep(2000);
		 addBrandName("Berry");
		 objwaits.waitSleep(2000);
		 saveButtonClick();
		// objshot.screenShots(driver);// applying screenshot
		 String actualmessage="Brand added successfully";
		 String expectedmessage=brandaddsuccessmsg.getText();
		  Assert.assertEquals(actualmessage, expectedmessage);
		  addBrandClick();
		  brandPleaseSelectClick();
		  objwaits.waitSleep(3000);
	 }
	 public void addingUnitUsingIconValidation() throws InterruptedException, IOException {
		// driver.navigate().refresh();
		// objscroll.scrollToElement(driver, productname);
		 productClick();
		 addProductClick();
		 unitIconClick();
		 addUnitName("Boxes");
		 objwaits.waitSleep(2000);
		 addUnitShortName("New Boxes");
		 objwaits.waitSleep(2000);
		 unitDecimalIconClick();
		 objwaits.waitSleep(2000);
		 unitYesDecimalClick();
	//	 objshot.screenShots(driver);// applying screenshot 
		 unitIconSaveClick();
//		 objshot.screenShots(driver);// applying screenshot 
		 String actualmessage="Unit added successfully";
		 String expectedmessage=brandaddsuccessmsg.getText(); 
		  Assert.assertEquals(actualmessage, expectedmessage);
		  objwaits.waitSleep(3000);
		  unitClick();
		  pleaseSelectUnitClick();
		  objwaits.waitSleep(2000);
	 }
	 
	 public void uploadImageValidation() throws IOException, InterruptedException {
		 fileUpload("E:\\images.png");
		// driver.findElement(By.xpath("//*[@id=\"product_add_form\"]/div[1]/div/div/div[14]/div/div/div[3]/div[1]")).sendKeys("E:\\images.png"); 
	//	 objshot.screenShots(driver);// applying screenshot  
		 objwaits.waitSleep(3000);
		 if(uploadedfile.isDisplayed())
			{
				Assert.assertTrue(true);
			
			}
			else
			{
				System.out.println("Test Failed");
			}
		 
		 removeUploadFileClick();
		 objwaits.waitSleep(3000);
	 }
	 public void saveMessageValidation() throws InterruptedException {
		  String actualmessage="Product added successfully";
		  String expectedmessage=savemessage.getText();
		  Assert.assertEquals(actualmessage, expectedmessage);
		  objwaits.waitSleep(3000);
	 }
	 
	 public void addProductValidation() throws IOException, InterruptedException {
		 excTaxValues("20");
		 lastSaveOption();
		 saveMessageDisplay(); // checking save message displayed
		// objshot.screenShots(driver);// applying screenshot
		 saveMessageValidation();
	 }
	 
	 public void productNameValidation(String searchvalue) throws IOException, InterruptedException {
		searchProduct(searchvalue);
		//objshot.screenShots(driver);// applying screenshot
	    String actualvalue=productnamelisted.getText();
	    if(actualvalue.contains("0000 Apple"))
		  {
			Assert.assertTrue(true);
		  }
		else {
			 Assert.assertFalse(false, " Not Matching .... Failed");
			 }
	    objwaits.waitSleep(3000);
	 }
	 public void sellingPriceValidation(String searchvalue, String actualvalue) throws IOException, InterruptedException {
		 searchicon.clear();
		 searchProduct(searchvalue);
	     //objshot.screenShots(driver);// applying screenshot
		  String expectedprice=selingprice.getText();
		  if(actualvalue.equals(expectedprice))
		  {
			  Assert.assertTrue(true);
			//  System.out.println("Selling price test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  
		  objwaits.waitSleep(3000);
	 }
	 
	 public void categoryValidation(String searchvalue, String actualvalue) throws IOException, InterruptedException {
		 searchicon.clear();
		 searchProduct(searchvalue);
	     objshot.screenShots(driver);// applying screenshot
		  String expectedprice=categorylisted.getText();
		  if(actualvalue.equals(expectedprice))
		  {
			  Assert.assertTrue(true);
			 // System.out.println("Category test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  
		  objwaits.waitSleep(3000);
	 }
	 public void brandNameValidation(String searchvalue, String actualvalue) throws IOException, InterruptedException {
		 searchicon.clear();
		 searchProduct(searchvalue);
	     objshot.screenShots(driver);// applying screenshot
		  String expectedprice=brandlisted.getText();
		  
		  if(actualvalue.equals(expectedprice))
		  {
			  Assert.assertTrue(true);
			//  System.out.println("Brand name test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  
		  objwaits.waitSleep(3000);
	 }
	 
	 public void deleteProductValidation(String searchvalue, String actualvalue) throws InterruptedException, IOException {
		 searchicon.clear();
		 searchProduct(searchvalue);
		 Actions objactions=new Actions(driver); 
		 objactions.moveToElement(actionsbutton).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
		// actionsClick();
		// objwaits.waitSleep(1000);
		//deleteClick();
		 objwaits.waitSleep(1000);
		 okdeleteingClick();
		 objwaits.waitSleep(3000);
	//   objshot.screenShots(driver);// applying screenshot
		 searchicon.clear();
		 searchProduct(searchvalue);
		  String expectedmessage=messageafterdelete.getText();
		  if(actualvalue.equals(expectedmessage))
		  {
			  Assert.assertTrue(true);
			//  System.out.println("Deletion test Success!!!");
		  }
		  else
		  {
			  Assert.assertTrue(false);
			  System.out.println("Test FAILED!!!!");
		  }
		  objwaits.waitSleep(3000);
		 
	 }
	 public void popUpValidation() throws InterruptedException 
	 {
		 String actualmessage="Invalid inputs, Check & try again!!";
		 String expectedmessage=validationmessage.getText();
		  if(actualmessage.equals(expectedmessage))
		  	{
			  Assert.assertTrue(true);
			 // System.out.println("Test passed successfully!!!");
			  }
		  else {
			  Assert.assertFalse(false, " Not Matching .... Failed");
			  }
		  objwaits.waitSleep(3000);
		  }
	 
	 public void withoutProductNameValidation(String quantity, String taxvalue, String acualmessage) throws InterruptedException, IOException {
		// driver.navigate().refresh();
		 addBrandSymbolClick();
		 addBrandName("Berry Fruit");
		 saveButtonClick();
		 objwaits.waitSleep(2000);
		 unitClick();
		 selectUnitClick();
		 categoryClick();
		 selectCategoryClick();
		 alertQuantity(quantity);
		  objscroll.scrollToElement(driver, lastsavebutton);
		  excTaxValues(taxvalue);
		  Thread.sleep(2000);
		  lastSaveOption();
		  objwaits.waitSleep(3000);
		// objshot.screenShots(driver);// applying screenshots
		  popUpValidation();
		  String expectedtextboxwarning=undertextboxwarning.getText();
		 Assert.assertEquals(acualmessage, expectedtextboxwarning);
		  }
	 public void withoutUnitValidation(String pname, String unitboxwarning) throws InterruptedException, IOException {
		// objscroll.scrollToElement(driver, productname);
		  addProductname(pname);
		  unitClick();
		  pleaseSelectUnitClick();
		  objscroll.scrollToElement(driver, lastsavebutton);
		  objwaits.waitSleep(3000);
		  lastSaveOption();
		  objwaits.waitSleep(3000);
		//objshot.screenShots(driver);// applying screenshots
		  popUpValidation(); // verifying validation
		  String expectedunitboxwarning=underunitboxwarning.getText();
		  Assert.assertEquals(unitboxwarning, expectedunitboxwarning);
		//  System.out.println("Unit field blank - Test Passed");
	 }
	 public void withoutQuantityValidation(String taxvalue, String quantityboxwarning ) throws InterruptedException  {
		 
		  objscroll.scrollToElement(driver,productname); 
		  unitClick();
		  selectUnitClick();
		  categoryClick();
		  selectCategoryClick();
		  alertquantity.clear();
		  objscroll.scrollToElement(driver, lastsavebutton);
		  excTaxValues(taxvalue);
		  objwaits.waitSleep(3000);
		  lastSaveOption();
		  objwaits.waitSleep(3000);
		//objshot.screenShots(driver);// applying screenshots
		  popUpValidation(); // verifying validation
		  String expectedquantityboxwarning=underquantityboxwarning.getText();
		 
		  Assert.assertEquals(quantityboxwarning, expectedquantityboxwarning);
		 // System.out.println("Alert quantity field blank-Test Passed");
		  
	 }
	 public void withoutTaxValidation(String quantity, String taxboxwarning ) throws InterruptedException, IOException {
		 objscroll.scrollToElement(driver,productname);
		 alertQuantity("250");
		 objscroll.scrollToElement(driver, lastsavebutton);
		 objwaits.waitSleep(3000);
		 exctax.clear();
		 lastSaveOption();
		 objwaits.waitSleep(3000);
		 objshot.screenShots(driver);// applying screenshots
		 popUpValidation(); // verifying validation
		 String expectedtaxboxwarning=undertaxboxwarning.getText();
		 Assert.assertEquals(taxboxwarning, expectedtaxboxwarning);
		// System.out.println(" Tax field blank - Test Passed");
		  }
	  
	 
}
