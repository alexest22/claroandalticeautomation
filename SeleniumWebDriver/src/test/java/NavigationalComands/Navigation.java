package NavigationalComands;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		
		//PARA ABRIR EL NAVEGADOR
		//-----------------------------------------------------
		
//		driver.navigate().to("https://www.google.com/");//forma mas comun y directa
		
		//MANERA ALTERNATIVA ******
//		URL google=new URL("https://google.com/");
//		driver.navigate().to(google);//funciona
		
		//--------------------------------------------
		
		
		//PARA VOLVER A PAGINA ANTERIOR O PAGINA SIGUIENTE
		//--------------------------------------------
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.demoblaze.com/");
		driver.findElement(By.xpath(" //div[@class='col-lg-9']//div[2]//div[1]//a[1]//img[1]")).click();
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

		
		
		
		
		
		
	}

}
