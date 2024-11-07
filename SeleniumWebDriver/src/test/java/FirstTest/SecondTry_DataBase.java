package FirstTest;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondTry_DataBase {

    public static void main(String[] args) {
        // Ruta al archivo CSV
        String DataBaseRoot = "/Users/alexanderestrella/Downloads/TEST DATABASE.csv"; // Reemplaza con la ruta a tu archivo CSV
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking"); // Deshabilita el bloqueo de ventanas emergentes
        options.addArguments("--no-sandbox"); // Deshabilita la sandbox
        options.addArguments("--disable-dev-shm-usage"); // Utiliza el almacenamiento compartido

        // Inicia el WebDriver
        WebDriver driver = new ChromeDriver(options);

        try (FileReader reader = new FileReader(DataBaseRoot);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            // Imprime los encabezados para verificar
            System.out.println("Encabezados en el CSV:");
            for (String header : csvParser.getHeaderMap().keySet()) {
                System.out.println(header);
            }

            // Iteración sobre cada registro en el archivo CSV
            for (CSVRecord record : csvParser) {
                // Lee los datos de cada registro
                String nombre = record.get("Nombre");
                String apellido = record.get("Apellido");
                String correo = record.get("CorreoElectronico");
                String ciudad = record.get("Ciudad");
                String pais = record.get("Pais");
                String codigoPostal = record.get("CodigoPostal");
                String fechaDeNacimiento = record.get("FechadeNacimiento");
                String genero = record.get("Genero");
                String companyName = record.get("CompanyName");
                String contrasena = record.get("Contrasena");

                // Navega a tu aplicación
                driver.get("https://elcatador.com/account/register");

                // Utiliza los datos leídos para interactuar con la página
                driver.findElement(By.xpath("//input[@id='nombre']")).sendKeys(nombre);
                driver.findElement(By.xpath("//input[@id='apellido']")).sendKeys(apellido);
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys(correo);
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys(contrasena);
                driver.findElement(By.xpath("//input[@id='acepto-terminos']")).click();
                driver.findElement(By.xpath("//input[@value='terminar registro']")).click();

                // (Opcional) Espera entre registros si es necesario
                Thread.sleep(5000); // Espera 5 segundos después del registro por si acaso falla.
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Cierra el WebDriver después de completar la prueba
            driver.quit();
        }
    }
}
