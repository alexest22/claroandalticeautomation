package PruebaPiloto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

//PRIMER TEST CASE
//---------------------
//1)Launch Browser (chrome)
//2)Open URL https://demo.opencart.com/
//3)Validate title should be "Your Store"
//4)Close Browser

public class FirstTestCase {

	public static void main(String[] args) {
		
		//1) Launch Browser (chrome)
//		ChromeDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();//Upcasting from ChromeDriver to WebDriver
//		WebDriver driver1=new SafariDriver();
		
		//2)Open URL https://demo.opencart.com/
		driver1.get("https://demo.opencart.com/");
		
		//3)Validate title should be "Your Store"
		String RealTitle=driver1.getTitle();
		
		if(RealTitle.equals("Your Store")) 
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		//4)Close Browser
		driver1.close();

		
		}

}
