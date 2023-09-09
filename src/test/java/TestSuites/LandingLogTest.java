package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.LoginPage;

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.qameta.allure.model.Status.PASSED;

public class LandingLogTest extends baseClassTest {

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


   @Test(priority = 1)
    public void Login2() throws InterruptedException {
        DashboardPage.board();
        Thread.sleep(3000);
        DashboardPage.TradeBit();
        Thread.sleep(2000);
        DashboardPage.board1();
        Thread.sleep(3000);
        DashboardPage.SkpPop();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        // Scroll to the element(BITTRADECOIN)
        //  WebElement Scroll = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > a:nth-child(1)"));
        //  driver.findElement(By.xpath("//a[@href='/bitcoin/wallet'][normalize-space()='Trade Now']"));
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        //  js.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        //Thread.sleep(6000);
        // Scroll.click();
        // DashboardPage.BitTRADEcoin();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).sendKeys(Keys.CONTROL + "\t");
        // Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@class='other-btn']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[normalize-space()='Dashboard']"));
        //Thread.sleep(2000);
        // driver.findElement(By.xpath("//button[@class='other-btn']")).click();
        //Thread.sleep(2000);

        //driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//button[@class='other-btn']")).click();
        //Thread.sleep(3000);
        // DashboardPage.Ethereumtrade();
        // Thread.sleep(3000);
        //DashboardPage.Refiller();

    }

    // Switch to the next navigation Bar
    @Test(priority = 2)
    public void Transtn() throws InterruptedException {
        Transaction.Transaction();
        Thread.sleep(4000);
        Transaction.Ally();
        Thread.sleep(4000);
        Transaction.success();
        Thread.sleep(4000);
        Transaction.pend();
        Thread.sleep(4000);
        Transaction.Decline();
        Thread.sleep(4000);
        Transaction.Attent();
        Thread.sleep(4000);

    }

    //Click on the next Navigation Bar
    @Test(priority = 3)
    public void walletP() throws InterruptedException {
        walletPage.clickWallet();
        Thread.sleep(3000);
        walletPage.NairaWalpop();
        Thread.sleep(3000);
        walletPage.Pops();
        Thread.sleep(3000);
        walletPage.Transfer();
        Thread.sleep(3000);
        walletPage.peer2peer();
        Thread.sleep(3000);
        walletPage.clickP2p();
        Thread.sleep(3000);
        walletPage.UseeAccount();
        Thread.sleep(3000);
        walletPage.SelectBank();
        Thread.sleep(3000);
        walletPage.ClickWema();
        Thread.sleep(3000);
        walletPage.AccountSelect();
        Thread.sleep(3000);
        walletPage.confirmation();
        System.out.println("PASSED: Tinah Anaelechi Peters");
        Thread.sleep(3000);
        walletPage.Narration();
        Thread.sleep(3000);
        walletPage.Awithdrawal();
        Thread.sleep(3000);
        walletPage.withdrawalbutton();
        Thread.sleep(3000);
        walletPage.Withdrawal();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        walletPage.proceedclick();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Thread.sleep(3000);
        walletPage.ZeroPin();
        Thread.sleep(3000);
        walletPage.FirstPin();
        Thread.sleep(3000);
        walletPage.SecondPin();
        Thread.sleep(3000);
        walletPage.ThirdPin();
        Thread.sleep(3000);
        walletPage.FourthPin();
        Thread.sleep(3000);
        walletPage.FifthPin();
        Thread.sleep(3000);
        walletPage.CZconfirm();
        Thread.sleep(3000);
        walletPage.NNow();
    }


    @Test(priority = 4)
    public void testWallet() throws InterruptedException {

        //Move to Deposit Wallet
        //walletPage.CickReturn();
        // Thread.sleep(3000);
        //walletPage.ClickReturnView();
        // Thread.sleep(3000);
        //walletPage.OkChief();
        //walletPage.Deposity();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // walletPage.Enteramount();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // walletPage.ReturnWallet();

        //Returning to wallet to go to BitCoin section
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //Thread.sleep(3000);
        //WebElement Scroll = driver.findElement(By.xpath("/a[@href='/bitcoin/wallet']//div//div//div//div//a[contains(text(),'View More')]"));
        // JavascriptExecutor jp = (JavascriptExecutor) driver;
        //jp.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        //Scroll.click();

        // waiting up to 10 seconds until wallet button is clicked
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ViewMorre")));
    }

        //Click on the next Navigation Bar(BWallet)
        @Test(priority = 5)
        public void walletP2() throws InterruptedException {
            walletPage.BitReturn();
            Thread.sleep(2000);
            walletPage.BitMorrView();
            Thread.sleep(2000);
            walletPage.BitcoinSell();
            Thread.sleep(2000);
          // walletPage.BitSell();
            Thread.sleep(2000);
           // walletPage.BitNaira();
            Thread.sleep(2000);
            walletPage.AddingUSD();
            Thread.sleep(2000);
            //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            walletPage.ClickBitInput();
            Thread.sleep(4000);

            //Scroll to SubmitButton
            JavascriptExecutor ex = (JavascriptExecutor)driver;
            ex.executeScript("scroll(604, 781)"); // if the element is on bottom.

            //walletPage.ClickButton();
            Thread.sleep(4000);
            walletPage.ClickCancel();

        }
    @Test(priority = 6)
    public void walletP3() throws InterruptedException {
        //Click on the next Navigation Bar(EWallet)
        Thread.sleep(3000);
        walletPage.EthReturned();
        Thread.sleep(3000);
        walletPage.EthV1();
        Thread.sleep(3000);
        walletPage.EthSell1();
        Thread.sleep(3000);
        walletPage.Ethus();
        Thread.sleep(3000);
        walletPage.Entera();
        Thread.sleep(3000);

        driver.close();

    }

}








     //Move to Deposit Wallet

        /* walletPage.Bodyclick();
        //Thread.sleep(3000);
       // walletPage.ClickDposit();
       // Thread.sleep(3000);
        walletPage.EAmount();
        Thread.sleep(3000);
        walletPage.EnterContinue();
        Thread.sleep(3000);
        walletPage.Bwallet();
        Thread.sleep(3000);
    }
            }*/




