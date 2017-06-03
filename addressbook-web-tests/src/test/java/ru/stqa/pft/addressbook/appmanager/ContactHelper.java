package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Admin on 02.06.2017.
 */
public class ContactHelper extends HelperBase {

    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitAddContact() {
        clickContact(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillForms(ContactData contactData) {
        typeContact(By.name("firstname"), contactData.getName());
        typeContact(By.name("lastname"), contactData.getLastname());
        typeContact(By.name("address"), contactData.getAddress());
        typeContact(By.name("home"), contactData.getTelephone());
        clickContact(By.name("theform"));
        typeContact(By.name("email"), contactData.getEmail());
        clickContact(By.name("theform"));
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[17]")).isSelected()) {
            clickContact(By.xpath("//div[@id='content']/form/select[1]//option[17]"));
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[7]")).isSelected()) {
            clickContact(By.xpath("//div[@id='content']/form/select[2]//option[7]"));
        }
        typeContact(By.name("byear"), contactData.getYear());
        clickContact(By.name("theform"));
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[3]")).isSelected()) {
            clickContact(By.xpath("//div[@id='content']/form/select[5]//option[3]"));
        }
    }

    public void goToAddContact() {
        clickContact(By.linkText("add new"));
    }

    public void deleteSelectedContacts() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    }

    public void selectContact() {
        if (!wd.findElement(By.id("16")).isSelected()) {
     wd.findElement(By.id("16")).click();
 }
    }
}

