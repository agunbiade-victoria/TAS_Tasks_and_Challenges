package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_15 {
    WebDriver driver=null;

    @BeforeMethod
    public  void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("---Launch Browser------");

    }

    @Test
    public void google() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testify");
        Thread.sleep(2000);
        System.out.println("Google search Testify------");
    }
    @Test
    public  void mcdonalds(){
        System.out.println("...navigate to mcdonalds...");
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        String color = driver.findElement(By.xpath("//a[@id='button-ordernow']")).getCssValue("background-color");
        System.out.println("print out the order now button color: " + color);

    }

    @AfterClass
    public  void close(){
        driver.quit();
        System.out.println("close browser");
    }

}
