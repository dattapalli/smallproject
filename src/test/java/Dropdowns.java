import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropdowncountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown = new Select(dropdowncountryEle);
        //  dropdown.selectByVisibleText("Germany");
        //dropdown.selectByIndex(5);
        // dropdown.selectByValue("canada");
        List<WebElement> options = dropdown.getOptions();
        // System.out.println("Number of list cout"+options.size());
       /* for(int i=0;i<options.size();i++)

        {
    System.out.println(options.get(i).getText());
        }*/
        for (WebElement op : options) {
            {
                System.out.println(op.getText());

            }
        }
    }
}