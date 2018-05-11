import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {
    @Test
    public  void groupDeletionTest(){
        app.goToGroopsPage();
        int before=app.getGroupCount();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
        int after=app.getGroupCount();
        Assert.assertEquals(after,before-1);
    }




}
