package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTests extends BasicTest {
    @Test(priority = 10)
    public void visitsTheSignupPage() {
        navPage.getSignupButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"),
                "[ERROR],The singup  route does not appear in the page url ");
    }

    @Test(priority = 20)
    public void checksInputTypes() {
        navPage.getSignupButton().click();

        Assert.assertEquals(signupPage.getEmailInput().getAttribute("type"), "email",
                "[ERROR], The email input field for the type attribute has no email value ");
        Assert.assertEquals(signupPage.getPasswordInput().getAttribute("type"), "password",
                "[ERROR], The password input field for the type attribute has no password value ");
        Assert.assertEquals(signupPage.getConfirmPasswordInput().getAttribute("type"), "password",
                "[ERROR], The password input field for the type attribute has no password value ");
    }

    @Test(priority = 30)
    public void displaysErrorsWhenUserAlreadyExists() {
        navPage.getSignupButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"),
                "[ERROR],The singup  route does not appear in the page url");
        signupPage.getNameInput().sendKeys("Another User");
        signupPage.getEmailInput().sendKeys("admin@admin.com");
        signupPage.getPasswordInput().sendKeys("12345");
        signupPage.getConfirmPasswordInput().sendKeys("12345");
        signupPage.getSingMeUpButton().click();
        messagePopUpPage.waitPopUpVisible();
        Assert.assertEquals(messagePopUpPage.getElementsWithMessage().getText(),
                "E-mail already exists", "[ERROR]");
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"), "[ERROR], The singup  route does not appear in the page url");
    }

    @Test(priority = 40)
    public void signup() {
        navPage.getSignupButton().click();
        signupPage.getNameInput().sendKeys("Marija Barjaktarevic");
        signupPage.getEmailInput().sendKeys("marija.barjaktarevic@itbootcamp.rs");
        signupPage.getPasswordInput().sendKeys("12345");
        signupPage.getConfirmPasswordInput().sendKeys("12345");
        signupPage.getSingupButtonAfterAdding().click();
        Assert.assertEquals(messagePopUpPage.getElementsWithMessage().getText(),
                "IMPORTANT: Verify your account", "The dialog does not contain a message");
        messagePopUpPage.getCloseButtonFromPopUpDialog().click();
        navPage.getLogoutButton().click();

    }
}
