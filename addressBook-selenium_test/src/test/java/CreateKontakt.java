

import org.testng.annotations.*;

public class CreateKontakt  extends TestBase{

    @Test
    public void testCreateKontakt() throws Exception {
        createKontakt();
        inputFirstName("Alex");
        inputLastName("Zaharov");
        inputCompany("QaDream");
        inputAddress("ssr");
        inputMobile("0527576060");
        inputEmail("reshef1986@gmail.com");
        clickEnter();
    }


}
