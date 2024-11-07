package MidProjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticTables {

    private WebDriver driver;
    private WebDriverWait wait;

    public StaticTables() {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    public void TestStaticTables() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            WebElement staticTable = driver.findElement(By.xpath("//table[@name='BookTable']"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", staticTable);
//        } catch (org.openqa.selenium.NoSuchElementException e) {
//            WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@name='BookTable']")));
//            
//            int rows=driver.findElements(By.xpath("//table[@name='BookTable']")).size();
//            System.out.println(rows);
//            
//        }
        
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//Al Xpath se le coloco //tr para que cuente las filas
        System.out.println(rows);
        
        int colums=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(colums);
        
        String tableText=driver.findElement(By.xpath("//table[@name='BookTable' ]//tr[4]//td[1]")).getText();
        System.out.println(tableText);
        
        for(int r=2; r<=rows; r++) 
        {
        	
        	for(int c=1; c<=colums; c++) 
        	{
        		String tableIteration=driver.findElement(By.xpath("//table[@name='BookTable' ]//tr["+r+"]//td["+c+"]")).getText();
        		System.out.println(tableIteration);
        	}
        	
        }
         
    }

   
}
