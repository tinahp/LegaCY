package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class walletPage {
  //instatiante Webdriver driver
  public WebDriver driver;

  public walletPage(WebDriver driver) {
    this.driver = driver;
  }


  //locate  the Web Element
  // locate the Transfer walllet
  private By CWallet = By.xpath("//li[@id='wallet']//a");
  private By CNairaWallet = By.xpath("//a[@class='btn-patricia-mine d-flex center btn-large']");
  private By Viewpop = By.xpath("//button[normalize-space()='OK']");
  private By CTransfer = By.xpath("//button[normalize-space()='Transfer']");
  private By p2p = By.xpath("//div[@class='page-container']//li[1]//button[1]");
  private By Cp2p = By.xpath("//button[normalize-space()='Okay, Got it!']");
  private By UserAccount = By.xpath("//p[@class='text-other']");
  private By Sbank = By.cssSelector("input[placeholder='Select Bank']");
  private By SelectWema = By.xpath("//p[normalize-space()='ALAT by WEMA']");
  private By SelectAccount = By.xpath("//input[@placeholder='Input Account Number']");
  private By ConfirmName  = By.xpath("//p[normalize-space()='Tinah Anaelechi Peters']");
  private By narrate = By.xpath("//textarea[@class='narration']");
  private By WithdrawAmount =By.xpath("//input[@placeholder='Enter Amount']");
  private By withdraw =By.xpath("//button[normalize-space()='Withdraw']");
  private By Clickwithdraw =By.xpath("//button[@class='proceed-btn']");
  //private By ClickBody =By.xpath("//div[@id='transaction-modal']");
 // private By clickProceed  = By.xpath("//button[normalize-space()='Proceed']");
  private By ClickProceed = By. xpath("//button[. = 'Proceed']");
  private By insertFirstPin =By.cssSelector("#pin-input-0");
  private By InsertOne= By.cssSelector("#pin-input-1");
  private By Insert2= By.cssSelector("#pin-input-2");
  private By Insert3= By.cssSelector("#pin-input-3");
  private By Insert4 = By.cssSelector("#pin-input-4");
  private By Insert5 =By.cssSelector("#pin-input-5");
  private By CConfirm = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(8)");
  private By NotNow = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
  // private By InsertOne= By.xpath("//input[@id='pin-input-1']");
  //private By Insert2= By.xpath("//input[@id='pin-input-2']");
 // private By Insert3 =By.xpath("//input[@id='pin-input-2']");
  //private By Insert4 =By.xpath(" //input[@id='pin-input-3']");
  //private By Insert5 =By.xpath("//input[@id='pin-input-4']");
  //private By Insert6 =By.xpath("//input[@id='pin-input-5']");


  //locate the Deposit Wallet
  private By CDposit = By.xpath("//button[normalize-space()='Deposit']");
  private By EnterAmount = By.cssSelector("input[placeholder='Enter Amount']");
  private By EContinue = By.xpath("//body/div[1]");
  private By BackWallet = By.xpath("//p[@class='back mt-10 ml-10']");


  // Input Action on the element{Transfer}
  public void clickWallet() {driver.findElement(CWallet).click();}
  public void NairaWalpop() {driver.findElement(CNairaWallet).click();}
  public void Pops() {driver.findElement(Viewpop).click();}
  public void Transfer() {driver.findElement(CTransfer).click();}
  public void peer2peer() {driver.findElement(p2p).click();}
  public void clickP2p() {driver.findElement(Cp2p).click();}
  public void UseeAccount() {driver.findElement(UserAccount).click();}
  public void SelectBank() {driver.findElement(Sbank).click();}
  public void ClickWema(){driver.findElement(SelectWema).click();}
  public void AccountSelect() {driver.findElement(SelectAccount).sendKeys("0252102903");}
  public void confirmation(){driver.findElement(ConfirmName).click();}
  public void Narration(){driver.findElement(narrate).sendKeys("Withdrawal");}
  public void Awithdrawal(){driver.findElement(WithdrawAmount).sendKeys("300");}
  public void withdrawalbutton(){driver.findElement(withdraw).click();}
  public void Withdrawal(){driver.findElement(Clickwithdraw).click();}
  public void proceedclick(){driver.findElement(ClickProceed).click();}
  public void ZeroPin(){driver.findElement(insertFirstPin).sendKeys("0");}
   public void FirstPin(){driver.findElement(InsertOne).sendKeys("0");}
  public void SecondPin(){driver.findElement(Insert2).sendKeys("0");}
  public void ThirdPin(){driver.findElement(Insert3).sendKeys("0");}
  public void FourthPin(){driver.findElement(Insert4).sendKeys("0");}
  public void FifthPin(){driver.findElement(Insert5).sendKeys("0");}
  public void CZconfirm(){driver.findElement(CConfirm).click();}
  //public void Bodyclick() {driver.findElement(ClickBody).click();}
  public void  NNow(){driver.findElement(NotNow).click();}

  //Input Action on the element{wallet}
  // public void ClickDposit(){driver.findElement(CDposit).click();}
  // public void EAmount() {driver.findElement(EnterAmount).click();}
  //public void EnterContinue() {driver.findElement(EContinue).click();}

  //WALLET2

  //locate  the Web Element Transfer wallet
 // private By ReturnWallet =By.cssSelector("li:nth-child(3) a:nth-child(1)");
 // private By ReturnView = By.xpath("//a[@href='/wallet/naira']//div//div//div//div//a[contains(text(),'View More')]");
  //private By ChiefOK =By.xpath("//button[normalize-space()='OK']");
  //private By Deposit= By.xpath("//button[normalize-space()='Deposit']");
  //private By EnterAmount1=By.xpath("input[placeholder='Enter Amount']");
  //close the browser
/*

  //Input Action on the element{wallet2}
  //public void  CickReturn(){driver.findElement(ReturnWallet).click();}
  // public void  ClickReturnView(){driver.findElement(ReturnView).click();};
  // public void  OkChief(){driver.findElement(ChiefOK).click();}
  //public void  Deposity(){driver.findElement(Deposit).click();}
  //public void  Enteramount(){driver.findElement(EnterAmount1).sendKeys("200");}
*/

  // Return to wallet Navigation to proceed to Bitcoin
  private By  ReturnWallet1 =By.xpath("//span[normalize-space()='Wallet']");
  //public void  ReturnWallet(){driver.findElement(ReturnWallet1);}

  private By BitmoreView2 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[2]/div[1]/div[1]/div[1]/div[4]/a[1]");
  private By sellBitcoin = By.cssSelector("div.col-sm-12.col-xs-12 .mt-20 > div:nth-child(2) a:last-child");
  private By sellBIT= By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3)");
  private By BNairaWallet =By.xpath("//body/div/div[@class='loader-normal']/div[@class='page-container']/div[@class='page-content']/div[@class='content-wrapper']/div[@class='content']/div/div/div[@class='row d-flex align-center']/div[@class='col-lg-6 col-md-12 m-20 p-20 w-100 panel main-sm animated']/div[@class='tabbable buy-sell pb-20']/div[@class='tab-content']/div[@class='tab-pane active']/div/div[1]/div[1]");
  private By AddUSD = By.cssSelector("div[class='input-group'] input[placeholder='0.00']");
  //private  By AddUsD =By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//input[@placeholder='0.00']");
  private By BItInputField =By.cssSelector("div[class='input-group mt-15'] input[placeholder='0.00']");
  private By ButtonBIT =By.cssSelector("div button[class='mt-15 pt-15 btn btn-block btn-primary btn-patricia big']");
  private By BitCancel = By.cssSelector(".text-red.mt-20");



  //Input action to wallet to go to BitCoin
    public void  BitReturn(){driver.findElement(ReturnWallet1).click();}
    public void  BitMorrView(){driver.findElement(BitmoreView2).click();}
    public void  BitcoinSell(){driver.findElement(sellBitcoin).click();}
   // public void  BitSell(){driver.findElement(sellBIT).click();}
   // public  void BitNaira(){driver.findElement(BNairaWallet).click();}
    public void  AddingUSD(){driver.findElement(AddUSD).sendKeys("0.5");}
    public void  ClickBitInput(){driver.findElement(BItInputField ).click();}
    //public void ClickButton(){driver.findElement(ButtonBIT).click();}
    public void ClickCancel(){driver.findElement(BitCancel).click();}



// Returning  to  navigation wallet  to go to Ethereum
    private By  ReturnWallet2 =By.cssSelector("a[class='router-link-exact-active active'] span");
    private By  EthViewMore =By.xpath("//a[@href='/ethereum/wallet']//div//div//div//div//a[contains(text(),'View More')]");
    private By  EthSell =By.xpath("//a[normalize-space()='Sell Ethereum']");
    private By  EthUSDInput = By.xpath("//div[@class='input-group']//input[@placeholder='0.00']");
    private By  ETHInput = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");

    //Input Action on the element{Ethereum}

    public void  EthReturned(){driver.findElement(ReturnWallet2).click();}
    public void  EthV1(){driver.findElement(EthViewMore).click();};
    public void  EthSell1(){driver.findElement(EthSell).click();}
    public void  Ethus(){driver.findElement(EthUSDInput).click();}
    public void  Entera(){driver.findElement(ETHInput).sendKeys("200");}

  // Navigate to the next page
  //public SettingPage NNow() {
  //  driver.findElement(NotNow).click();
   // return new SettingPage(driver);

  }
