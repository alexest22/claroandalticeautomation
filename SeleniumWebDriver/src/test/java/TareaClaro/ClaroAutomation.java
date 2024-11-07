package TareaClaro;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClaroAutomation {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.claro.com.do/");
        driver.manage().window().maximize();
        
        
        WebElement services = driver.findElement(By.xpath("//a[text()='Servicios']"));
        Actions action = new Actions(driver);
        action.moveToElement(services).perform();
        
       
        WebElement red5G = driver.findElement(By.xpath("//span[text()='Red 5G']"));
        red5G.click();
        
        WebElement text5GElement = driver.findElement(By.xpath("//p[@dir='ltr'][1]"));
        
        String text5G = text5GElement.getText();
        
        Thread.sleep(7000);
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", text5GElement);
        
        System.out.println(text5G);
        
        driver.quit();
    }
}
