package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task_11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testify ltd");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        Thread.sleep(2000);

        //click on the search with testifyltd.com
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //Click on LinkedIn icon
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();

        Set<String> windows = driver.getWindowHandles();
        for (String window: windows) {
            driver.switchTo().window(window);
            Thread.sleep(2000);
            //System.out.println(driver.getCurrentUrl());
        }

        driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/button")).click();
        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/section/div/div[2]/div[1]/h4/span")).getText();
        System.out.println(text);

    }
}
