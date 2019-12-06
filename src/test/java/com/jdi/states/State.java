package com.jdi.states;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import jdisite.entities.DefaultData;

import static jdisite.pages.JDISite.homePage;
import static jdisite.pages.JDISite.loginForm;

public class State {
    public static void loggedOut() {
        if (homePage.userName.isDisplayed()) {
            if (!homePage.logout.isDisplayed())
                homePage.userIcon.click();
            homePage.logout.click();
        }
    }
    public static void loggedIn() {
        if (!homePage.userName.isDisplayed()) {
            if (loginForm.isHidden())
                homePage.userIcon.click();
            loginForm.loginAs(DefaultData.ROMAN);
        }
    }
}
