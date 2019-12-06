package com.jdi.tests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static jdisite.enums.MenuOptions.Service;
import static jdisite.enums.MenuOptions.UserTable;
import static jdisite.pages.JDISite.marvelousPage;
import static jdisite.pages.JDISite.selectInMenu;
import static org.testng.Assert.assertTrue;

public class UsersTest extends TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        selectInMenu(Service);
        selectInMenu(UserTable);
    }
    @Test
    public void verifyUsersTest() {
        assertTrue(marvelousPage.userTable.isDisplayed());
        assertTrue(marvelousPage.userRow2.isDisplayed());
        assertTrue(marvelousPage.descriptionOfUser2.isDisplayed());
        assertTrue(marvelousPage.imageOfUser2.isDisplayed());
    }
}
