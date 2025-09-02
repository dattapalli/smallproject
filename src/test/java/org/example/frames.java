package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement Frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
       driver.switchTo().frame(Frame1);
       driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");
       //frame2
        driver.switchTo().defaultContent();
        WebElement Frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(Frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
        driver.switchTo().defaultContent();
       WebElement el3 =  driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(el3);
     //   Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Pavans");
        WebElement el4 = driver.findElement(By.xpath("//iframe[contains(@src, \"https://docs.google.com/forms\")]"));
        driver.switchTo().frame(el4);
        driver.findElement(By.xpath("//span[text()='Choose']")).click();

        List<WebElement> ele21 = driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed QXL7Te']/div[@jsname='wQNmvb' and @tabindex='-1']/span"));

        System.out.println(ele21.size());

        for (WebElement op:ele21) {

            String text = op.getText();

            if(text.contains("Yes")) {

                op.click();
                break;
            }
        }





    }
}
