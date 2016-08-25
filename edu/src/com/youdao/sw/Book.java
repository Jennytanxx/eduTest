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
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         driver.findElementById("xListView").findElements(By.className("android.widget.RelativeLayout")).get(1).click();	
	         //����ղ�
	         driver.findElementById("saveBtn").click();
	         //��������Ķ�
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	         driver.findElementById("readBtn").click();
	         
	         //�»���Ļ
	         WebElement a=driver.findElementByClassName("android.widget.FrameLayout");
	         slide.slideDown(a);
	         
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
		     action.press(el,20,20).release().perform();	
		     //���ֲ�ʽ���
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	         WebElement words=driver.findElementById("wordTranslateBar");
	       	 words.findElement(By.id("favorBtn")).click();
	        //��ʽ����
	         words.findElement(By.id("readBtn")).click();
	        //Ӣʽ����
	         words.findElement(By.id("readUKBtn")).click();
	         
	         action.press(el,10,10).release().perform();
	         /*��ҳ*/
          /*�»�*/
	         
	         //�ص�ͼ�����
	      //   driver.tap(0, 40, 160, 1);
	          //�����˵�
	         //{
	      //   driver.notify();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
	          //}
	             //����
	         driver.findElementById("closeBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	             //����
	         driver.findElementById("setttingBtn").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	         
	  	 
	               
	       }
	 public void mybook() throws InterruptedException {
	    	int i=0;  	
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab2")));
		    //�������ͼ�����
		    driver.findElementById("index_tab2").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //����e���̳�	      
	        driver.findElementById("allTabText").click();	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	  
	        //�ղ�ͼ��	       	        
	     //   for(i=0;i<2;i++)
	      //  {
	        	driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(1).findElementsById("horizon_listview").get(0).click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	  	        //����ղ�
	  	        driver.findElementById("saveBtn").click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
	  	        //����
	            driver.findElementById("setttingBtn").click();
	  	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	
	    //    }	        	     	    	    		        
	         //�����ҵ����
	        driver.findElementById("lastestTabText").click();       
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	      
	        //����ͼ��
	        //�������
	        driver.findElementById("queryBtn").click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        //����ؼ���
	        driver.findElementById("queryText").sendKeys("heart");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        //����
	        driver.findElementById("leftBtn").click();    
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        	 
	        //���һ��ͼ�飬����ͼ������ҳ��	   
	        driver.findElementById("topicList").findElementsByClassName("android.widget.RelativeLayout").get(0).click();     	
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	        //�㿪��ʾҳ��
	        //��Ҫ�ֶ�ִ��
	          
	        
	        //��Ҫ�ֶ�ִ��
	        	 //���ֲ�ʽ���
		  //���
		      
	         WebElement el=driver.findElementByClassName("android.webkit.WebView");	         
	         TouchAction action = new TouchAction(driver);	
		     action.press(el,20,20).release().perform();	             
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordTranslateBar")));
	         WebElement words=driver.findElementById("wordTranslateBar");
	       	 words.findElement(By.id("favorBtn")).click();
	        //��ʽ����
	         words.findElement(By.id("readBtn")).click();
	        //Ӣʽ����
	         words.findElement(By.id("readUKBtn")).click();
	         action.press(el,10,10).release().perform();
	         
	         //�»���Ļ
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
		     //ҹ��ģʽ
		     slide.slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         //Ŀ¼
	         slide.slideDown(a);	         
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pageBtn")));
	         driver.findElementById("pageBtn").click(); 
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navigationList")));
	         driver.findElementById("navigationList").findElementsByClassName("android.widget.RelativeLayout").get(3).click(); 
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	         
	         //�����ռ�ģʽ
	         slide.slideDown(a);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yejianmoshi")));
	         driver.findElementById("yejianmoshi").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	        
	        
	           
	         //�»�
	        WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
	        slide.slideDown(b);
	        
	             //����
	        //��Ҫ�ֶ�ִ��
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
