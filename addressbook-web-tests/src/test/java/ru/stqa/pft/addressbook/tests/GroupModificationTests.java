package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Admin on 01.06.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.app.app.getNavigationHelper().gotoGroupPage();
        app.app.app.getGroupHelper().selectGroup();
app.app.app.getGroupHelper().initGroupModification();
        app.app.app.fillGroupForm("test1", "test2", "test3");
        app.app.app.getGroupHelper().submitGroupModification();
        app.app.app.getGroupHelper().returnToGroupPage();
    }
}
