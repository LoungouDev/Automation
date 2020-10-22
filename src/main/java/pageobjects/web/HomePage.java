package pageobjects.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "topbar-login-button")
    public WebElement connexion;

    @FindBy(className ="cookie-message" )
    public WebElement popin;

    @FindBy(xpath ="//span[contains(text(),'ACCEPT')]" )
    public WebElement accept;

    @FindBy(className="logo-deezer")
    public WebElement logo;

    @FindBy(linkText = "Vos émotions méritent d'avoir leur musique.")
    public WebElement prmtxt;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


}
