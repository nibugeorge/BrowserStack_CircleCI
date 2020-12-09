package Utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;

public class AppiumServer {
    static AppiumDriverLocalService service;

    public static void StartAppium() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .withAppiumJS(new File(Config.APPIUMJS_FILEPATH))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withLogFile(new File("target/server.log")));

        service.start();
    }

    public static void StopAppium() {
        if (service != null) {
            service.stop();
        }
    }
}
