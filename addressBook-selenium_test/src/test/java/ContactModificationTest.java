import com.telran.addressbook.madel.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
            public void contactModification(){
        int before=app.getContactCount();
        app.initContactModification();
        app.fillCantactForms(new ContactData("New Alex", "New Zaharov", "New QaDream", "Israil", "666", "new reshef@gmail.com"));
        app.confirmContactModification();
        int after=app.getContactCount();
        Assert.assertEquals(after,before);

    }


}
