package XpathLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");//abre el navegador
		driver.manage().window().maximize();//Maximiza la ventana
		
		//Xpath with single attribute
//		WebElement step1=driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]"));
//		step1.click();//le da click a la imagen del cel
		
		//Xpath with multiple attrubutes
//		driver.findElement(By.xpath("a[data-target='#exampleModal'] [@class='nav-link']")).click();
		
		
		//Xpath with inner text - text()
//		driver.findElement(By.xpath("//a[text()='Contact']")).click();Syntax de inner text ("//tagname[text()='palabra']")
		
		
		//Xpath with contains()
//		driver.findElement((By.xpath("//a[contains(@name,'phones')]"))).click();
		
		//Chained Xpath

		
	}

}
