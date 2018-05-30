package com.telran.addresbook.appManadger;


import com.telran.addresbook.madel.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class ContactHelper  extends  HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void confirmContactModification() {
        click(By.name("update"));

    }

    public void clickEnter() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }


    public void initCreateKontakt() {
        click(By.linkText("add new"));
    }


    public void selectContakt() {
        click(By.xpath("//input[@name='selected[]']"));

    }


    public int getContactCount() {
        return driver.findElements(By.xpath("//input[@name='selected[]']")).size();
    }

    public void initContactModification() {
        click(By.xpath("//img[@title='Edit']"));

    }

    public void fillCantactForms(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        attach(By.name("photo"), contactData.getPhoto());
        if (isElementPresent(By.xpath("//*[@name='new_group']"))) {
            new Select(driver.findElement(By.xpath("//*[@name='new_group']")));

        }
    }


    public void typeForOnepParameterContact(String mobile) {
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(mobile);
    }

    public void deleteContakt() {

        click(By.xpath("//*[@value='Delete']"));


    }

    public void createContact() {
        initCreateKontakt();
        File photo = new File("src/test/resources/Ya.jpeg");
        fillCantactForms(new ContactData()
                .withAddress("f")
                .withCompany("f")
                .withEmail("fd")
                .withFirstName("fda")
                .withLastName("fad")
                .withMobile("fa")
                .withPhoto(photo));
        clickEnter();

    }

    public boolean isThereAContact() {

        return isElementPresent(By.name("selected[]"));
    }

    public void addInGroup() {

        driver.findElement(By.name("selected[]")).click();;
        if (isElementPresent(By.xpath("//*[@name='new_group']"))) {
            new Select(driver.findElement(By.xpath("//*[@name='new_group']")));

        }
        driver.findElement(By.name("add")).click();
        click(By.xpath("//a[@href='./']"));


    }
}
