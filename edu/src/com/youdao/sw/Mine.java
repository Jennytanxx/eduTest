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
	    	 
	      	 // �ȴ�����app
	      	WebDriverWait wait = new WebDriverWait(driver, 60);
	      
	       	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab1")));

	      	 driver.findElementById("index_tab1").click();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //��Ѷҳ������ղأ�����ղذ�ť             
	        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("saveBtn").click();
	      
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("index_tab3")));
		    //��������ҵĽ���
		     driver.findElementById("index_tab3").click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
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
	           		 
	           	 }
	        	finally{
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
	        	   }
	    public void login() throws InterruptedException {
	        //�����¼��ť
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
              slide.slideUP(a);
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
		      slide.slideUP(b);
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
		      slide.slideUP(d);
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
		      slide.slideUP(e);
		      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginOutBtn")));
		      driver.findElementById("loginOutBtn").click(); 

        }
	    	
	    }
