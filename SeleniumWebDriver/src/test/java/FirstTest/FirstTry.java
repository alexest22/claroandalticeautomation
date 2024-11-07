
package FirstTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTry {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize(); // Maximize the window

        // Esperar hasta que la imagen del celular sea clicable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement step1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")));
        step1.click(); // Clic en la imagen del celular

        // Esperar hasta que el botón 'Add to Cart' sea clicable
        WebElement step2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success btn-lg']")));
        step2.click(); // Click en "Add to Cart"

        // Manejar el alert si aparece (Verifica si realmente hay un alert nativo)
        try {
            WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            alertWait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept(); // Aceptar la alerta
        } catch (Exception e) {
            System.out.println("No alert present");
        }

       
        WebElement step3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='cartur']")));
        step3.click(); // Clic en "Cart"

        WebElement step4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Place Order']")));
        step4.click(); // Click en "Place Order"

        // Llenar el formulario del pop-up de "Place Order"
        WebElement step7 = driver.findElement(By.xpath("//input[@id='name']"));
        step7.sendKeys("Alexander Estrella");

        WebElement step8 = driver.findElement(By.xpath("//input[@id='country']"));
        step8.sendKeys("Dominican Republic");

        WebElement step9 = driver.findElement(By.xpath("//input[@id='city']"));
        step9.sendKeys("Moca");

        WebElement step10 = driver.findElement(By.xpath("//input[@id='card']"));
        step10.sendKeys("987-55684-596");

        WebElement step11 = driver.findElement(By.xpath("//input[@id='month']"));
        step11.sendKeys("05");

        WebElement step12 = driver.findElement(By.xpath("//input[@id='year']"));
        step12.sendKeys("24");

        WebElement step13 = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
        step13.click(); // Clic en "Purchase"
        
        driver.close(); // Cerrar el navegador
    }
}
