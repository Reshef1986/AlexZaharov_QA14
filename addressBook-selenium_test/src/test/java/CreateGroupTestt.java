import com.telran.addressbook.madel.GruopData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTestt extends TestBase {




    @Test(priority = 2)
    public void testCreateGroupTesttLongName(){

        app.goToGroopsPage();

        int before=app.getGroupCount();

        app.initGroupCreation();
        app.fillGroupForm(new GruopData("name", "header", "footer"));
        app.submitGruopCreation();
        app.returnToGroupPage();

        int after=app.getGroupCount();

        //System.out.println("testCreateGroupTesttLongName() passed");
        Assert.assertEquals(after,before+1);
    }
    @Test (priority = 1)
    public void testCreateGroupTesttShortName(){

        app.goToGroopsPage();
        int before=app.getGroupCount();
        app.initGroupCreation();
        app.fillGroupForm(new GruopData("n", "h", "f"));
        app.submitGruopCreation();
        app.returnToGroupPage();
        int after=app.getGroupCount();
       // System.out.println("testCreateGroupTesttShortName() passed");
        Assert.assertEquals(after,before+1);
    }


    @Test (priority = 3,enabled = false)
    public void testCreateGroupTesttEmpty(){
        ;
        app.goToGroopsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GruopData("", "", ""));
        app.submitGruopCreation();
        app.returnToGroupPage();
        System.out.println("testCreateGroupTesttEmpty()  passed");
    }

}

