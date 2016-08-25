package com.youdao.sw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Mine {
	   private AppiumDriver<AndroidElement> driver;
	   WebDriverWait wait = new WebDriverWait(driver, 60);
	   Slide slide = new Slide();
	   public void nologin() throws InterruptedException {
	    	 
	      	 // 等待进入app
	      	WebDriverWait wait = new WebDriverWait(driver, 60);
	      
	       	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));

	      	 driver.findElementById("index_tab1").click();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //资讯页面进行收藏，点击收藏按钮             
	        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("saveBtn").click();
	      
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab3")));
		    //点击进入我的界面
		     driver.findElementById("index_tab3").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
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
	           		 
	           	 }
	        	finally{
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
	        	   }
	    public void login() throws InterruptedException {
	        //点击登录按钮
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
              slide.slideUP(a);
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
		      slide.slideUP(b);
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
		      slide.slideUP(d);
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
		      slide.slideUP(e);
		      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
		      driver.findElementById("loginOutBtn").click(); 

        }
	    	
	    }
