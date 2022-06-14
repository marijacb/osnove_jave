package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.get(url);

        List<WebElement> nizelemenata = driver.findElements(By.className("close"));
        for (int i = 0; i < nizelemenata.size(); i++) {
            nizelemenata.get(i).click();
            Thread.sleep(2000);
            try {
                driver.findElement(By.className("close" + 1));
                System.out.println("Element nije obrisan");
            } catch (Exception a) {
                System.out.println("Element je obrisan");
            }
        }
        driver.quit();
    }

}
