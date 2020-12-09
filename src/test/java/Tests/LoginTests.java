package Tests;

import PageFunctions.LoginScreenFunctions;
import Utils.AppiumServer;
import Utils.Common;
import Utils.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.*;

public class LoginTests {

    String image1;
    int result1;
    public ExtentReports report;
    public ExtentTest logger;
    public static AppiumDriver<MobileElement> driver;
    LoginScreenFunctions loginScreenFunctions;

    @BeforeTest
    public void Setup() throws Exception {
        report = ExtentManager.Instance();
        //AppiumServer.StartAppium();
        driver= Common.appDriver();
        loginScreenFunctions=new LoginScreenFunctions(driver);
        loginScreenFunctions.GotoLogin(driver);
    }

    @Test(dataProvider = "credentials",priority = 1)
    public void LoginUserTest(String user,String pass)  {
        try{
            logger=report.startTest("Login User Test");
            result1=loginScreenFunctions.UserLogin(user,pass,driver);
            if(result1==1) {
                image1=Common.captureScreenshot(driver,"loginuser_pass_"+user);
                logger.log(LogStatus.PASS, "User login success"+ logger.addScreenCapture(image1));

            }
            else {
                image1 = Common.captureScreenshot(driver, "loginuser_fail_"+user);
                logger.log(LogStatus.FAIL, "User login failed" + logger.addScreenCapture(image1));
            }
        }catch(Exception e){logger.log(LogStatus.ERROR, e.getMessage());}
    }

    @DataProvider(name="credentials")
    public Object[][] data1(){
        Object[][] data1=new Object[5][2];
        data1[0][0]="testapp";
        data1[0][1]="Abcd1234";
        data1[1][0]=" ";
        data1[1][1]="Abcd1234";
        data1[2][0]="testapp";
        data1[2][1]=" ";
        data1[3][0]="      ";
        data1[3][1]="      ";
        data1[4][0]="%^&*()";
        data1[4][1]="!@#$%";
        return data1;
    }

    @AfterTest
    public void EndTest() {
        driver.closeApp();
        //driver.launchApp();
        report.endTest(logger);
        report.flush();
        driver.quit();
        //AppiumServer.StopAppium();
    }

}
