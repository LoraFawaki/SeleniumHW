package HM3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox:checkBoxes){
            String value = checkbox.getAttribute("value");
            if (value.equalsIgnoreCase("option-2") || value.equalsIgnoreCase("option-3")){
                checkbox.click();

            }

        }
        WebElement enableBox = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableBox.click();

        List<WebElement> checkBoxesDemo = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement demo:checkBoxesDemo){
            String d=demo.getAttribute("value");
            if(d.equalsIgnoreCase("Checkbox-1") || d.equalsIgnoreCase("Checkbox-4")){
                demo.click();


            }
        }



    }
}
