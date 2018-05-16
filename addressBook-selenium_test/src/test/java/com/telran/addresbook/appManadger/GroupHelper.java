package com.telran.addresbook.appManadger;

import com.telran.addresbook.madel.GruopData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
   private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver=driver;
    }


    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGruopCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GruopData gruopData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(gruopData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(gruopData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(gruopData.getFooter());
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }


    public void initmodifyGroup() {
        driver.findElement(By.name("edit")).click();
    }

    public void confirmGroupModification() {
        driver.findElement(By.name("update")).click();
    }

    //DelentGroup
    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }
}
