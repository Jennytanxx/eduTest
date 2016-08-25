package com.youdao.edu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testedu {
	
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
    public void testinformation() throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	//进入e读
    	enterEdu();
    	//查找资讯
        searchinfo();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  	 
    	//点击进入资讯
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
	    driver.findElementById("index_tab1").click();
	    driver.findElementsById("xListView").get(0).click();	       
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    //进入资讯详情页面
	    detailinfo();	 
	  
    	//进入图书
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab2")));
	    driver.findElementById("index_tab2").click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //进入e读商城
	    bookshell();
	    //进入我的图书
	    mybook();  
	  
	    //进入我
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab3")));
	    driver.findElementById("index_tab3").click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //不登录的情况
	    nologin();
	    //登录的情况
	    login();
    	
    }
    public void enterEdu() throws InterruptedException{
     WebDriverWait wait = new WebDriverWait(driver, 60);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebElement a=driver.findElementById("whatsnew_viewpager");    
     slideLeft(a); 
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     slideLeft(a); 
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
     System.out.print("进入edu\n");
    }
	
    
    public void searchinfo() throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
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
	}	 
    public void detailinfo() throws InterruptedException {	
    	WebDriverWait wait = new WebDriverWait(driver, 60);    	 
		 //点击进入资讯
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("detailNews")));
	   //资讯页面进行收藏资讯 		   	       
	   	   driver.findElementById("saveBtn").click(); 
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
		 	WebElement el=driver.findElementByClassName("android.webkit.WebView");	          
		 	TouchAction action = new TouchAction(driver);	
			action.press(el,500,500).release().perform();	
			wordtranslate();
	        action.press(el,10,10).release().perform();
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
	      shareinfo();
		  //回到资讯页面
		  driver.findElementById("closeBtn").click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	     
}
	public void bookshell() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);    	
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
         WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
         slideDown(a);
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
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	
         //点击收藏
         driver.findElementById("saveBtn").click();
         //点击立即阅读
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
         
         //下滑屏幕
        // WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
         slideDown(a);
         
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
	     action.press(el,100,100).release().perform();	
	     //出现查词界面
         wordtranslate();  
         action.press(el,10,10).release().perform();
   
         slideDown(a);
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
        
         driver.findElementById("closeBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
             //返回
         driver.findElementById("setttingBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         
  	 
               
       }
	public void mybook() throws InterruptedException {
	    	int i=0;  	
	    	WebDriverWait wait = new WebDriverWait(driver,60);	    	 	        
	        //进入我的书架
	        driver.findElementById("lastestTabText").click();       
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	     
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
	        //点击一本图书，进入图书详情页面	   
	        driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).click();     	
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	        //点开提示页面
	     
		   //查词
		      
	         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
	         TouchAction action = new TouchAction(driver);	
		     action.press(el,100,100).release().perform();	             
	         wordtranslate();
	         action.press(el,50,50).release().perform();
	         
	         //下滑屏幕
		     WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
		  
		     for (i=0;i<10;i++)
		    {		   		    	
		    	slideLeft(a); 
		    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		    	  
		    }
		     for (i=5;i>0;i--)
		     {
		    	slideRight(a);
			    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		     }
		     //夜间模式
		     slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         //目录
	         slideDown(a);	         
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pageBtn")));
	         driver.findElementById("pageBtn").click(); 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navigationList")));
	         driver.findElementById("navigationList").findElementsByClassName("android.widget.RelativeLayout").get(3).click(); 
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         
	         //返回日间模式
	         slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   
	         //下滑
	        WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
	        slideDown(b);
	        
	             //返回	        
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
	        
	   }		

    public void wordtranslate()throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);        
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	    WebElement words=driver.findElementById("wordTranslateBar");
	    words.findElement(By.id("favorBtn")).click();
	    //美式发音
	    words.findElement(By.id("readBtn")).click();
	    //英式发音
	    words.findElement(By.id("readUKBtn")).click();
	   
  }
    public void nologin() throws InterruptedException { 
   	 // 等待进入app
     	WebDriverWait wait = new WebDriverWait(driver, 60);     
         //进入我的收藏
        driver.findElementById("toFavoritesBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //进入话题
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("label1").click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //从话题返回到收藏页面
        driver.findElementById("setttingBtn").click();       	 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //取消收藏
       	driver.findElementById("saveBtn").click(); 
       	  //进入资讯详情页
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).click();
       	//返回到我的收藏页面
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("closeBtn").click(); 	
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //从我的收藏页面返回
       	driver.findElementById("setttingBtn").click(); 
       	  //等待一段时间
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
	        	 //进入单词本
	        	 
        driver.findElementById("toWordbookBtn").click();		         
       	 //进入某个单词详情页面
       	 //出现查词界面
       	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	 driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(2).click();
       	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	 //取消收藏
       	 driver.findElement(By.id("favorBtn")).click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	//美式发音
       	 driver.findElement(By.id("readBtn")).click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         	//英式发音
       	 driver.findElement(By.id("readUKBtn")).click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //进入文章来源
         try{
          		if(driver.findElement(By.id("source"))!=null)
          			driver.findElement(By.id("source")).click();
          	//等待一段时间
          			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       //返回单词页面
          			driver.findElement(By.id("closeBtn")).click(); 
          	 } catch (Exception  e){
          		 
          	 }finally{
       		//等待一段时间
	        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //返回单词页面
	        	 driver.findElement(By.id("setttingBtn")).click(); 
       		
       	}
       	 	       
       	 //等待一段时间
       	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	  //从单词页面返回到我
       	 driver.findElementById("setttingBtn").click(); 
       
     
        
       	  //等待一段时间
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //进入选择难度
         driver.findElementById("toLevelSettingBtn").click();
       
       //滑动选择难度
       	 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	  //从难度页面返回到我
       	 driver.findElementById("setttingBtn").click(); 
    
            
           //点击设置按钮
        driver.findElementById("settting2Btn").click();
  	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
  	   //首页注解
       	driver.findElementById("annotionBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("annotationCheckBtn").click();
       	
       	//   夜间模式
       	driver.findElementById("dayNightBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("dayNightCheckBtn").click();
       	 	
       	   //推送
       	driver.findElementById("pushBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("pushCheckBtn").click();
       	 	
       	   
       	//   自动省流量模式
       	driver.findElementById("saveFlowBtn").click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("saveFlowCheckBtn").click();
       	
       	   
       	//   清除缓存
       	driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(5).click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  
      /*
       	   //意见反馈
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("意见反馈")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(6).click();
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	   //输入内容
       	   driver.findElementById("msgEdit").sendKeys("good");
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //点击发送
       	   driver.findElementById("settting2Btn").click();
        	   
  	    //   满意度调查
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("满意度调查")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(7).click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //打分
       	   driver.findElementById("scores_p1").click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //点击发送
       	   driver.findElementById("settting2Btn").click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   
       	   
       //	   driver.findElementById("annotationCheckBtn").click();
       	   
       	   WebElement c=driver.findElementByClassName("android.widget.ScrollView");
	           slideUP(c); 	  
       //用户协议
       	
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("用户协议")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(8).click();		        			      
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   driver.findElementByClassName("android.widget.ImageView").click(); 
       	   slideUP(c); 	  
      
  	     		//应用市场评分，麻烦，不实现	        	 
       	  // wait.until(ExpectedConditions.presenceOfElementLocated(By.name("去应用市场评分")));
       	  // driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(9).click();		        			      		        
       	  // driver.findElementByClassName("android.widget.ImageButton").click();  
  	     		
  	     
  	      	  //关于e读
  	 	  
          wait.until(ExpectedConditions.presenceOfElementLocated(By.name("关于e读")));
       	  driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(10).click();		        			      		        
       	  driver.findElementById("setttingBtn").click();   
       	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	  driver.findElementById("setttingBtn").click();   
    
*/    	  
       	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	driver.findElementById("setttingBtn").click();   
       }
 
    
    public void login() throws InterruptedException {
        //点击登录按钮
    	WebDriverWait wait = new WebDriverWait(driver, 60);
   	 //**QQ登录
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
   	  
    	driver.findElementById("loginBtn").click();
    	driver.findElementById("layout_qq_login").click();   
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("QQ登录")));
   	 //  driver.findElementByName("登录").click(); 
   	//  driver.findElementById("com.tencent.mobileqq:id/name").click();  
    	driver.findElementByClassName("android.widget.Button").click();
   	  //是否同步数据
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	
    	driver.findElementById("openBtn").click();
   	  
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  
   //  driver.findElementById("settting2Btn").click();
   	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	//退出登录
	    driver.findElementById("headContainer").findElementById("settting2Btn").click();
	     //
	      //上滑屏幕，直到出现退出登录按钮
	    WebElement a=driver.findElementByClassName("android.widget.ScrollView");
        slideUP(a);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //*新浪微博登录
        	
	    driver.findElementById("loginBtn").click();
   	    driver.findElementById("layout_sina_login").click();  
   	//  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("微博登录")));
   	//  driver.findElementById("bnLogin").click();  
        //是否同步数据
   	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	    driver.findElementById("openBtn").click();
   	  
   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	  //点击设置按钮
   	    driver.findElementById("headContainer").findElementById("settting2Btn").click();			   
	      //上滑屏幕
	    WebElement b=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(b);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
    
	      //网易邮箱登录
        	 
	    driver.findElementById("loginBtn").click();
	      
	    driver.findElementById("layout_netease_login").click();   
   	
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  //输入用户名
   	  	driver.findElementById("edit_text_mail").sendKeys("jennytest@163.com"); 
   	//  driver.findElementById("edit_text_mail").click();
   	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  //输入密码
   	  	driver.findElementById("edit_text_pass").sendKeys("jennytanxx1992"); 
   	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  	driver.findElementById("login_netease_confirm_btn").click();   
   	 //是否同步数据
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	  	driver.findElementById("openBtn").click();
   	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  //退出登录
   	  	driver.findElementById("headContainer").findElementById("settting2Btn").click();
	      //上滑屏幕
	    WebElement d=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(d);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
           
   	 
   	
	      //微信登录
        	 
	    driver.findElementById("loginBtn").click();
   	  	driver.findElementById("layout_wechat_login").click();  
   	  	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("微信登录")));
   //	  driver.findElementByClassName("com.tencent.smtt.webkit.WebView");
   	  //点击确认登录
  // 	  driver.findElementById("bnLogin").click();  
        //是否同步数据
   	  	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
     	driver.findElementById("openBtn").click();
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  //退出登录
     	driver.findElementById("headContainer").findElementById("settting2Btn").click();
	    WebElement e=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(e);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
}
    	
    
    /*** 在某元素中滑动向左滑动
     * 
     * @param 传入WebElement
     */
    public void slideLeft(WebElement a) {

        int x = a.getSize().width;
        int y = a.getSize().height;
        //driver.swipe(x / 4 * 3, y / 10, x / 4 * 2, y / 10, 0);
        driver.swipe(x / 4 * 3, y / 10, x / 4 , y / 10, 0);
    }
    public void slideLeft1(WebElement a) {

        int x = a.getSize().width;
        int y = a.getSize().height;
        //driver.swipe(x / 4 * 3, y / 10, x / 4 * 2, y / 10, 0);
        driver.swipe(x / 2, y / 10, x / 4 , y / 10, 0);
    }
    /**
     * 在某元素中滑动向右滑动
     * 
     * @param 传入 Webelement
     */
    public void slideRight(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 4 * 2, y / 10, x / 4 * 3, y / 10, 0);
    }
    


    /**
     * 在某元素中滑动向下滑动
     * 
     * @param 传入WebElement
     */
    public void slideDown(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 10, y / 3 * 1, x / 10, y / 3 * 2, 0);
    }

    /**
     * 在某元素中滑动向上滑动
     * 
     * @param 传入WebElement
     */
    public void slideUP(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 10, y / 3 * 2, x / 10, y / 3 * 1, 0);

    }
	
    
    
}


