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
     System.out.print("��װ���");
     
    
}

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testinformation() throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	//����e��
    	enterEdu();
    	//������Ѷ
        searchinfo();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  	 
    	//���������Ѷ
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
	    driver.findElementById("index_tab1").click();
	    driver.findElementsById("xListView").get(0).click();	       
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    //������Ѷ����ҳ��
	    detailinfo();	 
	  
    	//����ͼ��
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab2")));
	    driver.findElementById("index_tab2").click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //����e���̳�
	    bookshell();
	    //�����ҵ�ͼ��
	    mybook();  
	  
	    //������
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab3")));
	    driver.findElementById("index_tab3").click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //����¼�����
	    nologin();
	    //��¼�����
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
    //ѡ����     
    //ѡ���Ѷ�
     driver.findElementById("nextBtn").click();
 
     wait.until(ExpectedConditions.presenceOfElementLocated(By.id("horizon_listview")));
    //ѡ����
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
 	 //�����ʼe��
	 driver.findElement(By.name("��ʼe��")).click();           
 	 // �ȴ�����app
 	 //ֱ��������Ѷ��id
 	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
     System.out.print("����edu\n");
    }
	
    
    public void searchinfo() throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
    	//�ؼ�������
    	driver.findElementById("searchBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����ؼ���
    	driver.findElementById("queryText").sendKeys("union");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//�������
    	driver.findElementById("queryBtnText").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//�������
    	driver.findElementById("queryBtnText").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����
    	driver.findElementById("leftBtn").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        	
    	//��ӻ���
    	driver.findElementById("addBtn").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//������
    	driver.findElementByName("���").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����ؼ���
    	driver.findElementById("queryText").sendKeys("study");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//�������
    	driver.findElementByName("����").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//�������
    	driver.findElementById("queryBtnText").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����
    	driver.findElementById("leftBtn").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����Ƿ�������Ѷ��Ļ�����
    	driver.findElementById("topicList");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//����
    	driver.findElementById("setttingBtn").click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//ֱ��������Ѷ��id
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));          
	}	 
    public void detailinfo() throws InterruptedException {	
    	WebDriverWait wait = new WebDriverWait(driver, 60);    	 
		 //���������Ѷ
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("detailNews")));
	   //��Ѷҳ������ղ���Ѷ 		   	       
	   	   driver.findElementById("saveBtn").click(); 
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
		 	WebElement el=driver.findElementByClassName("android.webkit.WebView");	          
		 	TouchAction action = new TouchAction(driver);	
			action.press(el,500,500).release().perform();	
			wordtranslate();
	        action.press(el,10,10).release().perform();
		//���䷭����ʶ�  
	    /*
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("catchBtn")));	    
       WebElement total=driver.findElementById("catchBtn");
	        //  driver.findElementById("catchBtn").click();
	      TouchAction action1 = new TouchAction(driver);	
	      action1.longPress(total,5000).moveTo(1000, 1000).release().perform();		
	  
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fullLineTranslateBar")));	       
       WebElement sentences=driver.findElementById("fullLineTranslateBar");
  	//�����ʶ�
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("readLineBtn")));	
       sentences.findElement(By.id("readLineBtn")).click();
      */
    
	    //���ʻط�	 
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("moreBtn")));
	       
	      driver.findElementById("moreBtn").click();
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dancihuifangCheckBtn")));
	      
	      driver.findElementById("dancihuifangCheckBtn").click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);      
	      driver.findElementById("nightModeCheckBtn").click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	    	
	      shareinfo();
		  //�ص���Ѷҳ��
		  driver.findElementById("closeBtn").click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

    public void shareinfo() throws InterruptedException{		   
		 //������Ѷ��QQ�ռ�,Ĭ���Ѿ���¼QQ
  	   	   driver.findElementById("shareBtn").click();    
  	   	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	   	 
  	    	driver.findElementById("qqkongjianShareRL").click();
  	   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	    	driver.findElementByName("����").click();
  	   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    	 	
  	 
  	   		//����΢��
  	        // driver.findElementById("shareBtn").click();    
  	        // 	driver.findElementById("weixinShareRL").click();	    	  
  	   	   //��������΢��
  	   	 driver.findElementById("shareBtn").click();
  	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	     driver.findElementById("sinaweiboShareRL").click();
  	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	   //  driver.findElementById("com.sina.weibo:id/edit_view").click();
  	     driver.findElementById("com.sina.weibo:id/edit_view").sendKeys("a");
  	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	     driver.findElementByName("����").click();
  	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
  	     //��������Ȧ
  	  //  	driver.findElementById("pengyouquan").click();
  	   	    //����QQ����
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
	     //�������e���̳�	 
         driver.findElementById("allTabText").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
           //����ͼ��
            //�������������ؼ���
       	 driver.findElementById("queryBtn").click();
      // 	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         	//�������
         driver.findElementById("queryText").sendKeys("heart");
     //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         driver.findElementByName("����");
         	//����
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         driver.findElementById("leftBtn").click();        
         
         /*����ּ�ͼ��*/
         driver.findElementById("classBtn").click(); 
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topicList")));
         //�������
         driver.findElementById("topicList").findElements(By.className("android.widget.RelativeLayout")).get(1).findElementById("item").click();
         //ѡ��һ��ͼ��
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	  
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         //����ղ�
         driver.findElementById("saveBtn").click();
         //��������Ķ�
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
         //�»���Ļ
         WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
         slideDown(a);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
         driver.findElementById("closeBtn").click();
      //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("setttingBtn")));
       //���ص�����
         driver.findElementById("setttingBtn").click();
          //���ص��ּ�ͼ�� 
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
         driver.findElementById("leftBtn").click();
         //���ص�e���̳�
     //    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.name("�ּ�ͼ��")));
   //      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         driver.findElementById("leftBtn").click();
     
         
         /*��������ͼ��*/
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hotBtn")));
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         driver.findElementById("hotBtn").click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	
         //����ղ�
         driver.findElementById("saveBtn").click();
         //��������Ķ�
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
         
         //�»���Ļ
        // WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
         slideDown(a);
         
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
         driver.findElementById("closeBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         //���ص�����ͼ��
         driver.findElementById("setttingBtn").click();
         //���ص�e���̳�
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
         driver.findElementById("leftBtn").click();
     

         //����e���̳�	      
         driver.findElementById("allTabText").click();	        
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
       	//������뾫Ʒ����
         driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("item").click();
        //�ȴ�10s
       	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
         //����e���̳�	    
       	 driver.findElementById("leftBtn").click();	       
         //�ȴ�10s
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        //���һ��ͼ�飬����ͼ������ҳ��
         driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementsById("horizon_listview").get(0).click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
        //����ղ�
         driver.findElementById("saveBtn").click();
         //��������Ķ�
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
        //�ȴ�һ��ʱ��
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  	             	       
         //���һ������        
         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
         TouchAction action = new TouchAction(driver);	
	     action.press(el,100,100).release().perform();	
	     //���ֲ�ʽ���
         wordtranslate();  
         action.press(el,10,10).release().perform();
   
         slideDown(a);
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
        
         driver.findElementById("closeBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
             //����
         driver.findElementById("setttingBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         
  	 
               
       }
	public void mybook() throws InterruptedException {
	    	int i=0;  	
	    	WebDriverWait wait = new WebDriverWait(driver,60);	    	 	        
	        //�����ҵ����
	        driver.findElementById("lastestTabText").click();       
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	     
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
	        //���һ��ͼ�飬����ͼ������ҳ��	   
	        driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).click();     	
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	        //�㿪��ʾҳ��
	     
		   //���
		      
	         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
	         TouchAction action = new TouchAction(driver);	
		     action.press(el,100,100).release().perform();	             
	         wordtranslate();
	         action.press(el,50,50).release().perform();
	         
	         //�»���Ļ
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
		     //ҹ��ģʽ
		     slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         //Ŀ¼
	         slideDown(a);	         
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pageBtn")));
	         driver.findElementById("pageBtn").click(); 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navigationList")));
	         driver.findElementById("navigationList").findElementsByClassName("android.widget.RelativeLayout").get(3).click(); 
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         
	         //�����ռ�ģʽ
	         slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   
	         //�»�
	        WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
	        slideDown(b);
	        
	             //����	        
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	        driver.findElementById("closeBtn").click();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	 
	       
	             //����ͼ��
	     
	        WebElement cache=driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0);
	       
	        try {
	        	 if(cache.findElement(By.id("downloadBtn"))!=null)
	        		 
	        		cache.findElement(By.id("downloadBtn")).click();    
	        	 
	        } catch (Exception  e) {
	        	    System.out.print("ͼ���Ѿ�����");
	        }
	        finally{
	        	TouchAction action1 = new TouchAction(driver);
		        WebElement el1=driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0);
		        action1.longPress(el1).release().perform();      	
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("editFinishedBtn")));
		        driver.findElementById("editFinishedBtn").click();
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("ɾ��ͼ��")));
		        driver.findElementByName("ȷ��").click();		       
	        }
	        
	   }		

    public void wordtranslate()throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 60);        
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	    WebElement words=driver.findElementById("wordTranslateBar");
	    words.findElement(By.id("favorBtn")).click();
	    //��ʽ����
	    words.findElement(By.id("readBtn")).click();
	    //Ӣʽ����
	    words.findElement(By.id("readUKBtn")).click();
	   
  }
    public void nologin() throws InterruptedException { 
   	 // �ȴ�����app
     	WebDriverWait wait = new WebDriverWait(driver, 60);     
         //�����ҵ��ղ�
        driver.findElementById("toFavoritesBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //���뻰��
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("label1").click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //�ӻ��ⷵ�ص��ղ�ҳ��
        driver.findElementById("setttingBtn").click();       	 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //ȡ���ղ�
       	driver.findElementById("saveBtn").click(); 
       	  //������Ѷ����ҳ
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).click();
       	//���ص��ҵ��ղ�ҳ��
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("closeBtn").click(); 	
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  //���ҵ��ղ�ҳ�淵��
       	driver.findElementById("setttingBtn").click(); 
       	  //�ȴ�һ��ʱ��
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
	        	 //���뵥�ʱ�
	        	 
        driver.findElementById("toWordbookBtn").click();		         
       	 //����ĳ����������ҳ��
       	 //���ֲ�ʽ���
       	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	 driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(2).click();
       	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	 //ȡ���ղ�
       	 driver.findElement(By.id("favorBtn")).click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	//��ʽ����
       	 driver.findElement(By.id("readBtn")).click();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         	//Ӣʽ����
       	 driver.findElement(By.id("readUKBtn")).click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //����������Դ
         try{
          		if(driver.findElement(By.id("source"))!=null)
          			driver.findElement(By.id("source")).click();
          	//�ȴ�һ��ʱ��
          			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       //���ص���ҳ��
          			driver.findElement(By.id("closeBtn")).click(); 
          	 } catch (Exception  e){
          		 
          	 }finally{
       		//�ȴ�һ��ʱ��
	        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //���ص���ҳ��
	        	 driver.findElement(By.id("setttingBtn")).click(); 
       		
       	}
       	 	       
       	 //�ȴ�һ��ʱ��
       	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	  //�ӵ���ҳ�淵�ص���
       	 driver.findElementById("setttingBtn").click(); 
       
     
        
       	  //�ȴ�һ��ʱ��
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //����ѡ���Ѷ�
         driver.findElementById("toLevelSettingBtn").click();
       
       //����ѡ���Ѷ�
       	 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	  //���Ѷ�ҳ�淵�ص���
       	 driver.findElementById("setttingBtn").click(); 
    
            
           //������ð�ť
        driver.findElementById("settting2Btn").click();
  	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
  	   //��ҳע��
       	driver.findElementById("annotionBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("annotationCheckBtn").click();
       	
       	//   ҹ��ģʽ
       	driver.findElementById("dayNightBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("dayNightCheckBtn").click();
       	 	
       	   //����
       	driver.findElementById("pushBtn").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("pushCheckBtn").click();
       	 	
       	   
       	//   �Զ�ʡ����ģʽ
       	driver.findElementById("saveFlowBtn").click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	driver.findElementById("saveFlowCheckBtn").click();
       	
       	   
       	//   �������
       	driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(5).click();
       	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       	  
      /*
       	   //�������
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("�������")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(6).click();
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerTitle")));
       	   //��������
       	   driver.findElementById("msgEdit").sendKeys("good");
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //�������
       	   driver.findElementById("settting2Btn").click();
        	   
  	    //   ����ȵ���
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("����ȵ���")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(7).click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //���
       	   driver.findElementById("scores_p1").click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   //�������
       	   driver.findElementById("settting2Btn").click();
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   
       	   
       //	   driver.findElementById("annotationCheckBtn").click();
       	   
       	   WebElement c=driver.findElementByClassName("android.widget.ScrollView");
	           slideUP(c); 	  
       //�û�Э��
       	
       	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("�û�Э��")));
       	   driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(8).click();		        			      
       	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   driver.findElementByClassName("android.widget.ImageView").click(); 
       	   slideUP(c); 	  
      
  	     		//Ӧ���г����֣��鷳����ʵ��	        	 
       	  // wait.until(ExpectedConditions.presenceOfElementLocated(By.name("ȥӦ���г�����")));
       	  // driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(9).click();		        			      		        
       	  // driver.findElementByClassName("android.widget.ImageButton").click();  
  	     		
  	     
  	      	  //����e��
  	 	  
          wait.until(ExpectedConditions.presenceOfElementLocated(By.name("����e��")));
       	  driver.findElementByClassName("android.widget.ScrollView").findElementsByClassName("android.widget.RelativeLayout").get(10).click();		        			      		        
       	  driver.findElementById("setttingBtn").click();   
       	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	  driver.findElementById("setttingBtn").click();   
    
*/    	  
       	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	driver.findElementById("setttingBtn").click();   
       }
 
    
    public void login() throws InterruptedException {
        //�����¼��ť
    	WebDriverWait wait = new WebDriverWait(driver, 60);
   	 //**QQ��¼
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
   	  
    	driver.findElementById("loginBtn").click();
    	driver.findElementById("layout_qq_login").click();   
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("QQ��¼")));
   	 //  driver.findElementByName("��¼").click(); 
   	//  driver.findElementById("com.tencent.mobileqq:id/name").click();  
    	driver.findElementByClassName("android.widget.Button").click();
   	  //�Ƿ�ͬ������
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	
    	driver.findElementById("openBtn").click();
   	  
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  
   //  driver.findElementById("settting2Btn").click();
   	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	//�˳���¼
	    driver.findElementById("headContainer").findElementById("settting2Btn").click();
	     //
	      //�ϻ���Ļ��ֱ�������˳���¼��ť
	    WebElement a=driver.findElementByClassName("android.widget.ScrollView");
        slideUP(a);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //*����΢����¼
        	
	    driver.findElementById("loginBtn").click();
   	    driver.findElementById("layout_sina_login").click();  
   	//  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("΢����¼")));
   	//  driver.findElementById("bnLogin").click();  
        //�Ƿ�ͬ������
   	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	    driver.findElementById("openBtn").click();
   	  
   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	  //������ð�ť
   	    driver.findElementById("headContainer").findElementById("settting2Btn").click();			   
	      //�ϻ���Ļ
	    WebElement b=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(b);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
    
	      //���������¼
        	 
	    driver.findElementById("loginBtn").click();
	      
	    driver.findElementById("layout_netease_login").click();   
   	
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  //�����û���
   	  	driver.findElementById("edit_text_mail").sendKeys("jennytest@163.com"); 
   	//  driver.findElementById("edit_text_mail").click();
   	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  //��������
   	  	driver.findElementById("edit_text_pass").sendKeys("jennytanxx1992"); 
   	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  	driver.findElementById("login_netease_confirm_btn").click();   
   	 //�Ƿ�ͬ������
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
   	  	driver.findElementById("openBtn").click();
   	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  //�˳���¼
   	  	driver.findElementById("headContainer").findElementById("settting2Btn").click();
	      //�ϻ���Ļ
	    WebElement d=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(d);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
           
   	 
   	
	      //΢�ŵ�¼
        	 
	    driver.findElementById("loginBtn").click();
   	  	driver.findElementById("layout_wechat_login").click();  
   	  	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("΢�ŵ�¼")));
   //	  driver.findElementByClassName("com.tencent.smtt.webkit.WebView");
   	  //���ȷ�ϵ�¼
  // 	  driver.findElementById("bnLogin").click();  
        //�Ƿ�ͬ������
   	  	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.FrameLayout")));
     	driver.findElementById("openBtn").click();
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  //�˳���¼
     	driver.findElementById("headContainer").findElementById("settting2Btn").click();
	    WebElement e=driver.findElementByClassName("android.widget.ScrollView");
	    slideUP(e);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
	    driver.findElementById("loginOutBtn").click(); 
}
    	
    
    /*** ��ĳԪ���л������󻬶�
     * 
     * @param ����WebElement
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
     * ��ĳԪ���л������һ���
     * 
     * @param ���� Webelement
     */
    public void slideRight(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 4 * 2, y / 10, x / 4 * 3, y / 10, 0);
    }
    


    /**
     * ��ĳԪ���л������»���
     * 
     * @param ����WebElement
     */
    public void slideDown(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 10, y / 3 * 1, x / 10, y / 3 * 2, 0);
    }

    /**
     * ��ĳԪ���л������ϻ���
     * 
     * @param ����WebElement
     */
    public void slideUP(WebElement a) {
        int x = a.getSize().width;
        int y = a.getSize().height;
        driver.swipe(x / 10, y / 3 * 2, x / 10, y / 3 * 1, 0);

    }
	
    
    
}


