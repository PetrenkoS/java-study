package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
       app.app.getNavigationHelper().gotoGroupPage();
        app.app.getGroupHelper().selectGroup();
        app.app.getGroupHelper().deleteSelectedGroups();
        app.app.getGroupHelper().returnToGroupPage();
    }


}
