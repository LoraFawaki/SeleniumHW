package HM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxHM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/input-form-locator.php");

        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Lora");

        Thread.sleep(2000);

        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Fawaki");

        Thread.sleep(2000);

        WebElement email= driver.findElement(By.className("form-control-01"));
        email.sendKeys("lora09.fawaki@gmail.com");

        Thread.sleep(2000);

        WebElement button1= driver.findElement(By.id("submit_button"));
        button1.click();

        Thread.sleep(2000);

        WebElement click = driver.findElement(By.linkText("Click Here."));
        click.click();

        Thread.sleep(2000);


        WebElement link = driver.findElement(By.linkText("Link"));
        link.click();

        driver.quit();

    }
}
