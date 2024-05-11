package HM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement followingSiblings = driver.findElement(By.xpath("//input[@id='favourite-book']"));
        followingSiblings.sendKeys("Harry Potter");
        WebElement followingSiblings1 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input"));
        followingSiblings1.sendKeys("The Hobbit");
        WebElement followingSiblings2 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        followingSiblings2.sendKeys("Lord of the Rings");

        WebElement precedingSibling = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        precedingSibling.sendKeys("SnowWhite and the seven dwarves");
        WebElement precedingSibling1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        precedingSibling1.sendKeys("Alice in WonderLand");
        WebElement precedingSibling2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input"));
        precedingSibling2.sendKeys("Haidy");

        WebElement parentChild = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        parentChild.sendKeys("GrandParent");
        WebElement parentChild1 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parentChild1.sendKeys("Parent");
        WebElement parentChild2 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        parentChild2.sendKeys("Child");

        driver.quit();






    }
}
