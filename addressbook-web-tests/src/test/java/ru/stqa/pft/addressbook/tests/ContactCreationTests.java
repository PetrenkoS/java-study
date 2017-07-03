package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactAdd() {

        app.getContactHelper().goToAddContact();
        app.getContactHelper().fillForms(new ContactData("Vlad", "Dyatlov", "Gogolya, 7", "0000000", "vladislav@ngs.ru", "1960"));
        app.getContactHelper().submitAddContact();
    }

}
