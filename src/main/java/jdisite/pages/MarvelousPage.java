package jdisite.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarvelousPage {
    @FindBy(id = "user-table") public WebElement userTable;
    @FindBy(xpath = "//*[@id='user-table']//tr[2]")
    public WebElement userRow2;
    @FindBy(xpath = "//*[@id='user-table']//tr[2]/td[4]")
    public WebElement descriptionOfUser2;
    @FindBy(xpath = "//*[@id='user-table']//tr[2]/td[4]//img")
    public WebElement imageOfUser2;
}
