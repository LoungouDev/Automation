package stepDefinitions.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.mobile.HomePageMobile;
import core.BaseMobile;

import java.io.IOException;
import java.net.MalformedURLException;

public class HomeStepAndroid extends BaseMobile {

    private HomePageMobile appHomePageMobile;
    public HomeStepAndroid() {
        try {
            this.driver = iniDriver();
            appHomePageMobile = new HomePageMobile(this.driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("^Je lance application Deezer$")
    public void lancerApp() throws Throwable {
        Assert.assertTrue(appHomePageMobile.connexion.isDisplayed());
    }

    @Given("^La home page s'affiche correctement$")
    public void homeAffiche() throws Throwable {
        Assert.assertTrue(appHomePageMobile.connexion.isDisplayed());
    }

    @Then("Je quitte l'application")
    public void closeApplication() throws Throwable {
        this.driver.quit();
    }

}
