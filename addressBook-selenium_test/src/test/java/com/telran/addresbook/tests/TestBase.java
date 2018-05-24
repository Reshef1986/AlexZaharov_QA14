package com.telran.addresbook.tests;

import com.telran.addresbook.appManadger.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {


   public static ApplicationManager app = new ApplicationManager(BrowserType.IE);

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.start();
        
    }





    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }

}
