
package activity;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NavigationTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

//        // set path of Chromedriver executable
//        System.setProperty("webdriver.chrome.driver",
//                "./src/test/resources/drivers/chromedriver/");
//
//        // initialize new WebDriver session
//        driver = new ChromeDriver();
        
        System.setProperty("webdriver.gecko.driver",
                "./src/test/resources/drivers/chromedriver/");
        WebDriver driver = new FirefoxDriver();
        
    }

    @Test
    public void navigateToAUrl() {
        // navigate to the web site
        driver.get("http://navihedge-fe.s3-website-ap-southeast-2.amazonaws.com/Client");
        // Validate page title
        Assert.assertEquals(driver.getTitle(), "Navihedge");
    }
    @AfterMethod
    public void afterMethod() {

//Sont
    	// close and quit the browser
        driver.quit();
    }
}
