package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropdown1=driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown2=new Select(dropdown1);
        //dropdown2.selectByVisibleText("Canada");
       // dropdown2.selectByValue("canada");
        //dropdown2.selectByIndex(2);
        List<WebElement>options=dropdown2.getOptions();
        System.out.println(options.size());
        //normal for loop
       /* for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }*/
        //for each loop
        for(WebElement op:options)
        {
            System.out.println(op.getText());
        }
//all the options into a variable creating a getoptions retruns list of webelement .every option is a webelement


    }
}
