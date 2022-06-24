package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CitiesPage {
    private WebDriver driver;

    public CitiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNewItemButton() {
        return driver
                .findElement(By.className("btnNewItem"));
    }
    public WebElement getInputName(){
        return driver.findElement(By.id("name"));}
    public WebElement getInputSearch(){
        return driver.findElement(By.id("search"));

    }
    public void waitForEditDialogToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("NewEditItem")));
    }

    public void waitForDeleteDialogToBeVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("exclamation")));

    } public WebElement getSaveButtonInEditDialog() {
        return driver
                .findElement(By.className("btnSave"));

    }

    public WebElement getDeleteButtonInDeleteDialog() {
        return driver
                .findElement(By.className("red"));

    }

    public void waitForNumberOfRowsToBe(int rowNum) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("tr"), rowNum));
    }

    public WebElement getTableCell(int rowIndex, int columnIndex) {
        return driver
                .findElement(By.xpath(
                        "//tbody/tr[" + rowIndex + "]/td[" + columnIndex + "]"));
    }

    public WebElement getEditButtonByRowIndex(int index) {
        return driver.findElements(By.className("edit")).get(index);
    }

    public WebElement getDeleteButtonByRowIndex(int index) {
        return driver.findElements(By.className("delete")).get(index);
    }
    public WebElement getEditItemInput(){
        return driver.findElement(By.id("name"));
    }




}

