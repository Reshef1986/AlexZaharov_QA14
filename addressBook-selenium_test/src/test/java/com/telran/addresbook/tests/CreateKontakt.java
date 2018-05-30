package com.telran.addresbook.tests;

import com.telran.addresbook.madel.ContactData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;

public class CreateKontakt  extends TestBase {

    @Test(enabled = false)
    public void testCreateKontakt() throws Exception {
        app.getNavigationHelper().goToContactPage();
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().createContact();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }

    @Test
    public void createContact() {
        app.getNavigationHelper().goToContactPage();
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().initCreateKontakt();
        File photo=new File("src/test/resources/Ya.jpeg");
        app.getContactHelper().fillCantactForms(new ContactData()
                .withAddress("f")
                .withCompany("f")
                .withEmail("fd")
                .withFirstName("fda")
                .withLastName("fad")
                .withMobile("fa")
                .withPhoto(photo)
                .withGroup("new name"));
        app.getContactHelper().clickEnter();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);

    }



    @Test
    public void addContactInGroup() {
        app.getNavigationHelper().goToContactPage();
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().initCreateKontakt();
        File photo=new File("src/test/resources/Ya.jpeg");
        app.getContactHelper().fillCantactForms(new ContactData()
                .withAddress("f")
                .withCompany("f")
                .withEmail("fd")
                .withFirstName("fda12")
                .withLastName("fad")
                .withMobile("fa")
                .withPhoto(photo)
                .withGroup("new name"));
        app.getContactHelper().clickEnter();
        app.getContactHelper().addInGroup();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);

    }

}
