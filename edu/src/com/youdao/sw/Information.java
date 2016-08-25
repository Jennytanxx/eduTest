package com.youdao.sw;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Information{
	   private AppiumDriver<AndroidElement> driver;
	   WebDriverWait wait = new WebDriverWait(driver, 60);	 
	   Word word = new Word();
	   public void searchinfo() throws InterruptedException{
	    		//关键字搜索
	        	driver.findElementById("searchBtn").click();
	            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//输入关键字
	        	driver.findElementById("queryText").sendKeys("union");
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//点击搜索
	        	driver.findElementById("queryBtnText").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//点击订阅
	        	driver.findElementById("queryBtnText").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//返回
	        	driver.findElementById("leftBtn").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        	
	        	//添加话题
	        	driver.findElementById("addBtn").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//点击添加
	        	driver.findElementByName("添加").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//输入关键字
	        	driver.findElementById("queryText").sendKeys("study");
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//点击搜索
	        	driver.findElementByName("搜索").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//点击订阅
	        	driver.findElementById("queryBtnText").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//返回
	        	driver.findElementById("leftBtn").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        	//检查是否存在于已订阅话题中
	        	driver.findElementById("topicList");
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	
	        	//返回
	        	driver.findElementById("setttingBtn").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	//直到出现资讯的id
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));          
	            //点击刷新资讯
	            WebElement topics=driver.findElementById("index_tab1");
	            topics.click();
	        	/*
	        	//资讯页面进入文章
	        	driver.findElementById("source").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	*/
	        	//	driver.findElementById("xListView").findElementById("source").click();  
	    	}	 
	   public void information() throws InterruptedException {		   	    		//等待一段时间
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	      
	        	//点击进入资讯
	   	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
	   	        driver.findElementById("index_tab1").click();
	   	        driver.findElementsById("xListView").get(0).click();
	    	}
	 
	   
	   public void detailinfo() throws InterruptedException {			
		    		//等待一段时间
		        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	    		        	 
		  		   //点击进入资讯
		   	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("detailNews")));
		    	   //资讯页面进行收藏资讯 		   	       
		   	   	   driver.findElementById("saveBtn").click(); 
		   	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	       word.wordtranslate();
		   		//整句翻译和朗读  
		   	    /*
		           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("catchBtn")));	    
		           WebElement total=driver.findElementById("catchBtn");
		 	        //  driver.findElementById("catchBtn").click();
		 	      TouchAction action1 = new TouchAction(driver);	
		 	      action1.longPress(total,5000).moveTo(1000, 1000).release().perform();		
		 	  
		 	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fullLineTranslateBar")));	       
		           WebElement sentences=driver.findElementById("fullLineTranslateBar");
		      	//整句朗读
		           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("readLineBtn")));	
		           sentences.findElement(By.id("readLineBtn")).click();
		          */
		        
		   	    //单词回放	 
		 	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("moreBtn")));
		 	       
		 	      driver.findElementById("moreBtn").click();
		 	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dancihuifangCheckBtn")));
		 	      
		 	      driver.findElementById("dancihuifangCheckBtn").click();
		 	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 	     
		 	      driver.findElementById("nightModeCheckBtn").click();
		 	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 	    //  driver.findElementById("nightModeCheckBtn").click();		 	      		 	  		 		   	     
		    }
    	
   	   
 	    
	
	   public void shareinfo() throws InterruptedException{		   
	    		 //分享资讯到QQ空间,默认已经登录QQ
		   	   	   driver.findElementById("shareBtn").click();    
		   	   	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	   	 
		   	    	driver.findElementById("qqkongjianShareRL").click();
		   	   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	    	driver.findElementByName("发表").click();
		   	   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    	 	
		   	 
		   	   		//分享到微信
		   	        // driver.findElementById("shareBtn").click();    
		   	        // 	driver.findElementById("weixinShareRL").click();
		   	    	/*   
		   	   	   //分享到新浪微博
		   	   	 driver.findElementById("shareBtn").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     driver.findElementById("sinaweiboShareRL").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	   //  driver.findElementById("com.sina.weibo:id/edit_view").click();
		   	     driver.findElementById("com.sina.weibo:id/edit_view").sendKeys("a");
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     driver.findElementByName("发送").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     */
		   	   	   
		   	     //分享到朋友圈
		   	  //  	driver.findElementById("pengyouquan").click();
		   	   	    //分享到QQ好友
		   	     driver.findElementById("shareBtn").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   		 driver.findElementById("qqhaoyouShareRL").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     driver.findElementsById("com.tencent.mobileqq:id/text1").get(0).click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     driver.findElementById("com.tencent.mobileqq:id/dialogRightBtn").click();
		   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	     driver.findElementById("com.tencent.mobileqq:id/dialogLeftBtn").click();
	    	
		   	  //回到资讯页面
		 	     driver.findElementById("closeBtn").click();
		 	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   }
	  
		   
}


  
    
