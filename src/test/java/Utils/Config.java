package Utils;

public class Config {

    //Appium
    public static final String APPIUMJS_FILEPATH = "//usr//local//lib//node_modules//appium//build//lib//main.js";
    public static final String PROP_FILEPATH = "./Property/platform.properties";

    //Screenshot
    public static final String SCREENSHOTS_FILEPATH = "./Screenshots/";

    //Reporting
    public static final String IOSREPORT_FILEPATH = "./Reports/IosSanityReport.html";
    public static final String IOSREPORTCONFIG_FILEPATH = "./src/main/resources/extent-iosconfig.xml";
    public static final String ANDROIDREPORT_FILEPATH = "./Reports/AndroidSanityReport.html";
    public static final String ANDROIDREPORTCONFIG_FILEPATH = "./src/main/resources/extent-androidconfig.xml";

    //Android Capabilities
    public static final String DEVICE_NAME_AND = "Pixel3a";
    public static final String APP_PACKAGE = "com.malmstein.yahnac";
    public static final String APP_ACTIVITY = "com.malmstein.yahnac.stories.NewsActivity";
    public static final String PLATFORM_NAME_AND = "Android";
    public static final String PLATFORM_VERSION_AND = "9.0";
    public static final String LANGUAGE = "en";
    public static final String ANDROID_APP_FILEPATH = "./src/main/resources/app-debug.apk";
    public static final String AUTOMATION_NAME_AND = "uiautomator2";
    public static final String FULL_RESET = "false";

    //iOS Capabilities
    public static final String DEVICE_NAME_IOS = "iPhone 6";
    public static final String PLATFORM_NAME_IOS = "iOS";
    public static final String PLATFORM_VERSION_IOS = "10.2";
    public static final String UDID = "A7375FA22F454C438BABC35C49D20CDE";
    public static final String BUNDLEID = "com.example.test";
    public static final String AUTOMATION_NAME_IOS= "XCUITest";
    public static final String IOS_APP_FILEPATH = "./src/main/resources/appdebug.app";

    public static final String APPIUMSERVER_URL = "http://127.0.0.1:4723/wd/hub";

}
