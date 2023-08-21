package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LandingTest extends baseClassTest {

    ExtentReports extent = new ExtentReports();
    ExtentReports reports;
    //LandingPage landingpage = new LandingPage(driver);
    // RegistrationPage registrationPage = new RegistrationPage(driver);

    //set Extent report methods
    @BeforeMethod
    public void init() {
    }

        //ExtentManager.getReports();
        // test = reports.createTest("LandingTest");


    //Testcases
    @Test(priority = 0)
    public void SignUp() throws InterruptedException {
        LandingPage.EClickUSR();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void RegPage() throws InterruptedException {
        //Select the email address field
        LandingPage.EClickEmail();
        Thread.sleep(2000);
        //Select the password Field
        LandingPage.EClickPwd();
        Thread.sleep(2000);
        // Select the confirm password field
        // LandingPage.typeInField("Blonde@77");
        LandingPage.EComFirm();
        Thread.sleep(2000);
        //Select the referral Field
        LandingPage.Refer();
        Thread.sleep(2000);
        //Click the submission button
        LandingPage.subB();
        Thread.sleep(5000);
        //print success message
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("You're almost there!A magic link has been sent to tinahp52+014@gmail.com");
        assertTrue(verifyTitle);
        assertEquals("You're almost there!A magic link has been sent", "You're almost there!A magic link has been sent to tinahp52+014@gmail.com");
        System.out.println("PASSED: You're almost there!A magic link has been sent to tinahp52+014@gmail.com");
        System.out.println("Words Match");
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void switchWindows() throws InterruptedException {
        // change window handle of the main window
        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID" + mainHandle + "\n");

        //Opens a new tab and switches to new tab
        driver.switchTo().window(driver.getWindowHandle());
        Thread.sleep(2000);
        //Go to the login mail link
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        //Click on the mail button
        // driver.findElement(By.xpath("//span[@class='_yb_fomwi _yb_133u3']")).click();
        Thread.sleep(2000);
        //Input Username
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("tinahp52@gmail.com");
        Thread.sleep(5000);
        // click on the Next button
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(5000);
        //Input password
        driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Sweet@17@");

        // Scroll to the element
        WebElement Scroll = driver.findElement(By.xpath("//a[normalize-space()='Confirm Email Address']]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        Scroll.click();


        Set<String> handles = driver.getWindowHandles();
        Iterator<String> its = handles.iterator();

        String firstTab = String.valueOf(its.hasNext());
        String secondTab = String.valueOf(its.hasNext());
        String thirdTab = String.valueOf(its.hasNext());
        driver.switchTo().window(firstTab);
        assertTrue(driver.findElement(By.id("Token has been verified")).isDisplayed());
        Thread.sleep(5000);
        //Click on the next button
       // driver.findElement(By.xpath("//button[@id='login-signin']")).click();

        //Select the Token Email sent
        driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-12 col-lg-12 col-xl-8']//li[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }


}
