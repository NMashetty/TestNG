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
//    protected SelfHealingDriver driver;
	protected WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
    	
    	Properties properties = new Properties();
    	InputStream input = new FileInputStream("src/main/resources/healenium.properties");
    	properties.load(input);
    	boolean flag = Boolean.parseBoolean(properties.getProperty("heal-enabled","true"));
    	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();    	
    	if(flag)
    	driver = SelfHealingDriver.create(driver);    
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
 }

