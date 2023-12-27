package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task_14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to the url
        driver.navigate().to("https://www.toolsqa.com/");
        //click on the dialogue
        driver.findElement(By.xpath("//*[@id=\"accept-cookie-policy\"]")).click();
        //click on the tutorials button
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();

        driver.close();

    }
}
