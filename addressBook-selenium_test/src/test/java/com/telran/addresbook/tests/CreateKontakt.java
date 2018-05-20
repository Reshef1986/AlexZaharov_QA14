package com.telran.addresbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class CreateKontakt  extends TestBase {

    @Test
    public void testCreateKontakt() throws Exception {
        app.getNavigationHelper().goToContactPage();
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().createContact();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }


}
