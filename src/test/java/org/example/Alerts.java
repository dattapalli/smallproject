package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       //Normal alert handling
        /*Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
        */
        //confirm alert
       /* driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
       Alert myalert =driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.dismiss();*/
        //promt alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        // Alert promt=driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
         alert.sendKeys("Test");
         Thread.sleep(5000);
        System.out.println(alert.getText());
         alert.accept();

       String str =  driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(str);

        if(str.equalsIgnoreCase("You entered: Test")) {

            System.out.println("success");
        }





    }
}

