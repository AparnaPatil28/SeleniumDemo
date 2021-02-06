package com.mycompany.app.addressbook_selenium_ide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App
{
 @Test

 public static void main(String[] args) {

 System.out.println("Hi, Welcome");
 System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--headless");
 
 System.out.println("Hi, Welcome to Demo on Selenium WebDriver");

 WebDriver driver = new ChromeDriver(chromeOptions);
 driver.get("http://35.154.221.98:8888/");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.className("v-button")).click();
 driver.findElement(By.id("gwt-uid-5")).sendKeys("Aparna");
 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
 driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
 driver.quit();
 }

}
