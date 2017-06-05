package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Admin on 03.06.2017.
 */
public class ContactModificationTests extends TestBase {
@Test

public void testContactModification() {
    app.gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.submitContactModification();
    app.gotoHomePage();

}


}
