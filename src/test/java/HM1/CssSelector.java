package HM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Bassem_B");
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("Bassem Bolous");
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackJenny.sendKeys("Website is slow");
        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Website is ok");
        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("BassemBolous@yahoo.com");
       WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
       courseTopic.sendKeys("Selenium");
       WebElement introToCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
       introToCSS.sendKeys("Introduction to CSS");
       WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
       conclusion.sendKeys("Selenium is ok");

       driver.quit();


    }
}
