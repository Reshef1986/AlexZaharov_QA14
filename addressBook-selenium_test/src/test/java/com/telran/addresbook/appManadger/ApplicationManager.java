package com.telran.addresbook.appManadger;

import com.telran.addresbook.madel.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private  ContactHelper contactHelper;
    private  NavigationHelper navigationHelper ;
    protected WebDriver driver;
    private  GroupHelper groupHelper;

    public void start() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper  = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper = new ContactHelper(driver);
        openAddressbook("http://localhost/addressbook/");
        logIn("admin", "secret");
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


        private boolean isElementPresent(By by) {
            try {
               driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

    private boolean isAlertPresent() {
            try {
               driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
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
