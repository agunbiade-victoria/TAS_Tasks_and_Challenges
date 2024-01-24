package org.example.Task_17;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Interactions {

    WebDriver driver = null;
    @BeforeClass
    public void openBrowser () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("launch browser");
        driver.get("https://demoqa.com/");

        //scroll down on the page
        JavascriptExecutor scrolling = (JavascriptExecutor) driver;
        scrolling.executeScript("window.scrollBy(0, 500)");


    }

    @Test(priority = 1)
    public void clickInteraction(){
        // click on the Forms tile
        String name = driver.findElement(By.xpath("//h5[normalize-space()='Interactions']")).getText();
        System.out.println(name);
        driver.findElement(By.xpath("//h5[normalize-space()='Interactions']")).click();

    }

    @Test (priority = 2)
    public void interactionsPage(){
        //confirm you are on the forms page
        String forms = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
        Assert.assertEquals(forms, "Interactions");
        System.out.println("This is the Interactions page");

    }
}
