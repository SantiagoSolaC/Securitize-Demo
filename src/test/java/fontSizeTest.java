import org.testng.Assert;
import org.testng.annotations.Test;

public class fontSizeTest extends BaseTest{

    @Test
    public void fontSizeTest(){
        Assert.assertEquals(homePage.findTextFontSize() , "20px");
        homePage.clickButtonIncreaseFont();
        Assert.assertEquals(homePage.findTextFontSize(), "23px");
        homePage.clickButtonDecreaseFont();
        Assert.assertEquals(homePage.findTextFontSize(), "20px");
    }
}
