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
      	 //���ˢ����Ѷ
         driver.findElementById("index_tab2").click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           //����ּ�ͼ��
         driver.findElementById("classBtn").click(); 
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topicList")));
         //ѡ��һ��ͼ��     
         driver.findElementById("topicList").findElements(By.className("android.widget.RelativeLayout")).get(0).findElementById("horizon_listview").findElementsByClassName("android.widget.RelativeLayout").get(0).click();  
        //��������Ķ�
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	        
         driver.findElementById("readBtn").click();
         //��һ�Σ��������ʾ�����
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("catchtips").click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         //�»���Ļ
         WebElement b=driver.findElementByClassName("android.widget.FrameLayout");
         slide.slideDown(b);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeBtn")));
         driver.findElementById("closeBtn").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
         //���ص�����ͼ��
         driver.findElementById("setttingBtn").click();
         //���ص�e���̳�
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("leftBtn")));
         driver.findElementById("leftBtn").click();
         
         
         driver.findElementById("index_tab1").click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         System.out.print("���е�����");
      
        //��Ѷҳ������ղ�
        //�ҵ���һ��widget       
      //�ҵ���Ѷ���ڵأ�����ղذ�ť             
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("saveBtn").click();
       
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	//��Ѷҳ����뻰��
        driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).findElementById("label1").click();
     	
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	//�ӻ���ҳ�淵�ص���Ѷҳ��
    	driver.findElementById("setttingBtn").click();   

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  
       
    	
 //      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("webview")));
    //��Ѷҳ������ղ���Ѷ 
        
   
    
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.findElementById("xListView").findElementsByClassName("android.widget.RelativeLayout").get(0).click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("catchtips").click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElementById("closeBtn").click();
      	//���ϻ�����������Ϣ��
     	//
     	 WebElement d=driver.findElementById("tabhomepager");
     	 slide.slideUP(d);
     	 slide.slideUP(d);
     	 slide.slideUP(d);
     	 slide.slideUP(d);
         
    }

  

    
    
}
