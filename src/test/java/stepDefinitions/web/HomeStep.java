package stepDefinitions.web;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.web.HomePage;
import core.Base;

public class HomeStep extends Base {

    public static final String PREMIUM_TEXT = "Vos émotions méritent d'avoir leur musique.";

    @When("^Je ferme le popin$")
    public void je_ferme_le_popin() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.accept.click();
    }

    @Then("^Le bouton connexion est affiché$")
    public void bouton_connexion() throws Throwable {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.connexion.isDisplayed());
    }


}
