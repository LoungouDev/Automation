package pageobjects.mobile;

import core.BaseMobile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageMobile extends BaseMobile {



    @AndroidFindBy(id = "welcome_log_in_btn")
    public MobileElement connexion;

    public HomePageMobile(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
