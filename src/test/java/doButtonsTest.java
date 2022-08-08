import org.testng.Assert;
import org.testng.annotations.Test;

public class doButtonsTest extends BaseTest{

    @Test
    public void doButtonsTest(){
        Assert.assertTrue(homePage.findButtonDo1().isEnabled());
        Assert.assertFalse(homePage.findButtonDo2().isEnabled());
        homePage.clickButtonDO1();
        Assert.assertFalse(homePage.findButtonDo1().isEnabled());
        Assert.assertTrue(homePage.findButtonDo2().isEnabled());
        homePage.clickButtonDO2();
        Assert.assertTrue(homePage.findButtonDo1().isEnabled());
        Assert.assertFalse(homePage.findButtonDo2().isEnabled());
    }
}
