package HM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/Xpath.php ");

        WebElement attribute = driver.findElement(By.xpath("//input[@name='exactUserEntry']"));
        attribute.sendKeys("L.Fawaki");
        WebElement btn1 = driver.findElement(By.xpath("//button[text()='Click Here']"));
        btn1.click();
        WebElement securityQst = driver.findElement(By.xpath("//input[contains(@id,'DisplayName')]"));
        securityQst.sendKeys("What is your first pet name?");
        WebElement textCont = driver.findElement(By.xpath("//label[contains(text(), 'ipsum dolor ')] "));
        textCont.getText();
        WebElement Api = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        Api.sendKeys("it stats with api setting");
        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("lora@gmail.com");
        WebElement field1 =  driver.findElement(By.xpath("//input[@name='customField' and @data-detail='one']"));
        field1.sendKeys("Lora");

        WebElement field2 =  driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("Ghali");

        driver.quit();

    }
}
