package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Iframe {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("frm1");
        WebElement lo = driver.findElement(By.xpath("//select[@id='course']"));
        Select select = new Select(lo);
        select.selectByVisibleText("Java");


    }
}
