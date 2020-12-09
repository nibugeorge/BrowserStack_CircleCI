package PageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginScreenObjects {

    @AndroidFindBy(id = "com.malmstein.yahnac:id/login_header_text")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement title;

    @AndroidFindBy(id = "com.malmstein.yahnac:id/login_username")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement username;

    @AndroidFindBy(id = "com.malmstein.yahnac:id/login_password")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement password;

    @AndroidFindBy(id = "com.malmstein.yahnac:id/login_login")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement loginButton;

    @AndroidFindBy(id = "com.malmstein.yahnac:id/login_error_label")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement loginError;

}
