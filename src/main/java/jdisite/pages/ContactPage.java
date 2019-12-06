package jdisite.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import jdisite.sections.ContactForm;
import jdisite.sections.ShortContactForm;

import static jdisite.utils.DriverUtils.DRIVER;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static org.testng.Assert.assertEquals;

public class ContactPage {
    public static final String URL = "https://jdi-testing.github.io/jdi-light/contacts.html";
    public static final String TITLE = "Contact Form";
    public ContactForm contactForm = initElements(DRIVER, ContactForm.class);

    public static void CheckContactPageOpened() {
        assertEquals(DRIVER.getCurrentUrl(), ContactPage.URL);
        assertEquals(DRIVER.getTitle(), ContactPage.TITLE);
    }
    public ShortContactForm sContactForm = initElements(DRIVER, ShortContactForm.class);
}
