package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggetionhandles {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
        List<WebElement>drp=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(drp.size());
        for (WebElement op:drp){
            System.out.println(op.getText());
        }

    }
}
