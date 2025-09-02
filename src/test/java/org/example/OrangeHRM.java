package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {



        public static void main(String[] args) {

            //ChromeDriver driver=new ChromeDriver();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.orangehrm.com/");
            driver.manage().window().maximize();
            String act_title=driver.getTitle();
            if(act_title.equals("Human Resources Management Software | HRMS | OrangeHRM apple")) {

                System.out.println("Red Test Passed");
            } else {

                System.out.println("Blue Test Failed");
            }



        }
    }


