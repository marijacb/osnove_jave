package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BasicTest {

    @Test(priority = 10)
    public void visitsTheLoginPage() {
        navPage.getLanguageButton().click();
        loginPage.getLoginButton().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "[ERROR], The login route does not appear in the page url");
    }
        @Test (priority = 20)
        public void checkInputType() {
            loginPage.getLoginButton().click();
            Assert.assertEquals(loginPage.getEmailInput().getAttribute("type"), ("email"),
                    "[ERROR], the email input field for the type attribute has no email value");
            Assert.assertEquals(loginPage.getPasswordInput().getAttribute("type"), ("password"),
                    "[ERROR], the password input field for the type attribute has no password value");

        }
        @Test (priority = 30)
        public void displaysErrorsWhenUserDoesNotExist() {
            String email = "non-existing-user@gmal.com";
            String password = "password123";

            loginPage.getLoginButton().click();
            loginPage.getEmailInput().sendKeys("email");
            loginPage.getPasswordInput().sendKeys("password");
            loginPage.getLoginButtonAfterAdding().click();
            messagePopUpPage.waitPopUpVisible();
            Assert.assertEquals(messagePopUpPage.getElementsWithMessage().getText(), "User does not exists", "[ERROR],  No such text od this page");
            Assert.assertTrue(driver.getCurrentUrl().contains("/login"), "[ERROR], The /login route doesn't appear in the page url");

        }
        @Test(priority = 40)
        public void displaysErrorsWhenPasswordIsWrong(){
        String email= "admin@admin.com";
        String password = "passwoed123";

        loginPage.getLoginButton().click();
        loginPage.getEmailInput().sendKeys("email");
        loginPage.getPasswordInput().sendKeys("password");
        loginPage.getLoginButtonAfterAdding().click();
        Assert.assertEquals(messagePopUpPage.getElementsWithMessage().getText(),
                "User does not exists",
        "[ERROR], No such text od this page");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "[ERROR], The /login route doesn't appear in the page url");

    }
    @Test (priority = 50)
    public void login(){
        String email= "admin@admin.com";
        String password = "12345";

        loginPage.getLoginButton().click();
        loginPage.getEmailInput().sendKeys("email");
        loginPage.getPasswordInput().sendKeys("password");
        loginPage.getLoginButtonAfterAdding().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/home"), "[ERROR], The /home route doesn't appear in the page url");
    }
    @Test (priority = 60)
    public void logout(){
        Assert.assertTrue(navPage.getLogoutButton().isDisplayed(),"[ERROR], Tqhe logout button is not visible on the page");
        navPage.getLogoutButton().click();
    }
}
