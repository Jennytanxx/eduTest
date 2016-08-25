package com.youdao.sw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main{	
	     private AppiumDriver<AndroidElement> driver;	  
	
	     
	     @Before
	     public void setUp() throws Exception {
	     File classpathRoot = new File(System.getProperty("user.dir"));
	     File appDir = new File(classpathRoot, "app");
	     File app = new File(appDir, "sw-reader.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("deviceName", "MI 4LTE"); // ""
	     capabilities.setCapability("platformVersion", "6.0.1");
	     capabilities.setCapability("app", app.getAbsolutePath());
	     capabilities.setCapability("appPackage", "com.youdao.sw");
	     capabilities.setCapability("appActivity", ".MainActivity");
	     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     System.out.print("安装完成");
	    }

	    @After
	    public void tearDown() throws Exception {
	        driver.quit();
	    }

	    @Test
	    public void test() throws InterruptedException{
	    	
		    WebDriverWait wait = new WebDriverWait(driver, 60);
	    	System.out.print("Test");
	    /*	try{
	       		 if(driver.findElementById("catchtips")!= null)
	       		 driver.findElement(By.id("catchtips")).click();
	       	//等待一段时间
	        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       	 } catch (Exception  e){
	       		System.out.print("Not found");
	       	 }
	       finally{
	       */
	    		//点击进入资讯
	    	  		Information info1 = new Information();	  
	    	  		Book book1 = new Book();
	    	  		Yidu yidu = new Yidu();
	    	  		Mine mine = new Mine();
	    	  		System.out.print("运行到finally");
			  		yidu.firstDemo();			  		
			  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));		        
	    	  		info1.searchinfo();
	    	  		info1.information();
	    	    	info1.detailinfo();
	    	  		info1.shareinfo();  
	    	  		
	    	  	//等待一段时间
	    	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	  		driver.findElement(By.id("index_tab2")).click(); 
	    	  		book1.bookshell();
	    	  		book1.mybook();
	    	  		//等待一段时间
	    	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	  		driver.findElement(By.id("index_tab3")).click(); 
	    	  		mine.nologin();
	    	  		mine.login(); 	  		
	      	}
      
	}
//}
  
    
