package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

//2.Zadatak
//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!
public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        String url = "https://geodata.solutions/";
        driver.get(url);
        driver.manage().window().maximize();
        Select kategorija = new Select(driver.findElement(By.name("country")));
        List<WebElement> country = kategorija.getOptions();
        Random random = new Random();
        int randomIndex = random.nextInt(country.size());
        kategorija.selectByIndex(randomIndex);
        Thread.sleep(2000);

        Select kategorija2 = new Select(driver.findElement(By.name("state")));
        List<WebElement> state = kategorija2.getOptions();
        kategorija2.selectByIndex((random.nextInt(state.size())));
        Thread.sleep(2000);

        Select kategorija3 = new Select(driver.findElement(By.name("city")));
        List<WebElement> city = kategorija3.getOptions();
        kategorija3.selectByIndex((random.nextInt(city.size())));
        Thread.sleep(2000);

        driver.quit();

    }

}
