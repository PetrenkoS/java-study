package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.app.getNavigationHelper().gotoGroupPage();
        app.app.getGroupHelper().initGroupCreation();
        app.app.fillGroupForm("test1", "test2", "test3");
        app.app.getGroupHelper().submitGroupCreation();
        app.app.getGroupHelper().returnToGroupPage();
    }


}
