
package stepDefinitions.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.web.HomePage;
import pageobjects.web.LoginPage;
import core.Base;


public class LoginStep extends Base {

    //WebDriver driver = getDriver();

    private static final String  CONNECTEZ_VOUS = "Connectez-vous";


    @Given("^Je Navigue vers le site \"([^\"]*)\"$")
    public void navigateSite(String strArg1) throws Throwable {
        driver = initializeDriver();
        driver.get(strArg1);
        HomePage homePage = new HomePage(driver);
        //Attendre le chargement complet de la page
        wait.until(ExpectedConditions.visibilityOf(homePage.popin));


    }

    @When("^Je clique sur connexion$")
    public void cliqueLogin() throws Throwable {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.accept.click();
        homePage.connexion.click();
        //Attendre le text "Connectez-vous"
        Assert.assertEquals(CONNECTEZ_VOUS,loginPage.txtconnectez.getText());

    }

    @Then("^Le captcha affiche$")
    public void captchaFile() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(loginPage.captcha));
    }

    @And("^Je saisis \"([^\"]*)\" et \"([^\"]*)\"$")
    public void saisiLoginPasswd(String strArg1, String strArg2) throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login.sendKeys(strArg1);
        loginPage.passwd.sendKeys(strArg2);

    }

    @And("^Je clique sur login$")
    public void CliqueLogin() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.btnlogin.click();

    }

    @And("^Fermer le navigateur$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }

}