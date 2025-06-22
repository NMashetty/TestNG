package pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

//    private SelfHealingDriver driver;
//
//    public LoginPage(SelfHealingDriver driver) {
//        this.driver = driver;
//    }
	private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }	
	

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
