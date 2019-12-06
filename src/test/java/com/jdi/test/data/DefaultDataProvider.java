package com.jdi.test.data;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import jdisite.entities.ContactInfo;

public class DefaultDataProvider {
    public static ContactInfo SIMPLE_CONTACT = new ContactInfo()
        .setName("Roman").setLastName("Iovlev").setPosition("ChiefQA")
        .setPassportNumber(4321).setPassportSeria(123456)
        .setDescription("JDI - awesome UI autoamtion tool");

    public static ContactInfo FULL_CONTACT = new ContactInfo(
        "Roman", "Full Contact", "ChiefQA","Female", "Other",
        "Sun, Snow","JDI - awesome UI automation tool",
        4321, 123456, true, false
    );
}
