package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Boostrapdropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
        List<WebElement> drop1=driver.findElements(By.xpath("//ul[@class='dropdown-menu test']"));
        System.out.println(drop1.size());
        for (WebElement op:drop1){
            System.out.println(op.getText());
        }

    }
}
