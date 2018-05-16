package com.telran.addresbook.tests;

import com.telran.addresbook.appManadger.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {


   public ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.start();
        
    }





    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.getContactHelper().stop();

    }



}
