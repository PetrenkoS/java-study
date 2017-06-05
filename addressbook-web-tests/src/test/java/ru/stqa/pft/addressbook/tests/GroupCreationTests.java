package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.app.app.getNavigationHelper().gotoGroupPage();
        app.app.app.getGroupHelper().initGroupCreation();
        app.app.app.fillGroupForm("test1", "test2", "test3");
        app.app.app.getGroupHelper().submitGroupCreation();
        app.app.app.getGroupHelper().returnToGroupPage();
    }


}
