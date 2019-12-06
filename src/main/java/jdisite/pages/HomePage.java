package jdisite.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public static final String URL = "https://jdi-testing.github.io/jdi-light/";
    @FindBy(id ="user-icon") public WebElement userIcon;
    @FindBy(id ="user-name") public WebElement userName;
    @FindBy(css = ".fa-sign-out") public WebElement logout;
}
