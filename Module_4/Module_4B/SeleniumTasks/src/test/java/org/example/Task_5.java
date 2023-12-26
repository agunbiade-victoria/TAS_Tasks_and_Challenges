package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        driver.quit();
    }
}
