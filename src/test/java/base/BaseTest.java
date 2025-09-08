package base;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class BaseTest {
//    protected WebDriver delegate;
  //  protected SelfHealingDriver driver;
//	protected WebDriver delegate;
	protected WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
    	
    	// WebDriverManager.chromedriver().setup();
    	// delegate = new ChromeDriver();    	
    	// driver = SelfHealingDriver.create(delegate);    
		String nodeURL = "http://localhost:8085";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new RemoteWebDriver(new URL(nodeURL), options);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
 }

