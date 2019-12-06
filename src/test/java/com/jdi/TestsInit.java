package com.jdi;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.epam.jdi.light.driver.WebDriverUtils;
import jdisite.pages.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

import static com.epam.jdi.eyes.JDIEyes.*;
import static jdisite.utils.DriverUtils.DRIVER;
import static jdisite.utils.DriverUtils.runChromeDriver;

public class TestsInit {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        runChromeDriver();
        DRIVER.navigate().to(HomePage.URL);
        visualTestInitSelenium();
    }

    @BeforeMethod
    public void before(Method method) {
        newVisualTest(method);
    }

    @AfterSuite(alwaysRun = true)
    public static void teardown() {
        closeAllEyes();
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
