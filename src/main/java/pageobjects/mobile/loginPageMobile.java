package pageobjects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPageMobile {

    @AndroidFindBy(id = "email_edit_text")
    public MobileElement email;

    @AndroidFindBy(id = "pass_edit_text")
    public MobileElement passwd;

    @AndroidFindBy(id = "login_btn")
    public MobileElement btnlogin;

    @AndroidFindBy(id = "dynamic_page_title")
    public MobileElement title;


    public loginPageMobile(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
