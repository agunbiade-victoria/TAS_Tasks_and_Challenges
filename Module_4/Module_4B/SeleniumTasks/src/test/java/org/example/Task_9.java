package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_9 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        //Navigate to the url
        driver.get("https://www.saucedemo.com/");


        //Login
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        String loginValue = driver.findElement(By.id("login-button")).getAttribute("value");
        System.out.println("Login button Attribute is: " + loginValue);
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);
        String productName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/div[1]")).getText();
        System.out.println("Name of Product is: " + productName);

        driver.close();

    }
}
