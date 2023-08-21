package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Instantiate Webdriver driver
    public WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locate Elements on webpage
    private By Dboard = By.xpath(" //span[contains(text(),'Dashboard')]");
    private By TradeB = By.xpath("//button[normalize-space()='Trade Bitcoin']");
    private By Dboard1 = By.xpath(" //span[normalize-space()='Dashboard']");
    private By Skippop = By.xpath("//button[@class='other-btn']");
    private By Glover = By.xpath("//button[@class='mt-20']");
  //  private By BitTRAde = By.cssSelector("//body/div[@id='app']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]/a[1]");
    private By Ethtrade = By. xpath("//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[2]/a/div/div/div/a");
    private By Refill  = By.xpath("//a[@href='/refill'][normalize-space()='Trade Now']");


    //Select Actions on Elements
    public void board() {driver.findElement(Dboard).click();}
     // Click on TradeBitcoin
    public void TradeBit() {driver.findElement(TradeB).click();}
    // Click on the dashboard button again
    public void board1() {driver.findElement(Dboard1).click();}
    //Click on Skip Pop
    public void SkpPop() {driver.findElement(Skippop).click();}
    //Click on Glover Airtime
    public void GloverAir() {driver.findElement(Glover).click();}
    //Click on tradeBITnow
    //public void BitTRADEcoin() {driver.findElement(BitTRAde).click();}
    // Click on Ethereum
   //  public void Ethereumtrade() {driver.findElement(Ethtrade).click();}

    // Click submit to navigate to the Transaction
    public Transaction Refiller() {
        driver.findElement(Refill).click();
        return new Transaction(driver);
    }

    }



