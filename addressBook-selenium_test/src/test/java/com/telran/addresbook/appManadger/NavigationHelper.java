package com.telran.addresbook.appManadger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;


    public NavigationHelper(WebDriver driver) {
        this.driver=driver;
    }

    public void goToGroopsPage() {

      driver.findElement(By.linkText("groups")).click();
    }
}
