package baseClass;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pageObject.*;

public class baseClassTest {

    public static WebDriver driver;

    public static WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    // Create a Landing page
    protected LandingPage LandingPage;
    protected LoginPage LoginPage;
    protected DashboardPage DashboardPage;
    protected Transaction Transaction;
    protected RegistrationPage RegistrationPage;
    protected walletPage walletPage;
    //protected walletPage2 walletPage2;
    protected SettingPage SettingPage;

    @BeforeTest
    public void SetUp() {
        //Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://app.patriciadev.com/login");
        //driver.findElement(By.xpath("//a[contains(text(),'Sign up here')]")).click();

        //Instantiate pages after launching the browser for Sign up
        LandingPage = new LandingPage(driver);
        LoginPage = new LoginPage(driver);
        DashboardPage = new DashboardPage(driver);
        Transaction =new Transaction(driver);
        walletPage = new walletPage(driver);
        //SettingPage = new SettingPage(driver);
    }

}