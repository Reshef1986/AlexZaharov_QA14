import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.*;

public class CreateGroupTestt extends TestBase {




    @Test(priority = 2)
    public void testCreateGroupTesttLongName(){

        goToGroopsPage();
        initGroupCreation();
        fillGroupForm("name", "header", "footer");
        submitGruopCreation();
        returnToGroupPage();
        System.out.println("testCreateGroupTesttLongName() passed");
    }
    @Test (priority = 1)
    public void testCreateGroupTesttShortName(){

        goToGroopsPage();
        initGroupCreation();
        fillGroupForm("n", "h", "f");
        submitGruopCreation();
        returnToGroupPage();
        System.out.println("testCreateGroupTesttShortName() passed");
    }


    @Test (priority = 3,enabled = true)
    public void testCreateGroupTesttEmpty(){
        ;
        goToGroopsPage();
        initGroupCreation();
        fillGroupForm("", "", "");
        submitGruopCreation();
        returnToGroupPage();
        System.out.println("testCreateGroupTesttEmpty()  passed");
    }

}

