package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTest extends BasicTest{
    @Test(priority = 10)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated(){
        driver.get(baseURL + "/home");
        loginPage.getLoginButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "[ERROR], The login route does not appear in the page url");

    }
    @Test(priority = 20)
    public void forbidsVisitsToProfileUrlIfNotAuthenticated(){
        driver.get(baseURL + "/profile");
        loginPage.getLoginButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "[ERROR], The login route does not appear in the page url");

    }@Test(priority = 30)
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated(){
        driver.get(baseURL + "/admin/cities");
        loginPage.getLoginButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "[ERROR], The login route does not appear in the page url");

    }@Test(priority = 40)
    public void forbidsVisitsToAdminUsersUrlIfNotAuthenticated(){
        driver.get(baseURL + "/admin/users");
        loginPage.getLoginButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "[ERROR], The login route does not appear in the page url");

    }
}
