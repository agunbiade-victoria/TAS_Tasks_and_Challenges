package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_16 {
    WebDriver driver = null;

    @BeforeClass
    public void testify() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testifyltd.com/");
        System.out.println("...launch browser...");
        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
        System.out.println("...open the contact us page...");
    }

    @Test
    public  void  contactInformation(){

        String testifyContact =  driver.findElement(By.xpath("//p[contains(text(),'Contact Information')]")).getText();
        System.out.println("...confirm contact information...");
        System.out.println(testifyContact);
        Assert.assertEquals(testifyContact, "Contact Information");

    }

    @Test
    public  void  email(){

        String testifyEmail =  driver.findElement(By.xpath("//span[contains(text(),'info@testifyltd.com')]")).getText();
        System.out.println("...confirm email address...");
        System.out.println(testifyEmail);
        Assert.assertEquals(testifyEmail, "info@testifyltd.com");

    }

    @Test
    public  void  phoneNumber(){

        String testifyPhone =  driver.findElement(By.xpath("//span[contains(text(),'(+234)905-882-0971')]")).getText();
        System.out.println("...confirm phone number...");
        System.out.println(testifyPhone);
        Assert.assertEquals(testifyPhone, "(+234)905-882-0971");


    }
    @Test
    public  void  location() {

        String testifyLocation =  driver.findElement(By.xpath("//span[contains(text(),'Nigeria')]")).getText();
        System.out.println("...confirm country...");
        System.out.println(testifyLocation);
        Assert.assertEquals(testifyLocation, "Nigeria");

    }


    @AfterClass
    public  void quitBrowser(){
        driver.quit();
        System.out.println("...close browser...");
    }


}