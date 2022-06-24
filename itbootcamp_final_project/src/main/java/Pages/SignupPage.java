package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
    private WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameInput() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getConfirmPasswordInput() {
        return driver.findElement(By.id("confirmPassword"));
    }

    public WebElement getSingMeUpButton() {
        return driver.findElement(By.className("v-btn--contained"));
    }
    public WebElement getSingupButtonAfterAdding(){
        return driver.findElement(By.xpath("//button[@type='submit']"));

    }

}