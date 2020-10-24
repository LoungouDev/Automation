package stepDefinitions.web;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.web.HomePage;
import core.Base;

public class HomeStep extends Base {

    public static final String PREMIUM_TEXT = "Vos émotions méritent d'avoir leur musique.";

    @When("^Je ferme le popin$")
    public void fermePopin() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.accept.click();
        getScreenshot("homepage");
    }

    @Then("^Le bouton connexion est affiché$")
    public void boutonConnexion() throws Throwable {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.connexion.isDisplayed());
    }


}
