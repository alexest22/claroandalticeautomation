package BeginnerProjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFrameAndWindows {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public AlertsFrameAndWindows() {
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		try {
            // Verifica que la ventana está abierta antes de maximizar
            driver.manage().window().maximize();
        } catch (org.openqa.selenium.NoSuchWindowException e) {
            System.out.println("La ventana ya está cerrada o el WebDriver perdió el control de la ventana.");
        }
	}

	
	public void TestBrowserWindows() throws InterruptedException {
		
		try {
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement homePage=driver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homePage);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage);
		
		WebElement BrowserWindowsButton=driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BrowserWindowsButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", BrowserWindowsButton);
		
		WebElement newTabButton=driver.findElement(By.xpath("//button[@id='tabButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newTabButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newTabButton);
		
		
		ArrayList<String> newTabWindow=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(newTabWindow.get(1));
		Thread.sleep(7000);
		driver.close();
		
		driver.switchTo().window(newTabWindow.get(0));
		
		WebElement newWindow=driver.findElement(By.xpath("//button[@id='windowButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newWindow);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newWindow);
		
		ArrayList<String> newWindowButton=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(newWindowButton.get(1));
		Thread.sleep(7000);
		driver.close();
		
		driver.switchTo().window(newWindowButton.get(0));
		

		WebElement newWindowMessage=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newWindowMessage);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newWindowMessage);
		
		ArrayList<String> newWindowMessageButton =new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(newWindowMessageButton.get(1));
		Thread.sleep(7000);
		driver.close();
		
		driver.switchTo().window(newWindowButton.get(0));
		
		
		
		
		
		
		
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("No ocurrio nada");
		}
		
		
		
		
	}

	public void TestAlerts() throws InterruptedException {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement homePage=driver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homePage);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage);
		
		
		WebElement alerts=driver.findElement(By.xpath("//li[contains(.,'Alerts')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",alerts );
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",alerts );
		
		WebElement toSeeAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", toSeeAlert );
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",toSeeAlert );
		
		Alert alertOk=driver.switchTo().alert();
		alertOk.accept();
		
		WebElement toWaitForAlert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", toWaitForAlert );
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",toWaitForAlert );
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert waitingAlert=driver.switchTo().alert();
		waitingAlert.accept();
		
		WebElement AlertConfirmBox=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", AlertConfirmBox );
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",AlertConfirmBox );
		
		Alert confirmationAlert=driver.switchTo().alert();
		confirmationAlert.dismiss();
		
		WebElement promptBox=driver.findElement(By.xpath("//button[@id='promtButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", promptBox );
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",promptBox);
		
		Alert promptBoxMessage=driver.switchTo().alert();
		promptBoxMessage.sendKeys("Alexander");
		Thread.sleep(5000);
		promptBoxMessage.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
