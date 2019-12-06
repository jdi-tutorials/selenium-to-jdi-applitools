package com.jdi.tests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.DefaultDataProvider.FULL_CONTACT;
import static com.jdi.test.data.DefaultDataProvider.SIMPLE_CONTACT;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.CheckContactPageOpened;
import static jdisite.pages.JDISite.contactPage;
import static jdisite.pages.JDISite.selectInMenu;

public class ContactForm extends TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        selectInMenu(ContactForm);
    }

    @Test
    public void submitContactDataTest() {
        CheckContactPageOpened();
        contactPage.contactForm.submit(FULL_CONTACT);
        contactPage.contactForm.check(FULL_CONTACT);
    }
    @Test
    public void submitContactSimpleDataTest() {
        CheckContactPageOpened();
        contactPage.contactForm.submit(SIMPLE_CONTACT);
        contactPage.contactForm.check(SIMPLE_CONTACT);
    }

    @Test
    public void submitContactFormSimpleTest() {
        CheckContactPageOpened();
        contactPage.sContactForm.submit(FULL_CONTACT);
        contactPage.sContactForm.check(FULL_CONTACT);
    }
}
