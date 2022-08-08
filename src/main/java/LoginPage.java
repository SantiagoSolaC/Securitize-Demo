import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameLocator = By.cssSelector("input[placeholder='username']");
    By passwordLocator = By.cssSelector("input[placeholder='password']");
    By loginButton = By.cssSelector("button[name='login']");


    public void login(String username, String password){
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButton).click();
    }

}