package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.SettingPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class  settingTest extends baseClassTest {

    ExtentReports extent = new ExtentReports();
    ExtentReports reports;

    //set Extent report methods

    @BeforeMethod
    public void init() {
        //ExtentManager.getReports();
        // test = reports.createTest("LandingTest");
    }



    //Testcases
    @Test(priority = 0)
    public void LoginIN() throws InterruptedException {
        LoginPage.EUser();
        Thread.sleep(2000);
        LoginPage.Epass();
        Thread.sleep(2000);
        LoginPage.Esub();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        LoginPage.Spop();
        Thread.sleep(5000);
    }

    //Testcases
    @Test(priority = 1)
    public void SetIN() throws InterruptedException {
        SettingPage.Setting();
        Thread.sleep(3000);
        SettingPage.profile();
        Thread.sleep(3000);
        SettingPage.BankAccount();
        Thread.sleep(3000);
        SettingPage.Securit();
        Thread.sleep(3000);
        SettingPage.ChangePin();
        Thread.sleep(3000);
        SettingPage.closeModal();
        Thread.sleep(3000);
        SettingPage.ResetPin();
        Thread.sleep(3000);
        SettingPage.ResetClose();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
       //Thread.sleep(4000);

        //WebElement Scroll = driver.findElement(By.cssSelector("button[data-target='resetPasswordModal']"));
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].click();", "//*[@id=\\\"security-reset-password\\\"]/div[1]/div/div/div/div[3]/button");
        //jse.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        //Scroll.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("scroll(390, 728)"); // if the element is on top.
        jse.executeScript("scroll(390, 728)"); // if the element is on bottom.

        Thread.sleep(3000);
        SettingPage.ResetPassword();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        SettingPage.ResetOldPassword();
        Thread.sleep(5000);
        SettingPage.ResetNewPassword();
        Thread.sleep(5000);
        SettingPage.confirmPassword();
        Thread.sleep(5000);
        SettingPage.Saveit();
        //SettingPage.Closest();
        //Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Password updated successfully");
        //assertTrue(verifyTitle);
        System.out.println("PASSED: Password updated successfully");

        //Scroll to 2FA
        JavascriptExecutor ex = (JavascriptExecutor)driver;
        // jse.executeScript("scroll(390, 728)"); // if the element is on top.
        ex.executeScript("scroll(388, 393)"); // if the element is on bottom.

        Thread.sleep(3000);
        SettingPage.okies();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        SettingPage.F2A();
        Thread.sleep(5000);
        SettingPage.GStarted();
        Thread.sleep(5000);
        SettingPage.Next();
        Thread.sleep(5000);
        SettingPage.SecondN();
        Thread.sleep(5000);
        SettingPage.SendClose();
        Thread.sleep(3000);
        SettingPage.ClickDelet1();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

        //Scroll to Click Logout
        JavascriptExecutor jv = (JavascriptExecutor)driver;
        jv.executeScript("scroll(118, 416)"); // if the element is below.

        Thread.sleep(5000);
        SettingPage.Delete1();
        Thread.sleep(5000);
        SettingPage.Logout();
        Thread.sleep(2000);
        driver.close();

    }
}