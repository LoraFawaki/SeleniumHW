package HM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HM_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/www.facebook.com");
        WebElement create= driver.findElement(By.linkText("Create new account"));
        create.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Lora");
        Thread.sleep(2000);
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Ghali");
        Thread.sleep(2000);
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("lorafawaki@yahoo.com");
        Thread.sleep(2000);
        WebElement pass= driver.findElement(By.id("password_step_input"));
        pass.sendKeys("5522Sb@146544");
        Thread.sleep(2000);
        WebElement bMonth= driver.findElement(By.id("month"));
        bMonth.sendKeys("Sep");
        Thread.sleep(1000);
        WebElement bDay= driver.findElement(By.id("day"));
        bDay.sendKeys("1st");
        Thread.sleep(1000);
        WebElement bYear= driver.findElement(By.id("year"));
        bYear.sendKeys("1982");
        Thread.sleep(1000);
        WebElement sign= driver.findElement(By.linkText("Sign Up"));
        sign.click();
        driver.quit();

    }
}