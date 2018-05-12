import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContakt extends TestBase {
    @Test
    public void deleteContaktTest(){
        int before=app.getContactCount();
        app.selectContakt();
        app.deleteContakt();
        app.acceptAlert();
        int after=app.getContactCount();
        Assert.assertEquals(after,before-1);
    }

}
