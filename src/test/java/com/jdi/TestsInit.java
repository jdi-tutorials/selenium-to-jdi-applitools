package com.jdi;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import jdisite.pages.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;
import static jdisite.utils.DriverUtils.DRIVER;
import static jdisite.utils.DriverUtils.runChromeDriver;

public class TestsInit {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        runChromeDriver();
        DRIVER.navigate().to(HomePage.URL);
    }

    @AfterSuite(alwaysRun = true)
    public static void teardown() throws IOException {
        getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
