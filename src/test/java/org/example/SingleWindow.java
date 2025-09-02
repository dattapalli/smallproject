package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SingleWindow {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String>windowID=driver.getWindowHandles();
        List<String>windowList= new ArrayList<>(windowID);
        String parent =windowList.get(0);
        String child =windowList.get(1);
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        //switchTo () to parent
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());




    }

}
