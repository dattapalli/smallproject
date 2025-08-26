package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
     /*  for(int i=0; i<checkboxes.size();i++){
           checkboxes.get(i).click();

       }*/
        //7-5=2
       /* for(int i=5;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }
        */
        for(WebElement checkboxe:checkboxes){
            checkboxe.click();
        }
        //hgyugkjg
    }
}
