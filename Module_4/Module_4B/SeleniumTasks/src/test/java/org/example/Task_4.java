package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Launch browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("http://demo.guru99.com/");


        driver.findElement(By.linkText("Security Project")).click();

        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input")).sendKeys("vikkysoft28@gmail.com");
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input")).sendKeys("ForPractice@1");

        driver.quit();

    }
}

