package BeginnerProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Forms {
    
    private WebDriver driver;
    private WebDriverWait wait;
    
    public Forms() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        
        try {
            // Verifica que la ventana está abierta antes de maximizar
            driver.manage().window().maximize();
        } catch (org.openqa.selenium.NoSuchWindowException e) {
            System.out.println("La ventana ya está cerrada o el WebDriver perdió el control de la ventana.");
        }
    }
    
    public void TestPracticeForm() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            WebElement forms = driver.findElement(By.xpath("//h5[normalize-space()='Forms']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", forms);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", forms);
            
            WebElement practiceForm = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", practiceForm);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", practiceForm);
            
            
            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", firstName);
            firstName.sendKeys("Derlin");
            
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", lastName);
            lastName.sendKeys("Santana");
            
            WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", email);
            email.sendKeys("derlinsantana123@gmail.com");
            
            WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", gender);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", gender);
            
            WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", mobileNumber);
            mobileNumber.sendKeys("829-228-0380");
            
            WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", dateOfBirth);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateOfBirth);
            
            WebElement dateOfBirthMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
            Select selectMonth = new Select(dateOfBirthMonth);
            selectMonth.selectByVisibleText("May");
            
            WebElement dateOfBirthYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
            Select selectYear = new Select(dateOfBirthYear);
            selectYear.selectByVisibleText("1995");
            
            WebElement dateOfBirthDay = driver.findElement(By.xpath("//div[@aria-label='Choose Monday, May 8th, 1995']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", dateOfBirthDay);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateOfBirthDay);
            
            WebElement subjectContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#subjectsContainer input")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subjectContainer);
            subjectContainer.sendKeys("futbol");
            
            
            WebElement hobbies = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", hobbies);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbies);
            
            WebElement pictureUpload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", pictureUpload);
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", pictureUpload);
            
            pictureUpload.sendKeys("/Users/alexanderestrella/Downloads/sampleFile.jpeg");
            
            WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", currentAddress);
            currentAddress.sendKeys("Beverly hills");
            currentAddress.sendKeys("Next to Madona");
            currentAddress.sendKeys("Close to Messi");
            
            WebElement stateSelection=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", stateSelection);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", stateSelection);
            
            WebElement state=driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", state);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", state);
            
            
            
//            
//            WebElement summitButton=driver.findElement(By.xpath("//button[@id='submit']"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true_",summitButton );
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",summitButton );
//            
//            Thread.sleep(5000); 
            
        } catch (org.openqa.selenium.NoSuchWindowException e) {
            System.out.println("La ventana fue cerrada inesperadamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            if (driver != null) {
                
            }
        }
    }

    public static void main(String[] args) {
        Forms formTest = new Forms();
        formTest.TestPracticeForm();
    }
}
