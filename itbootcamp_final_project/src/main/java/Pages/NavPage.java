package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavPage {
    private WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.className("btnHome"));
    }

    public WebElement getAboutLink() {
        return driver.findElement(By.className("btnAbout"));
    }

    public WebElement getMyProfileLink() {
        return driver.findElement(By.className("btnProfile"));
    }

    public WebElement getaAdminButton() {
        return driver.findElement(By.xpath("//div[contains(@class, 'v-toolbar__content')]/div[3]/button"));
    }

    public WebElement getCitiesByAdminMenuButton() {
        return driver
                .findElement(By.className("btnAdminCities"));

    }

    public void waitForCitiesMenuByAdminToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btnAdminCities")));
    }

    public WebElement getUsersLinkByAdminMenu() {
        return driver
                .findElement(By.className("btnAdminUsers"));
    }

    public WebElement getSignupButton() {
        return driver
                .findElement(By.xpath("//div[3]/a[4]"));
    }

    public WebElement getLoginButton() {
        return driver
                .findElement(By.xpath("//div[3]/a[3]"));
    }

    public WebElement getLogoutButton() {
        return driver
                .findElement(By.className("btnLogout"));
    }

    public WebElement getLanguageButton() {
        return driver
                .findElement(By.xpath("//button[contains(@class,'btnLocaleActivation')]"));
    }

    public WebElement getEngButtonLanguage() {
        return driver.findElement(By.xpath("//div[contains(@class, 'v-menu')]/div/div"));
    }

    public WebElement getEsButtonLanguage() {
        return driver.findElement(By.xpath("//div[contains(@class, 'v-menu')]/div/div[2]"));
    }

    public WebElement getFrButtonLanguage() {
        return driver.findElement(By.xpath("//div[contains(@class, 'v-menu')]/div/div[3]"));
    }

    public WebElement getCnButtonLanguage() {
        return driver.findElement(By.xpath("//div[contains(@class, 'v-menu')]/div/div[4]"));
    }


    public WebElement getHeaderFromChangeLanguage() {
        return driver.findElement(By.className("layout"));

    }
}