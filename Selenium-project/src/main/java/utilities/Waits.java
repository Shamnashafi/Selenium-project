package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	 public WebElement waitForElementTobeVisible(WebDriver driver, WebElement elementToBeLoaded, int Time) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time));
	        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	        return element;
	    }

	    public WebElement waitForElemntTobeClickable(WebDriver driver, WebElement elementToBeLoaded, int Time) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	        return element;
	    }
	    
	    
	    public WebElement waitForpresenceOfElementLocated(WebDriver driver, WebElement elementToBePresent, int Time) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time));
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) elementToBePresent));
	        return element;
	    }
	    public Boolean waitForinvisibilityOfElementLocated(WebDriver driver, WebElement elementToBeInvisible, int Time) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time));
	        Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated((By) elementToBeInvisible));
	        return element;
	    }
	    public void waitSleep(long value) throws InterruptedException {
	    	
	    	Thread.sleep(value);
	    }
	   
}