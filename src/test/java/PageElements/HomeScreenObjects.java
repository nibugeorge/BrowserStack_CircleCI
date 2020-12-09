package PageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreenObjects {

    @AndroidFindBy(xpath = "//*[@text='Hacker News']")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement title;

    @AndroidFindBy(id = "com.malmstein.yahnac:id/article_title")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement articleTitle;

    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'')]")
    public MobileElement hamburger;

}
