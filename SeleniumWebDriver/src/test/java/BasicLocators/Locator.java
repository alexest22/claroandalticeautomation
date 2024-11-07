package BasicLocators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
//		//byName
//		WebElement searchBox=driver.findElement(By.name("search"));//para localizar elementos por nombre, en este caso un imput box
//		searchBox.sendKeys("MacBook");//para escribir un mensaje en un inpubox
//		
//		//byId
//		WebElement logo=driver.findElement(By.id("logo"));//para localizar elementos por id, en este caso una imagen
//		boolean status=logo.isDisplayed();//Para verificar que la imagen si esta display, si si, tira verdadero, sino, tira falso
//		System.out.print("Display status " + status);
//		
		//byLinkText and PartialLinkText
		WebElement logIn= driver.findElement(By.linkText("Log in"));
		logIn.click();
		
//		WebElement CamerasLink= driver.findElement(By.linkText("Cameras"));
//		CamerasLink.click();
//		
		//ByClassname (for multiple links)
//		List<WebElement> elementsTopPage=driver.findElements(By.className("list-inline-item"));
//		System.out.println(elementsTopPage.size());//Cuando se usa classname en vez de trabajar con
//												//Findelement, se trabaja con FindElements y este metodo es de la clase List.
												//Usamos el nombre de la variable creada para acceder a los metodos de List el cual uno de ellos es size, para contar cuantos elementos hay en el header
	
	
		//ByTagname (for multiple links)
		List<WebElement> totalLiknks=driver.findElements(By.tagName("a"));
		System.out.println("Total Linnks of the website is "+ (totalLiknks.size()));//Se coloco "a" porque es el comun denominador entre todos los links (en inspeccion)
	
		List<WebElement> totalImages=driver.findElements(By.tagName("img"));
		System.out.println("Total images of the website is "+ (totalImages.size()));//Se coloco "img" porque era el comun denominador entre todas las imagenes (en inspeccion)
	
	}
	
	
	
	

}
