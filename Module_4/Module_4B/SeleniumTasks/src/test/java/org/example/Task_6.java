package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        //Login
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(2000);

        //Add to cart
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);

        //View cart
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        Thread.sleep(2000);

        //Checkout
        driver.findElement(By.cssSelector("button#checkout")).click();

        driver.quit();
    }
}
