package com.youdao.sw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slide {
	
	 private AppiumDriver<AndroidElement> driver;
	 WebDriverWait wait = new WebDriverWait(driver, 60);
	/**
     * 在某元素中滑动向左滑动
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
