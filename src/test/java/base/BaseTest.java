package base;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
//    protected WebDriver delegate;
    protected SelfHealingDriver driver;
	protected WebDriver delegate;
    @BeforeClass
    public void setup() throws IOException {
    	
    	WebDriverManager.chromedriver().setup();
    	delegate = new ChromeDriver();    	
    	driver = SelfHealingDriver.create(delegate);    
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
 }

