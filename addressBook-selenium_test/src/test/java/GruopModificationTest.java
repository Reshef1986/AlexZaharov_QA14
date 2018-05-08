import org.testng.annotations.Test;

public class GruopModificationTest extends TestBase {

            @Test
    public  void testGroupModificationTest (){


                goToGroopsPage();
                selectGroup();
                initmodifyGroup();
                fillGroupForm("new name","new header","new footer");
                confirmGroupModification();
                returnToGroupPage();

            }



}
