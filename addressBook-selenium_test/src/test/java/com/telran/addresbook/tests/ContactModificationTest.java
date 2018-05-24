package com.telran.addresbook.tests;

import com.telran.addresbook.madel.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
            public void contactModification(){
        app.getNavigationHelper().goToContactPage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact();
        }
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillCantactForms(new ContactData()
                .withLastName("New Zaharov")
                .withFirstName("New Alex")
                .withMobile("666")
                .withEmail("new reshef@gmail.com")
                .withCompany("New QaDream")
                .withAddress("Israil"));

        app.getContactHelper().confirmContactModification();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);

    }


}
