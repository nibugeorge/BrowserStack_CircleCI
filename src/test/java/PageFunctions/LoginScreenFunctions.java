package PageFunctions;

import PageElements.HamburgerScreenObjects;
import PageElements.HomeScreenObjects;
import PageElements.LoginScreenObjects;
import Utils.Common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginScreenFunctions {

    int n;
    LoginScreenObjects loginScreenObjects = new LoginScreenObjects();
    HamburgerScreenObjects hamburgerScreenObjects=new HamburgerScreenObjects();
    HomeScreenObjects homeScreenObjects=new HomeScreenObjects();

    public LoginScreenFunctions(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(5)), loginScreenObjects);
        PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(5)), hamburgerScreenObjects);
        PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(5)), homeScreenObjects);
    }

    public int GotoLogin(AppiumDriver<MobileElement> driver) {
        Common.waitForPageToLoad(driver, homeScreenObjects.articleTitle);
        homeScreenObjects.hamburger.click();
        hamburgerScreenObjects.login.click();
        Common.waitForPageToLoad(driver, loginScreenObjects.title);
        if (Common.isElementPresent(loginScreenObjects.title)) {
            n = 1;
        } else {
            n = 0;
        }
        return n;
    }


    public int UserLogin(String user,String pass,AppiumDriver<MobileElement> driver) {
        Common.waitForPageToLoad(driver, loginScreenObjects.title);
        loginScreenObjects.username.clear();
        loginScreenObjects.username.sendKeys(user);
        loginScreenObjects.password.clear();
        loginScreenObjects.password.sendKeys(pass);
        //driver.hideKeyboard();
        loginScreenObjects.loginButton.click();
        Common.waitForPageToLoad(driver, loginScreenObjects.loginButton);
        if (Common.isElementPresent(loginScreenObjects.loginError)) {
            n = 0;
        } else {
            n = 1;
        }
        return n;
    }

}
