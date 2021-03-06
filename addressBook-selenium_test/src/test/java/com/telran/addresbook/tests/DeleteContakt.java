package com.telran.addresbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContakt extends TestBase {
    @Test
    public void deleteContaktTest(){
        app.getNavigationHelper().goToContactPage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact();
        }
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().selectContakt();
        app.getContactHelper().deleteContakt();
        app.getContactHelper().acceptAlert();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before-1);
    }

}
