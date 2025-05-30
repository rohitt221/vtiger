package com.eva.vtiger.util;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Webutil1 {
	 private WebDriver driver= null;
	
	 public WebDriver getdriver() {
		 return driver;
	 }
	 public void setdriver(WebDriver inidriver) {
		driver=inidriver; 
	 }
	 
	 
public WebElement searchElement( String xpath) {
	WebElement we = null;
try {
	 we = driver.findElement(By.xpath(xpath));
}catch(Exception e) {
	driver.findElement(By.xpath(xpath));
	throw e;
	
}return we;

}
public void type(WebElement we,String name ) {
	we.sendKeys(name);
	
}
public void click(WebElement we) {
	we.click();
}
public void save(WebElement we) {
	we.click();
}
public void alert() {
	Alert objalert = driver.switchTo().alert();
	objalert.dismiss();
}
public void loginButtonEnable(WebElement we) {
	boolean torf = we.isEnabled();
	if(torf==true) {
		System.out.println("the element is enable "+torf);
	}else {
		System.out.println("the element is not  enable "+torf);
	}
}
public void selectDropDown(WebElement we,String name) {
	Select select = new Select(we);
	select.selectByValue(name);
	System.out.println("Title is selected is succesefully ");
}
public void impliciteWait(int second) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
}
public void  rightClick(WebDriver driver, WebElement we) {
	Actions actob=new Actions(driver);
	actob.contextClick(we).build().perform();
	
}


 
 public void ScreenShot(WebDriver driver) throws IOException {
	 TakesScreenshot tss=	(TakesScreenshot)driver;
 	File sourceOfImage = tss.getScreenshotAs(OutputType.FILE);
 	File toimage = new File("myimage.png");
 	try {
		Files.copy(sourceOfImage, toimage);
	} catch (IOException e) {
		
			Files.copy(sourceOfImage, toimage);
		
		e.printStackTrace();
	}
 }
 public void clickAndHold(WebElement we) {
	  Actions clickhold = new Actions(driver) ;
	  clickhold.clickAndHold(we);
 }
public void doubleClickWithAction(WebElement we) {
	 
 Actions act= new Actions(driver);
 act.doubleClick(we).build().perform();
 
 }
public void ScollTo(WebDriver driver,WebElement we) {
	Actions act= new Actions(driver);
	act.scrollToElement(we).build().perform();
} 
public void MoveToElement(WebDriver driver,WebElement we) {
	Actions act= new Actions(driver);
	act.moveToElement(we).build().perform();
}
public void openUrl(String url) {
 try {
 driver.get(url);
 System.out.println(url+" opened");
 }catch(Exception e) {
	 throw e;
 }
 
}


public String getInnerText(WebElement we) {
 String innerText=we.getText();
 System.out.println(innerText);
 return innerText;
}


public WebDriver launchBrowser(String browserName) {

 if(browserName.equalsIgnoreCase("Chrome")) {
	 driver=new ChromeDriver();
	 System.out.println("Chrome Browser Launched");
 }else if(browserName.equalsIgnoreCase("firefox")) {
	 driver = new FirefoxDriver();
	 System.out.println("Firefox Browser Launched");

 }else if(browserName.equalsIgnoreCase("edge")) {
	 driver = new EdgeDriver();
	 System.out.println("Edge Browser Launched");
	
 }else System.out.println("the browser not launch");
 return driver;
 
 
}
public void clickAllElements(String xpath) {
	List<WebElement> list=driver.findElements(By.xpath(xpath));
	for(WebElement we : list) {
		we.click();
	}
}
  //  getAllElementsText("//a");
public List<String> getAllElementsText(String xpath) {
	List<WebElement> list=driver.findElements(By.xpath(xpath));
	List<String> elementsTextList=new ArrayList<String>();
	for(WebElement we : list) {
		String innerText=we.getText();
		elementsTextList.add(innerText);
		System.out.println(elementsTextList);
	}
	return elementsTextList;
}

public void switchToFrame(WebElement weFrame) {
	driver.switchTo().frame(weFrame);
}


public void staticWait(int timeInSeconds) {
	try {
		Thread.sleep(timeInSeconds*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}
public void type( WebElement we, String value, String elementName) {
	try {
		we.sendKeys(value);
		System.out.println(value+" entered in "+elementName+"textbox successfully");
	}catch(ElementNotInteractableException e) {

		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='"+value+"'", we);
		System.out.println(value+" entered in "+elementName+" textbox successfully by javascript");

	}catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
}

public void click( WebElement we, String elementName) {
	try {
		we.click();
		System.out.println(elementName+" clicked successfully");
	}catch(ElementClickInterceptedException e) {
		jsClick( we);
	}catch(ElementNotInteractableException e) {
		jsClick(we);
	}catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
}

public void  rightClick( WebElement we, String elmentName) {
	try {

		Actions actob=new Actions(driver);
		actob.contextClick(we).build().perform();
	    System.out.println(elmentName+" right click performed successfully");
	}catch(ElementNotInteractableException e) {
		
	}catch(StaleElementReferenceException e) {
		
	}catch (Exception e) {
		
	}

}

public void switchToWindowByTitle( String pageTitle) {
	
  Set<String> handleValues =	driver.getWindowHandles();
	for(String handleValue : handleValues) {
		driver.switchTo().window(handleValue);
		String currentWindowTitle=driver.getTitle();
		if(currentWindowTitle.equalsIgnoreCase(pageTitle)) {
			System.out.println("Focus switched in window - its title -"+pageTitle);
			break;
		}
	}
	
}


public void switchToWindowByURL( String pageUrl) {
	
	  Set<String> handleValues =	driver.getWindowHandles();
		for(String handleValue : handleValues) {
			driver.switchTo().window(handleValue);
			String currentWindowTitle=driver.getCurrentUrl();
			if(currentWindowTitle.equalsIgnoreCase(pageUrl)) {
				System.out.println("Focus switched to window - its url -"+pageUrl);
				break;
			}
		}
		
	}


public void selectTextFromListBox(WebElement we, String setectText) {
	try {
		Select select=new Select(we);
		select.selectByVisibleText(setectText);
	}catch(Exception e) {

	}
}

public void selectTextFromListBoxByIndex(WebElement we, int index) {
	try {
		Select select=new Select(we);
		select.selectByIndex(index);
	}catch(Exception e) {

	}
}


public void takesScreenshot( String imageName)  {
   
	TakesScreenshot  tss=(TakesScreenshot)driver;
     File sourceFile=tss.getScreenshotAs(OutputType.FILE);
     File destination= new File("screenshots\\"+imageName+"Image.png");
   
	try {
		Files.copy(sourceFile, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}



public void doubleClick( WebElement we) {

	try{
		Actions act= new Actions(driver);
		act.doubleClick(we).build().perform();
	}catch(Exception e) {
		throw e;
	}
}

public void ScollToElement( WebElement we) {
	try {
	Actions act= new Actions(driver);
	act.scrollToElement(we).build().perform();
	System.out.println("page is scrolled to element successfully");
	}catch(Exception e) {
		throw e;
	}
} 
public void mouseOver( WebElement we) {
	try {
	Actions act= new Actions(driver);
	act.moveToElement(we).build().perform();
	}catch(Exception e) {
		throw e;
	}
}



/* this method will return innertext of element
 * parameters - WebELement Object
 * return type -  String\
 * Author -  rohit yadav
 * Modified Date - 
 * Modified By -   */




public String getAttribute(WebElement we, String attributeName) {
	String attrValue=null;
	try {
	 attrValue=we.getAttribute(attributeName);
	}catch(Exception e) {
		
	}return attrValue;
}

public String getPageTitle() {
	String title=driver.getTitle();
	return title;
}

public String getURL() {
	String url=null;
	try {
	 url=driver.getCurrentUrl();
	}catch(Exception e ) {
		throw e ;
	}return url;
}

public void maximize() {
	try {
	driver.manage().window().maximize();
	}catch(Exception  e) {
		throw e;
		
	}
}

public void closeAllBrowsers() {
	try {
	driver.quit();
	}catch(Exception e) {
		throw e;
	}
}

public void closeBrowser() {
	try {
	driver.close();
	}catch(Exception e) {
		throw e;
	}
}

public void setSize(int width, int height) {
	try {
	
	Serializable dim=new Dimension(width, height);
	driver.manage().window().setSize((org.openqa.selenium.Dimension) dim);
}catch(Exception e) {
	throw e;
}
}


public void jsClick( WebElement we) {
	try {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", we);
	}catch(Exception e) {
		throw e;
	}
}

public void jsType( WebElement we, String value) {
	JavascriptExecutor jse;
	try {
		
		 jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='"+value+"'", we);
		
	}catch(Exception e) {
		throw e;
	}
}

public void jsScrollByAmount(int x, int y) {
	try {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy("+x+", "+y+")");
	}catch(Exception e) {
		throw e;
	}
}

public void jsScrollToBottom() {
	try {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.body.scrollHeight");
	}catch(Exception e) {
		throw e;
	}
}

public void jsScrollToElement(WebElement we) {
	try {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].scrollIntoView(true);", we);
	}catch(Exception e) {
		throw e;
	}
}


public void windows(WebElement r) {
	try {
Set<String> allwindow =	driver.getWindowHandles();
for(String ram : allwindow) {
	driver.switchTo().window(ram);
String title =	driver.getTitle();
title.equalsIgnoreCase(title);
break;
}
}catch(Exception e) {
	throw e;
}
}
}