import com.telran.addressbook.madel.GruopData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;

    public void start() {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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

    //Общие для группы
    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void goToGroopsPage() {
        driver.findElement(By.linkText("groups")).click();
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

    //ModiyF
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

    //CreateContact
    public void createKontakt() {
        driver.findElement(By.linkText("add new")).click();
    }

    public void clickEnter() {
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void inputEmail(String email) {
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void inputMobile(String mobile) {
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(mobile);
    }

    public void inputAddress(String address) {
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
    }

    public void inputCompany(String company) {
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(company);
    }

    public void inputLastName(String lastName) {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastName);
    }

    public void inputFirstName(String firstName) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstName);
    }

    //Karkas
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

    public void stop() {
        driver.quit();
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }
}
