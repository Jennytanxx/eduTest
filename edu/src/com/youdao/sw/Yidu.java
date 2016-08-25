package com.youdao.sw;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Appium Android Demo
 */
public class Yidu{
    private AppiumDriver<AndroidElement> driver;
    WebDriverWait wait = new WebDriverWait(driver, 60);
    Slide slide = new Slide();
    
    public void firstDemo() throws InterruptedException{
    	
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         WebElement a=driver.findElementById("whatsnew_viewpager");    
         slide.slideLeft(a); 
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         slide.slideLeft(a); 
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.findElementByClassName("android.widget.RelativeLayout").click();
        
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextBtn")));
         //选择话题     
         //选择难度
         driver.findElementById("nextBtn").click();
      
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("horizon_listview")));
         //选择话题
         driver.findElement(By.id("horizon_listview")).findElement(By.name("China")).click();
    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 driver.findElement(By.id("horizon_listview")).findElement(By.name("Lifestyle")).click();
    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 driver.findElement(By.id("horizon_listview")).findElement(By.name("US")).click();
      	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElement(By.id("horizon_listview")).findElement(By.name("Auto")).click();
     	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     	 driver.findElement(By.id("horizon_listview")).findElement(By.name("Books")).click();
     	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      	 //点击开始e读
    	 driver.findElement(By.name("开始e读")).click();           
      	 // 等待进入app
      	 //直到出现资讯的id
      	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
      	 //点击刷新资讯
         driver.findElementById("index_tab2").click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           //进入分级图书
         driver.findElementById("classBtn").click(); 
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topicList")));
         //选择一本图书     
         driver.findElementById("topicList").findElements(By.className("android.widget.RelativeLayout")).get(0).findElementById("horizon_listview").findElementsByClassName("android.widget.RelativeLayout").get(0).click();  
        //点击立即阅读
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
         //第一次，会出现提示，点击
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("catchtips").click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         //下滑屏幕
         WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
         slide.slideDown(b);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
         driver.findElementById("closeBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         //返回到热门图书
         driver.findElementById("setttingBtn").click();
         //返回到e读商城
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
         driver.findElementById("leftBtn").click();
         
         
         driver.findElementById("index_tab1").click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         System.out.print("运行到这里");
      
        //资讯页面进行收藏
        //找到第一个widget       
      //找到资讯所在地，点击收藏按钮             
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("saveBtn").click();
       
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	//资讯页面进入话题
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("label1").click();
     	
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	//从话题页面返回到资讯页面
    	driver.findElementById("setttingBtn").click();   

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  
       
    	
 //      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("webview")));
    //资讯页面进行收藏资讯 
        
   
    
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("catchtips").click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("closeBtn").click();
      	//向上滑动，翻看信息流
     	//
     	 WebElement d=driver.findElementById("tabhomepager");
     	 slide.slideUP(d);
     	 slide.slideUP(d);
     	 slide.slideUP(d);
     	 slide.slideUP(d);
         
    }

  

    
    
}
