package PageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HamburgerScreenObjects {

    @AndroidFindBy(id = "com.malmstein.yahnac:id/view_drawer_header_login")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement login;

}
