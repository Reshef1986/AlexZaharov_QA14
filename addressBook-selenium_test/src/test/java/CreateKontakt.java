

import org.testng.Assert;
import org.testng.annotations.*;

public class CreateKontakt  extends TestBase{

    @Test
    public void testCreateKontakt() throws Exception {
        int before=app.getContactCount();
        app.createKontakt();
        app.inputFirstName("Alex");
        app.inputLastName("Zaharov");
        app.inputCompany("QaDream");
        app.inputAddress("ssr");
        app.inputMobile("0527576060");
        app.inputEmail("reshef1986@gmail.com");
        app.clickEnter();
        int after=app.getContactCount();
        Assert.assertEquals(after,before+1);
    }


}
