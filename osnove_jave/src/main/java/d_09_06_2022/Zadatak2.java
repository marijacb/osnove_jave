package d_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

//Zadatak
//Napisati program koji vrsi dodavanje 5 reda u tabelu.
//Maksimizirati prozor
//Ucitati stranicu
// https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
//Klik na dugme Add New
//Unesite name,departmant i phone (uvek iste vrednost)
//Trazenje po name atributu
//Kliknite na zeleno Add dugme.
//PAZNJA: Pogledajte strukturu stranice i videcete da se u svakom redu poslednje kolone javljaju dugmici edit, add, delete ali zbog prirode reda neki dugmici se vide a neki ne.
//Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele. Mozete koristeci index iz petlje, a mozete koristeci i last() fukncionalnost za xpath. Koristan link last mehnizma
//Cekanje od 0.5s
//Na kraju programa ugasite pretrazivac.
public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
        driver.manage().window().maximize();

        int i = 0;
        while (i<5) {
            driver.findElement(By.xpath("//button[@type =' button']")).click();
            Thread.sleep(2000);
            driver.findElement(By.name("name")).sendKeys("Marija");
            Thread.sleep(2000);
            driver.findElement(By.name("department")).sendKeys("QA");
            Thread.sleep(2000);
            driver.findElement(By.name("phone")).sendKeys(("1234-0987"));
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[4]/a[1]/i")).click();
            i++;
        }
        driver.quit();


        }


    }
