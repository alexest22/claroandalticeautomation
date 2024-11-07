import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//Implicit Wait 
//--------------------------
//solo determina el tiempo maximo de espera que tendra cada step en caso
//de ser necesario, en este caso 10 segundos. Este metodo se emplea al principio
//del codigo y se ejecuta y funciona para cada step que haya debajo.


//Explicit Wait
//--------------------------
//Funciona en base a un tiempo especificado y una condicion.
//Aqui hay declarar el objeto que implementara el metodo de la clase WedDriverWait
//Al constructor hay que pasarle parametros, que seran el objecto de la clase Webdriver
//y el tiempo que se expresa con "Duration.of"
//Luego se llama al objecto de la clase WebDriverWait para implementar los metodos
//Se llama y usualmente se usa el metodo "until." + "ExpectedConditions." y esto
//Servira para encontrar todas las condiciones y elegir la que se ajuste al escenario.
//Aqui se toma la condicion como prioridad pero se usa el tiempo para asegurar que la 
//condicion que se quiere ejecutar se ejecute en no mas de "el tiempo especificado"


public class TypesOfWaits {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Implicit Wait

		driver.get("https://jumbo.com.do/");
		driver.manage().window().maximize();
		
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking"); // Deshabilita el bloqueo de ventanas emergentes
        options.addArguments("--no-sandbox"); // Deshabilita la sandbox
        options.addArguments("--disable-dev-shm-usage"); 
        options.addArguments("--disable-notifications");
        
//        WebElement popUp=driver.findElement	(By.className("action-close0"));
//        popUp.click();
        
        WebElement search=driver.findElement(By.xpath(" //input[@id='search']"));
        search.sendKeys("apothic");
        search.sendKeys(Keys.ENTER);
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement jumboNotification= driver.findElement(By.xpath("//a[@id='btnNoIdWpnPush']"));
        jumboNotification.click();
        
//      
//        try {
//        	
//            
//            Alert jumboAlert = wait.until(ExpectedConditions.alertIsPresent()); // Wait until the alert is present
//            jumboAlert.dismiss();
//        } catch (NoAlertPresentException e) {
//            System.out.println("No alert was present at this time.");
//        }

        
//        
//        WebElement popUp=driver.findElement	(By.className("action-close0"));
//        popUp.click();
        
        List<WebElement> wineOptions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("product-item-info")));
        
        Actions cursor=new Actions(driver);
        
        try {
        
        for(WebElement winesDisplayed : wineOptions ) 
        {
        	cursor.moveToElement(winesDisplayed).perform();
        
        }
        }
        catch(Exception e) {
        	System.out.println("No hubo error en la logica");
        }
        
        	
        
        
        	
        
       
        
        
      
        
		
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));//Explicit usage Wait
//		
	}

}
