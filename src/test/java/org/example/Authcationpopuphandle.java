package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Authcationpopuphandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.get("https://the-internet.herokuapp.com/digest_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        driver.manage().window().maximize();
        WebElement ele =driver.findElement(By.xpath("//p[contains(text(),'proper credentials')]"));
        System.out.println(ele.getText());
    }


}
