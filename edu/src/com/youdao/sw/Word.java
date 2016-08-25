package com.youdao.sw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Word {
	  private static AppiumDriver<AndroidElement> driver;
	  static WebDriverWait wait = new WebDriverWait(driver, 60);
	  public  void wordtranslate(){
			//点击任意单词
			//  WebElement el=driver.findElementByClassName("android.webkit.WebView").findElementsByClassName("android.view.View").get(2);	         
		 	WebElement el=driver.findElementByClassName("android.webkit.WebView");	          
		 	TouchAction action = new TouchAction(driver);	
			action.press(el,500,500).release().perform();	             
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
		    WebElement words=driver.findElementById("wordTranslateBar");
		    words.findElement(By.id("favorBtn")).click();
		    //美式发音
		    words.findElement(By.id("readBtn")).click();
		    //英式发音
		    words.findElement(By.id("readUKBtn")).click();
		    action.press(el,10,10).release().perform();
	  }

     
	
}
