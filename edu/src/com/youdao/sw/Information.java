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
	            //���ˢ����Ѷ
	            WebElement topics=driver.findElementById("index_tab1");
	            topics.click();
	        	/*
	        	//��Ѷҳ���������
	        	driver.findElementById("source").click();
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	*/
	        	//	driver.findElementById("xListView").findElementById("source").click();  
	    	}	 
	   public void information() throws InterruptedException {		   	    		//�ȴ�һ��ʱ��
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	      
	        	//���������Ѷ
	   	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));
	   	        driver.findElementById("index_tab1").click();
	   	        driver.findElementsById("xListView").get(0).click();
	    	}
	 
	   
	   public void detailinfo() throws InterruptedException {			
		    		//�ȴ�һ��ʱ��
		        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	    		        	 
		  		   //���������Ѷ
		   	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("detailNews")));
		    	   //��Ѷҳ������ղ���Ѷ 		   	       
		   	   	   driver.findElementById("saveBtn").click(); 
		   	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   	       word.wordtranslate();
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
		 	    //  driver.findElementById("nightModeCheckBtn").click();		 	      		 	  		 		   	     
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
		   	    	/*   
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
		   	     */
		   	   	   
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
	    	
		   	  //�ص���Ѷҳ��
		 	     driver.findElementById("closeBtn").click();
		 	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   }
	  
		   
}


  
    
