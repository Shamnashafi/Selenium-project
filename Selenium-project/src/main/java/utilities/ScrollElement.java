package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollElement {
	
	 public void scrollToElement(WebDriver driver,WebElement element) throws InterruptedException
	  { 
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); 	
		  Thread.sleep(1000); 
	  } 	      
	  public void scrollpixel(int a ,int b, WebDriver driver) throws InterruptedException 
	  { 	
	      ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy("+ a + "," + b + ")"); 
	  }
}
