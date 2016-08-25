package com.youdao.sw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book {
	 private AppiumDriver<AndroidElement> driver;	    
	 WebDriverWait wait = new WebDriverWait(driver, 60);
	 Slide slide = new Slide();
	 public void bookshell() throws InterruptedException {

		     //点击进入e读商城	 
	         driver.findElementById("allTabText").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	           //搜索图书
	            //点击搜索、输入关键字
	       	 driver.findElementById("queryBtn").click();
	      // 	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         	//点击搜索
	         driver.findElementById("queryText").sendKeys("heart");
	     //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         driver.findElementByName("搜索");
	         	//返回
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	         driver.findElementById("leftBtn").click();        
	         
	         /*进入分级图书*/
	         driver.findElementById("classBtn").click(); 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topicList")));
	         //进入初级
	         driver.findElementById("topicList").findElements(By.className("android.widget.RelativeLayout")).get(1).findElementById("item").click();
	         //选择一本图书
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
	         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	  
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         //点击收藏
	         driver.findElementById("saveBtn").click();
	         //点击立即阅读
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	         driver.findElementById("readBtn").click();
	         //下滑屏幕
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	         driver.findElementById("closeBtn").click();
	      //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("setttingBtn")));
	       //返回到初级
	         driver.findElementById("setttingBtn").click();
	          //返回到分级图书 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
	         driver.findElementById("leftBtn").click();
	         //返回到e读商城
	     //    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.name("分级图书")));
	   //      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         driver.findElementById("leftBtn").click();
	     
	         
	         /*进入热门图书*/
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hotBtn")));
	         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	         driver.findElementById("hotBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	
	         //点击收藏
	         driver.findElementById("saveBtn").click();
	         //点击立即阅读
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	         driver.findElementById("readBtn").click();
	         
	         //下滑屏幕
	         WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
	         slide.slideDown(a);
	         
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	         driver.findElementById("closeBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         //返回到热门图书
	         driver.findElementById("setttingBtn").click();
	         //返回到e读商城
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
	         driver.findElementById("leftBtn").click();
	     

	         //进入e读商场	      
	         driver.findElementById("allTabText").click();	        
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	       	//点击进入精品分类
	         driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("item").click();
	        //等待10s
	       	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
	         //返回e读商城	    
	       	 driver.findElementById("leftBtn").click();	       
	         //等待10s
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	        //点击一本图书，进入图书详情页面
	         driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementsById("horizon_listview").get(0).click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	        //点击收藏
	         driver.findElementById("saveBtn").click();
	         //点击立即阅读
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	         driver.findElementById("readBtn").click();
	        //等待一段时间
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  	       
	       	       
	         //点击一个单词
	      
	       
	         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
	         TouchAction action = new TouchAction(driver);	
		     action.press(el,20,20).release().perform();	
		     //出现查词界面
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	         WebElement words=driver.findElementById("wordTranslateBar");
	       	 words.findElement(By.id("favorBtn")).click();
	        //美式发音
	         words.findElement(By.id("readBtn")).click();
	        //英式发音
	         words.findElement(By.id("readUKBtn")).click();
	         
	         action.press(el,10,10).release().perform();
	         /*翻页*/
          /*下滑*/
	         
	         //回到图书界面
	      //   driver.tap(0, 40, 160, 1);
	          //下拉菜单
	         //{
	      //   driver.notify();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	          //}
	             //返回
	         driver.findElementById("closeBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	             //返回
	         driver.findElementById("setttingBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         
	  	 
	               
	       }
	 public void mybook() throws InterruptedException {
	    	int i=0;  	
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab2")));
		    //点击进入图书界面
		    driver.findElementById("index_tab2").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //进入e读商场	      
	        driver.findElementById("allTabText").click();	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	  
	        //收藏图书	       	        
	     //   for(i=0;i<2;i++)
	      //  {
	        	driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(1).findElementsById("horizon_listview").get(0).click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	  	        //点击收藏
	  	        driver.findElementById("saveBtn").click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	  	        //返回
	            driver.findElementById("setttingBtn").click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	
	    //    }	        	     	    	    		        
	         //进入我的书架
	        driver.findElementById("lastestTabText").click();       
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	      
	        //搜索图书
	        //点击搜索
	        driver.findElementById("queryBtn").click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        //输入关键字
	        driver.findElementById("queryText").sendKeys("heart");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        //返回
	        driver.findElementById("leftBtn").click();    
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
	        //点击一本图书，进入图书详情页面	   
	        driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).click();     	
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	        //点开提示页面
	        //需要手动执行
	          
	        
	        //需要手动执行
	        	 //出现查词界面
		  //查词
		      
	         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
	         TouchAction action = new TouchAction(driver);	
		     action.press(el,20,20).release().perform();	             
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	         WebElement words=driver.findElementById("wordTranslateBar");
	       	 words.findElement(By.id("favorBtn")).click();
	        //美式发音
	         words.findElement(By.id("readBtn")).click();
	        //英式发音
	         words.findElement(By.id("readUKBtn")).click();
	         action.press(el,10,10).release().perform();
	         
	         //下滑屏幕
		     WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
		  
		     for (i=0;i<10;i++)
		    {		   		    	
		    	 slide.slideLeft(a); 
		    	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		    	  
		    }
		     for (i=5;i>0;i--)
		     {
		    	 slide.slideRight(a);
			     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		     }
		     //夜间模式
		     slide.slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         //目录
	         slide.slideDown(a);	         
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pageBtn")));
	         driver.findElementById("pageBtn").click(); 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navigationList")));
	         driver.findElementById("navigationList").findElementsByClassName("android.widget.RelativeLayout").get(3).click(); 
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         
	         //返回日间模式
	         slide.slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	        
	        
	           
	         //下滑
	        WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
	        slide.slideDown(b);
	        
	             //返回
	        //需要手动执行
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	        driver.findElementById("closeBtn").click();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	 
	       
	             //缓存图书
	     
	        WebElement cache=driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0);
	       
	        try {
	        	 if(cache.findElement(By.id("downloadBtn"))!=null)
	        		 
	        		cache.findElement(By.id("downloadBtn")).click();    
	        	 
	        } catch (Exception  e) {
	        	    System.out.print("图书已经缓存");
	        }
	        finally{
	        	TouchAction action1 = new TouchAction(driver);
		        WebElement el1=driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0);
		        action1.longPress(el1).release().perform();      	
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("editFinishedBtn")));
		        driver.findElementById("editFinishedBtn").click();
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("删除图书")));
		        driver.findElementByName("确定").click();
		        
	        }
	        
	      /*  if(cache.findElement(By.id("downloadBtn")) != null)
	        {	        
	        	cache.findElement(By.id("downloadBtn")).click();
	        }
	        else
	        {  
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        }
	       	*/
	   
	      //  driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("downloadBtn").click();
	      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	
	      
	     //   TouchAction action1 = new TouchAction(driver);
	       // WebElement el1=driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0);
	        //action1.longPress(el1).release().perform();
	      
	      
	             
	        }		
}
