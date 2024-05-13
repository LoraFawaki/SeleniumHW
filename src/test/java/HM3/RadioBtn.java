package HM3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtn {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement maleFemale = driver.findElement(By.xpath("//input[@value='Female']"));
        maleFemale.click();
                WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableButton.click();
        WebElement clickMale = driver.findElement(By.xpath("//input[@value='gender-male']"));
        clickMale.click();

        //What am I doing wrong here
       // WebElement text = driver.findElement(By.xpath("//p[@class='radiobutton']"));
        //text.getText();

        WebElement select = driver.findElement(By.xpath("//input[@type='radio' and @value='Male' and @name='gender']"));
        select.click();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement rBtn:radioButtons){
            String value = rBtn.getAttribute("value");
            if (value.equals("15 - 50")){
                rBtn.click();
                break;
            }
        }

        driver.quit();
    }
}
