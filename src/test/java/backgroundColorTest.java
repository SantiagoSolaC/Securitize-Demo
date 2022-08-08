import org.testng.Assert;
import org.testng.annotations.Test;

public class backgroundColorTest extends BaseTest{

    @Test
    public void backgroundColorTest(){
        homePage.setBgColor("red");
        Assert.assertEquals(homePage.findBgColor() , "background: red;");
    }
}
