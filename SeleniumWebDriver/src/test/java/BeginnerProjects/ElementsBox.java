package BeginnerProjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsBox {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public ElementsBox() {
		
		driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void TestTextBox() {
		
try {
        	
        	
            // Scroll and click on the "Elements" section using JavaScript to avoid interception
            WebElement elementsCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Elements']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsCard);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementsCard);

            // Proceed to interact with the Text Box
            WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")));
            textBox.click();
            
            // Wait until the form field 'userName' is present
            WebElement fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userName']")));
            fullName.sendKeys("Alexander Estrella");
            
            WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
            email.sendKeys("alexest22@gmail.com");
            
            WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            address.sendKeys("Piantini");
            
            WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
            permanentAddress.sendKeys("I don't have");
            
            
            WebElement summitButton=driver.findElement(By.xpath("//button[@id='submit']"));
            ((JavascriptExecutor) driver).executeScript("arguments [0].scrollIntoView(true)", summitButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", summitButton);
            
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            System.out.println("Element click was intercepted. Retrying with alternative method.");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Element not found. Ensure the correct page loaded.");
        } 
		
	
	}

	public void TestCheckBox() {


//		WebElement resultElementBox=driver.findElement(By.xpath("//p[@id='email']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",resultElementBox );
        
        WebElement checkBox=driver.findElement(By.xpath("//span[normalize-space()='Check Box']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",checkBox);
        checkBox.click();
        
        WebElement checkBoxClick=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-checkbox']")));
        checkBoxClick.click();
	}
	
	public void TestRadioButton() {

		 WebElement radioButton=driver.findElement(By.xpath("//span[normalize-space()='Radio Button']"));
	        radioButton.click();
	        
	        WebElement radioButtonOptionYes=driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",radioButtonOptionYes );
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",radioButtonOptionYes );
	        
	}
	
	public void TestWebTables() {
		
		 WebElement webTables=driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
	        webTables.click();
	        
	        WebElement optionAdd=driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
	        optionAdd.click();
	        
	        WebElement firstNameRegistrationForm=driver.findElement(By.xpath("//input[@id='firstName']"));
	        firstNameRegistrationForm.sendKeys("Samuel Camacho");
	        
	        WebElement lastNameRegistrationForm=driver.findElement(By.xpath("//input[@id='lastName']"));
	        lastNameRegistrationForm.sendKeys("Camacho");
	        
	        WebElement emailRegistrationForm=driver.findElement(By.xpath("//input[@id='userEmail']"));
	        emailRegistrationForm.sendKeys("Samuelcamacholoco@gmail.com");
	        
	        WebElement ageRegistrationForm=driver.findElement(By.xpath(" //input[@id='age']"));
	        ageRegistrationForm.sendKeys("35");
	        
	        WebElement salaryRegistrationForm=driver.findElement(By.xpath("//input[@id='salary']"));
	        salaryRegistrationForm.sendKeys("2500000");
	        
	        WebElement deparmentRegistrationForm=driver.findElement(By.xpath("//input[@id='department']"));
	        deparmentRegistrationForm.sendKeys("Science");
	        
	        driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	public void testButtons() {
		 WebElement buttons=driver.findElement(By.xpath(" //div[@class='element-list collapse show']//li[@id='item-4']"));
	        buttons.click();
	        
	        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", doubleClickButton); // Scroll al botón
	        
	        Actions actions = new Actions(driver);
	        actions.doubleClick(doubleClickButton).perform(); // Realiza el doble clic

	        // 2. Clic derecho en el botón
	        WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rightClickButton); // Scroll al botón
	        actions.contextClick(rightClickButton).perform(); // Realiza el clic derecho

	        // 3. Clic normal en un botón específico (ejemplo)
	        WebElement normalClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", normalClickButton);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", normalClickButton);
	        
	}
	
	public void testLinks() {
		
		WebElement linksOption=driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-5']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",linksOption );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linksOption);
        
        WebElement homeLink=driver.findElement(By.xpath("//a[@id='simpleLink']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",homeLink );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homeLink);
        
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        
        WebElement secondLinkForms=driver.findElement(By.xpath("//h5[normalize-space()='Forms']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", secondLinkForms);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", secondLinkForms);
        
        driver.close();
        
        driver.switchTo().window(tabs.get(0));
        
       
        
        WebElement secondHomeLink=driver.findElement(By.xpath("//a[@id='dynamicLink']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", secondHomeLink );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", secondHomeLink );
        
        ArrayList<String> tabs2=new ArrayList<>(driver.getWindowHandles());
        
        driver.switchTo().window(tabs2.get(1));
        WebElement thirdLinkForms=driver.findElement(By.xpath("//h5[normalize-space()='Forms']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", thirdLinkForms );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", thirdLinkForms );
        
        driver.close();
        
        driver.switchTo().window(tabs.get(0));
	}
	
	public void testUploadAndDownload() throws InterruptedException {

		
		WebElement uploadAndDownload=driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-7']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", uploadAndDownload );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadAndDownload);
        
        WebElement downloadButton=driver.findElement(By.xpath("//a[@id='downloadButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",downloadButton  );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",downloadButton );
        
        WebElement uploadButton=driver.findElement(By.xpath("//input[@id='uploadFile']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",uploadButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",uploadButton );
        
        String filePath="/Users/alexanderestrella/Downloads/sampleFile.jpeg";
        
        
        uploadButton.sendKeys(filePath);
        
      
        }
	
	
	public void testDynamicProperties() throws InterruptedException {
    	
   	 WebElement dynamicProperties=driver.findElement(By.xpath("//span[normalize-space()='Dynamic Properties']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",dynamicProperties);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",dynamicProperties );
        
        Thread.sleep(9000);
        
    
    
	}
}

