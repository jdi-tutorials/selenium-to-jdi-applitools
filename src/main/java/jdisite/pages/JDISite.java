package jdisite.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import jdisite.enums.MenuOptions;
import jdisite.sections.LoginForm;
import org.openqa.selenium.By;

import static jdisite.utils.DriverUtils.DRIVER;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;

public class JDISite {
    public static HomePage homePage = initElements(DRIVER, HomePage.class);
    public static ContactPage contactPage = initElements(DRIVER, ContactPage.class);
    public static Html5Page htmlPage = initElements(DRIVER, Html5Page.class);
    public static MarvelousPage marvelousPage = initElements(DRIVER, MarvelousPage.class);

    public static LoginForm loginForm = initElements(DRIVER, LoginForm.class);
    public static void selectInMenu(MenuOptions value) {
        DRIVER.findElement(By.xpath("//*[contains(@class, 'sidebar-menu')]//span[.='"+value.value+"']"))
                .click();
    }
}
