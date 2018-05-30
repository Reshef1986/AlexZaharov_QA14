package com.telran.addresbook.appManadger;

import com.telran.addresbook.madel.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;
    private  ContactHelper contactHelper;
    private  NavigationHelper navigationHelper ;
    private  GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void start() {

        if(browser.equals(BrowserType.CHROME)){
            driver=new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            driver=new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.IE)){
            driver=new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
        groupHelper  = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper = new ContactHelper(driver);
        openAddressbook("http://localhost/addressbook/");
        logIn("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public void openAddressbook(String url) {
       driver.get(url);
    }

    public void logIn(String user, String pwd) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }








    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
