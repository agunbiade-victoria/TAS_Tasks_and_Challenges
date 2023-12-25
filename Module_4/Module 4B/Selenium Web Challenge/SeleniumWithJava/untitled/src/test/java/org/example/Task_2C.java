package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2C {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\TAS\\TAS_Tasks_and_Challenges\\Module_4\\Module 4B\\Selenium Web Challenge\\SeleniumWithJava\\untitled\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.aljazeera.com/news/");

        driver.quit();
    }
}
