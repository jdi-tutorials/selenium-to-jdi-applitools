package com.jdi.tests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.jdi.TestsInit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static java.time.Duration.ofSeconds;
import static jdisite.enums.MenuOptions.ElementsPacks;
import static jdisite.enums.MenuOptions.HTML5;
import static jdisite.pages.Html5Page.CheckHtmlPageOpened;
import static jdisite.pages.JDISite.htmlPage;
import static jdisite.pages.JDISite.selectInMenu;
import static jdisite.utils.DriverUtils.DRIVER;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.testng.Assert.assertEquals;

public class WaitButtonTests extends TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        selectInMenu(ElementsPacks);
        selectInMenu(HTML5);
    }
    @Test
    public void waitButtonTest() {
        CheckHtmlPageOpened();
        // Thread.sleep(3000);
        // WebDriverWait wait = new WebDriverWait(DRIVER, ofSeconds(4));
        // wait.until(visibilityOf(htmlPage.suspendButton));
        htmlPage.suspendButton.click();
        assertEquals(DRIVER.switchTo().alert().getText(), "Suspend button");
    }
}
