package d_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;
import java.util.logging.SocketHandler;

//Zadatak
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Dohvatite dugmice za rejting kao listu.
// XPath za trazenje treba da bude preko id atributa i za
// ovo trebace vam contains u xpath-u
//Od korisnika ucitati broj (preko scannera) na koju zvezdicu
// je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element preko indeksa
//Na kraju programa ugasite pretrazivac.
public class Zadatak1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s.bootsnipp.com/iframe/WaXlr");

        driver.manage().window().maximize();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj zvezdica: ");
        int x = s.nextInt();

        WebElement star1 = driver.findElement(By.xpath("//botton[@id='rating-star-1']"));
        WebElement star2 = driver.findElement(By.xpath("//botton[@id='rating-star-2']"));
        WebElement star3 = driver.findElement(By.xpath("//botton[@id='rating-star-3']"));
        WebElement star4 = driver.findElement(By.xpath("//botton[@id='rating-star-4']"));
        WebElement star5 = driver.findElement(By.xpath("//botton[@id='rating-star-5']"));
        star1.click();
        star2.click();
        star3.click();
        star4.click();
        star5.click();
        driver.quit();
    }
}
