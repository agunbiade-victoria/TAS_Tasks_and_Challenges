package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        boolean firstState = driver.findElement(By.cssSelector("button#create")).isEnabled();
        System.out.println("Create account button is enabled before filling the fields: " + firstState);
        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Victoria");
        driver.findElement(By.id("lastName")).sendKeys("Oye");
        driver.findElement(By.id("email")).sendKeys("vikkysoft28@gmail.com");
        driver.findElement(By.xpath("//input[@id='female']")).click();
        driver.findElement(By.id("password")).sendKeys("For_practice");
        driver.findElement(By.id("confirmPass")).sendKeys("For_practice");
        driver.findElement(By.name("xpLevel")).sendKeys("I am currently undergoing a training on Selenium with Java");

        Thread.sleep(2000);
        boolean secondState = driver.findElement(By.cssSelector("button#create")).isEnabled();
        System.out.println("Create account button is enabled after filling the fields: " + secondState);

        driver.close();



    }
}
