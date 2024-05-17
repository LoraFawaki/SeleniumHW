package HM5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class IFrame {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//input[@class='form-control']"));
        topic.sendKeys("Selenium I-Frames");
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");
        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select dropDown = new Select(dd);
        dropDown.selectByValue("avatar");

        driver.switchTo().defaultContent();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='textfield-iframe']"));
        driver.switchTo().frame(frame1);
        WebElement text = driver.findElement(By.xpath("//input[@class='form-control']"));
        text.clear();
        text.sendKeys("Let's check");










    }
}
