package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLoc {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//by ("Tag + [attribute= ' ']")(name)in this case
//		WebElement driver1=driver.findElement(By.cssSelector("input[name= 'search']"));
//		driver1.sendKeys("Tablets");
		
		//by ("tag + .classname")always should be a point before classname
//		WebElement driver1=driver.findElement(By.cssSelector("input.form-control"));
//		driver1.sendKeys("Tablets");
		
//		//by tag + class + attribute
//		driver.findElement(By.cssSelector("button.btn-inverse[data-bs-toggle='dropdown']")).click();

		
		
		
		


	}

}
