package stepDefinitions.mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.mobile.loginPageMobile;
import core.BaseMobile;
import pageobjects.mobile.HomePageMobile;

public class LoginStepAndroid extends BaseMobile {
    private static final String  TITLE = "Music";
    private HomePageMobile homePageMobile;
    private loginPageMobile loginPageMobile;
    public LoginStepAndroid() {
        loginPageMobile = new loginPageMobile(driver);
        homePageMobile = new HomePageMobile(driver);
    }

    @When("Je clique sur le bouton login")
    public void loginClick() throws Throwable {
        homePageMobile.connexion.click();
    }
    @And("Je saisi un email valide")
    public void saisiMail() throws Throwable {
        loginPageMobile.email.sendKeys("loungou.ayoub.fst@gmail.com");
    }
    @And("Je saisi un mot de passe valide")
    public void saisiPasswd() throws Throwable {
        loginPageMobile.passwd.sendKeys("Noipein123");
    }
    @And("Je clique sur le bouton login page login")
    public void boutonLogin() throws Throwable {
        loginPageMobile.btnlogin.click();
    }
    @Then("Le titre music s'affiche")
    public void musicTitle() throws Throwable {
        Assert.assertEquals(TITLE,loginPageMobile.title.getText());
    }
}
