package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCitiesTests extends BasicTest {
    @Test(priority = 10)
    public void visitsTheAdminCitiesPageAndListCities() {
        loginPage.getLoginButton().click();
        loginPage.getEmailInput().sendKeys("admin@admin.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.getLoginButtonAfterAdding().click();
        navPage.getaAdminButton().click();
        navPage.getCitiesByAdminMenuButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/admin/cities"),
                "[ERROR], [ERROR], The /admin/cities route does not appear in the page url");

    }

    @Test(priority = 20)
    public void checksInputTypesForCreateeEditNewCity() {
        navPage.getaAdminButton().click();
        navPage.getCitiesByAdminMenuButton().click();
        citiesPage.getNewItemButton().click();
        citiesPage.waitForEditDialogToBeVisible();
        Assert.assertTrue(citiesPage.getNewItemButton().getAttribute("type").contains("text"),
                "[ERROR], The city input field has the wrong text");
    }

    @Test(priority = 30)
    public void createNewCity() {
        navPage.getaAdminButton().click();
        navPage.getCitiesByAdminMenuButton().click();
        citiesPage.getNewItemButton().click();
        citiesPage.waitForEditDialogToBeVisible();
Assert.assertEquals(citiesPage.getInputName().getAttribute("type"), "text", "[Error] Name input field should be  'text' by type");

    }
    @Test(priority = 40)
    public void editCity() {
        navPage.getaAdminButton().click();
        navPage.waitForCitiesMenuByAdminToBeVisible();
        navPage.getCitiesByAdminMenuButton();
        citiesPage.getNewItemButton();
        citiesPage.waitForEditDialogToBeVisible();
        citiesPage.getInputName().sendKeys("Nis");
        citiesPage.waitForNumberOfRowsToBe(1);
        citiesPage.getEditButtonByRowIndex(0).click();
        citiesPage.waitForEditDialogToBeVisible();
        citiesPage.getEditItemInput();
        citiesPage.getSaveButtonInEditDialog().click();
        Assert.assertTrue(messagePopUpPage.getSavedSuccessfullyMessage().getText().
                        contains("Saved"),
                "[ERROR]: Message popup text is not 'Saved successfully'"
        );
    }
        @Test(priority = 50)
    public void searchCity() {
            navPage.getaAdminButton().click();
            navPage.waitForCitiesMenuByAdminToBeVisible();
            navPage.getCitiesByAdminMenuButton().click();
            citiesPage.getInputSearch().sendKeys("Nis");
            citiesPage.waitForNumberOfRowsToBe(1);
            Assert.assertTrue(driver.findElement(By.xpath(
                                    "//td [contains(@class, 'text-left')]")).getText()
                            .contains(driver.findElement(By.id("search")).getText()),
                    "[ERROR]: Search result does not match search input");
        }

        @Test(priority = 60)
                public void deleteCity(){
            navPage.getaAdminButton().click();
            navPage.waitForCitiesMenuByAdminToBeVisible();
            navPage.getCitiesByAdminMenuButton().click();
            citiesPage.getInputSearch().sendKeys("Nis");
            citiesPage.waitForNumberOfRowsToBe(1);
            Assert.assertTrue(driver.findElement(By.xpath("//td [contains(@class, 'text-left')]")).getText().
                    contains(driver.findElement(By.id("search")).getText()),
                    "[ERROR]: Search result does not match search input");
            citiesPage.getDeleteButtonByRowIndex(0).click();
            citiesPage.getDeleteButtonInDeleteDialog().click();
            messagePopUpPage.waitForConfirmPopUpToBeVisible();
            Assert.assertTrue(messagePopUpPage.getSavedSuccessfullyMessage().getText()
                    .contains("Deleted successfully"),
                    "[ERROR]: Message popup text is not 'Deleted successfully'");
    }
        }
