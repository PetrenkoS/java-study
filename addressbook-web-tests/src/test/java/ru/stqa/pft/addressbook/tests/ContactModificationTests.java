package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by Admin on 03.06.2017.
 */
public class ContactModificationTests extends TestBase {
@Test

public void testContactModification() {
    ApplicationManager app;
    app.getContactHelper().goToAddContact();

}


}
