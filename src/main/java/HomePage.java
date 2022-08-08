import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public By locatorButtonDO1 = By.id("do1");
    public By locatorButtonDO2 = By.id("do2");
    public By locatorButtonIncreaseFont = By.id("btnIncreaseFont");
    public By locatorButtonDecreaseFont = By.id("btnDecreaseFont");
    public By textFontSize = By.id("textFontSize");
    public By inputBgColor = By.id("bgColor");
    public By buttonSetBgColor = By.id("btnSetBgColor");
    public By locatorBgColor = By.id("formToColorize");

    public WebElement findButtonDo1() {
        return driver.findElement(locatorButtonDO1);
    }

    public void clickButtonDO1() {
        findButtonDo1().click();
    }

    public WebElement findButtonDo2() {
        return driver.findElement(locatorButtonDO2);
    }

    public void clickButtonDO2() {
        findButtonDo2().click();
    }

    public void clickButtonIncreaseFont() {
        driver.findElement(locatorButtonIncreaseFont).click();
    }

    public void clickButtonDecreaseFont() {
        driver.findElement(locatorButtonDecreaseFont).click();
    }

    public String findTextFontSize() {
        return driver.findElement(textFontSize).getCssValue("font-size");
    }

    public void setBgColor(String color) {
        driver.findElement(inputBgColor).sendKeys(color);
        driver.findElement(buttonSetBgColor).click();
    }

    public String findBgColor() {
        return driver.findElement(locatorBgColor).getAttribute("style");
    }

}
