import org.junit.After;
import org.junit.Before;

public class testfunclib {

    testfunclib tp=new testfunclib();
    @Before
    public void openBrowser(){
        tp.openBrowser();
    }

     @After
    public void close(){
        tp.close();
   }

}
