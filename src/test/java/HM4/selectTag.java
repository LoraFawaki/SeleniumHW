package HM4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectTag {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement listDemo = driver.findElement(By.xpath("//select[@id='select-demo']"));
        listDemo.click();
        Select select = new Select(listDemo);
        select.selectByIndex(4);
        List<WebElement> allOptions = select.getOptions();
        for (WebElement option:allOptions){
            System.out.println(option.getText());
        }



    }
}
