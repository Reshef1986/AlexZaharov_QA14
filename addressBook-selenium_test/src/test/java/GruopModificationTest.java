import com.telran.addressbook.madel.GruopData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GruopModificationTest extends TestBase {

            @Test
    public  void testGroupModificationTest (){


                app.goToGroopsPage();
                int before=app.getGroupCount();
                app.selectGroup();
                app.initmodifyGroup();
                app.fillGroupForm(new GruopData("new name", "new header", "new footer"));
                app.confirmGroupModification();
                app.returnToGroupPage();
                int after=app.getGroupCount();
                Assert.assertEquals(after,before);

            }



}
