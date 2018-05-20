package com.telran.addresbook.appManadger;


import com.telran.addresbook.madel.ContactData;
import com.telran.addresbook.madel.GruopData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper  extends  HelperBase{



    public ContactHelper (WebDriver driver) {
       super(driver);
    }

    public void confirmContactModification() {
        click(By.name("update"));

    }

    public void clickEnter() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }


    public void createKontakt() {
       click(By.linkText("add new"));
    }

    public void inputMobile(String mobile) {
        typeForOnepParameterContact(mobile);
    }



    public void inputAddress(String address) {
        typeForOnepParameterContact(address);
    }

    public void inputCompany(String company) {
        typeForOnepParameterContact(company);

    }

    public void inputLastName(String lastName) {
        typeForOnepParameterContact(lastName);

    }

    public void inputFirstName(String firstName) {
        typeForOnepParameterContact(firstName);

    }


    public void inputEmail(String email) {
        typeForOnepParameterContact(email);

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
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("email"),contactData.getEmail());


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
        createKontakt();
        fillCantactForms(new ContactData("n", "h", "f","efe","feqf","fef"));
        clickEnter();

    }

    public boolean isThereAContact() {

         return isElementPresent(By.name("selected[]"));
    }
}
