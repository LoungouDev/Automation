package pageobjects.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id="login_mail")
    public WebElement login;

    @FindBy(id="login_password")
    public WebElement passwd;

    @FindBy(id="login_form_submit")
    public WebElement btnlogin;

    @FindBy(className="unlogged-heading-2")
    public WebElement txtconnectez;

    @FindBy(xpath="//iframe[@title='recaptcha challenge']")
    public WebElement captcha;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
