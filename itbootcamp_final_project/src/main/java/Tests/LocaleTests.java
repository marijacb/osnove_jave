package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest {
    @Test(priority = 10)
    public void setLocaleToES(){
        navPage.getLanguageButton().click();
        navPage.getEsButtonLanguage().click();
        Assert.assertTrue(navPage.getHeaderFromChangeLanguage().getText().contains("Página de aterrizaje"),
                "[ERROR],Doesn't contain the appropriate text");
    }
    @Test(priority = 20)
    public void setLocaleToEN(){
        navPage.getLogoutButton().click();
        navPage.getEngButtonLanguage().click();
        Assert.assertTrue(navPage.getHeaderFromChangeLanguage().getText().contains("Landing"),
                "[ERROR],Doesn't contain the appropriate text");
    }
    @Test(priority = 30)
    public void setLocaleToCN(){
        navPage.getLanguageButton().click();
        navPage.getCnButtonLanguage().click();
        Assert.assertTrue(navPage.getHeaderFromChangeLanguage().getText().contains("首页"),
                "[ERROR],Doesn't contain the appropriate text");
    }
    @Test(priority = 30)
    public void setLocaleToFR(){
        navPage.getLanguageButton().click();
        navPage.getFrButtonLanguage().click();
        Assert.assertTrue(navPage.getHeaderFromChangeLanguage().getText().contains("Page d'atterrissage"),
                "[ERROR],Doesn't contain the appropriate text");
    }
}
