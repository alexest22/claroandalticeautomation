package TareaAltice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlticeAutomation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://selfcare.altice.com.do/");
		driver.manage().window().maximize();
		
		WebElement ingresarNumero=driver.findElement(By.xpath("//input[@placeholder='Ingresar número']"));
		ingresarNumero.sendKeys("5789999");
		
		WebElement ingresarClave=driver.findElement(By.xpath("//input[@placeholder='Ingresar contraseña']"));
		ingresarClave.sendKeys("platanoconsalami");
		
		WebElement botonAcceder=driver.findElement(By.xpath("//button[text()=' Acceder ']"));
		botonAcceder.click();
		
		 WebElement mensajeDeError=driver.findElement(By.xpath("//div[@class='modal-body']"));
		 boolean validacion=mensajeDeError.isDisplayed();
		 
		 if(validacion=true) {
			 
			 System.out.println("El numero y la contrasena son incorrectas, se presento mensaje de error");
		 }
		 
		 driver.quit();
		 
		
		
		
		
		
	}

}
