package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chexkboxnew {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mypage.rediff.com/login/dologin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement ele2= driver.findElement(By.xpath("//input[@type='submit']"));
        ele2.click();
        Alert Myalert=driver.switchTo().alert();
        System.out.println(Myalert.getText());
        Myalert.accept();

    }
}
