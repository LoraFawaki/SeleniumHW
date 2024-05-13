package HM4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownAmazon {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement departmentDropdown = driver.findElement(By.id("searchDropdownBox"));
        departmentDropdown.click();
        Select select = new Select(departmentDropdown);
        List<WebElement> departmentOptions = select.getOptions();

        System.out.println("Number of department options available: " + departmentOptions.size());
        System.out.println("Department options:");
        for (WebElement option : departmentOptions) {
            System.out.println(option.getText());
        }
        select.selectByVisibleText("Computers");
        driver.quit();
    }
}
