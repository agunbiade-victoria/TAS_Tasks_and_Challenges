package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\TAS_Tasks_and_Challenges\\Module_4\\Module_4B\\SeleniumTasks\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]" +
                "/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]" +
                "/div[1]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]" +
                "/article[1]/div[1]/div[2]/div[4]/div[2]/a[1]")).click();

        WebElement country = driver.findElement(By.name("country"));
        Select myCountry = new Select(country);
        myCountry.selectByValue("NG");
        Thread.sleep(3000);



        WebElement month = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
        Select monthOfTheYear = new Select(month);
        Thread.sleep(3000);
        monthOfTheYear.selectByIndex(1);
        monthOfTheYear.selectByIndex(2);
        monthOfTheYear.selectByIndex(3);
        Thread.sleep(2000);

        driver.close();

    }
}
