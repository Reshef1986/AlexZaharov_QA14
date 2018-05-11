

import org.testng.annotations.*;

public class CreateKontakt  extends TestBase{

    @Test
    public void testCreateKontakt() throws Exception {
        app.createKontakt();
        app.inputFirstName("Alex");
        app.inputLastName("Zaharov");
        app.inputCompany("QaDream");
        app.inputAddress("ssr");
        app.inputMobile("0527576060");
        app.inputEmail("reshef1986@gmail.com");
        app.clickEnter();
    }


}
