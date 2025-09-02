package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class clender {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/datepicker/");
            // Switch to iframe if needed
            driver.switchTo().frame(0);
            // Click the input to open calendar
            WebElement dateInput = driver.findElement(By.id("datepicker"));
            dateInput.click();

            // Navigate calendar (example: go to December 2025)
          /*  while (true) {
                String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
                if (monthYear.equals("December 2025")) {
                    break;
                } else {
                    driver.findElement(By.className("ui-datepicker-next")).click();
                }
            }
*/
        String[] monthsToCheck = { "September 2024", "October 2024", "December 2025" };

        for (String expectedMonth : monthsToCheck) {
            String currentMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            if (currentMonthYear.equals(expectedMonth)) {
                if (expectedMonth.equals("December 2025")) {
                    break;
                } else {
                    driver.findElement(By.className("ui-datepicker-next")).click();
                }
            }
        }

        // Select 15th
            List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
            for (WebElement date : dates) {
                if (date.getText().equals("15")) {
                    date.click();
                    break;
                }
            }

            System.out.println("Selected Date: " + dateInput.getAttribute("value"));
            driver.quit();
        }
    }


