package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessagePopUpPage {
    private WebDriver driver;

    public MessagePopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitPopUpVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'v-snack__content')]")));
    }

    public WebElement getElementsWithMessage() {
        return driver.findElement(By.xpath("//div [contains(@role, 'status')]/ul/li"));
    }
    public WebElement getSavedSuccessfullyMessage(){
        return driver
                .findElement(By.className("success"));
    }

    public void waitForConfirmPopUpToBeVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.className("success")));
    }
    public WebElement getTextFromVerifyYourAccountPopUp(){
        return driver.findElement(By.className("v-card__title"));
    }
    public WebElement getCloseButtonFromPopUpDialog() {
        return driver.findElement(By.className("theme--dark"));
    }

    public WebElement getHeadlineFromVerificationDialog() {
        return driver.findElement(By.className("dlgVerifyAccount"));

    }

    public void waitForDialogForVerificationAccountIsShown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dlgVerifyAccount")));
    }
    public WebElement getCloseButtonFromVerificationDialog() {
        return driver.findElement(By.className("btnClose"));
    }
}


//    public void popUpAddNewCity() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By
//                .xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]")));
//    }
//    public void popUpDeleteCity() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By
//                .xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]")));
//
//    }
//    public WebElement getElementsWithVisibleMessagesForCities(){
//        return driver.findElement(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]"));
//    }
//
//

