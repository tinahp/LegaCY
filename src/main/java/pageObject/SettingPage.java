package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingPage {

    //instatiante Webdriver driver
    public WebDriver driver;

    public SettingPage(WebDriver driver) {this.driver = driver;
     }


   //locate  the Web Element
    private By Set = By.xpath("//span[normalize-space()='Settings']");
    private By prof = By.xpath("//h4[normalize-space()='Profile']");
    private By BAccount =By.xpath("//h4[normalize-space()='Bank Account']");
    private By Security =By.xpath("//h4[normalize-space()='Security']");
   //Click on the change pin
    private By Cpin = By.xpath("//button[normalize-space()='Change PIN']");
    private By CloseX = By.xpath("//body/div[@id='app']/div[@class='loader-normal']/div[@class='page-container']/div[@class='page-content']/div[@class='content-wrapper']/div[@class='content']/div/div[@id='security']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]//*[name()='svg']");
    //click on the ResetPin for change pin
    private By Rpin = By.xpath("//button[normalize-space()='Reset Pin']");
    private By RClose = By.xpath("//body/div[@id='app']/div[@class='loader-normal']/div[@class='page-container']/div[@class='page-content']/div[@class='content-wrapper']/div[@class='content']/div/div[@id='security']/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]//*[name()='svg']");
    //Click on RPassword
    private  By Rpasswd = By.cssSelector("button[data-target='resetPasswordModal']");
    private By  RpOldPaswd  = By.cssSelector("body.pace-done:nth-child(2) div.loader-normal div.page-container div.page-content div.content-wrapper div.content div.tab-pane:nth-child(6) div.modal.fade.in.show.resetPasswordModal div.modal-dialog div.modal-content div.modal-body.no-padding-top div.text-center.text-default.mb-20 div.row:nth-child(1) div.col-md-12 div.form-group div.form-sm.inner-addon > input.form-control");
    private By  RpNewPasswd  = By.cssSelector("body.pace-done:nth-child(2) div.loader-normal div.page-container div.page-content div.content-wrapper div.content div.tab-pane:nth-child(6) div.modal.fade.in.show.resetPasswordModal div.modal-dialog div.modal-content div.modal-body.no-padding-top div.text-center.text-default.mb-20 div.row:nth-child(2) div.col-md-12 div.form-group.mb-5 div.form-sm.inner-addon > input.form-control");
    private By  RConPsswd = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)");
    //Click on Save
   private By Save = By.cssSelector("div[role='dialog'] div:nth-child(4) div:nth-child(1) button:nth-child(1)");
    //private By Close = By.cssSelector("div[role='dialog'] div:nth-child(4) div:nth-child(1) button:nth-child(1)");
    //Click on 2fA
    private By Ok = By.cssSelector("body > div:nth-child(15) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)");
    private By FA = By.xpath("//button[normalize-space()='Enable']");
    private By GeTStarted = By.xpath("//button[normalize-space()='Get Started']");
    private By Nexty =By.xpath("//button[normalize-space()='Next']");
    private By SecondNext =By.xpath("//button[normalize-space()='Next']");
    private By SecondClose =By.xpath("//body/div[@id='app']/div[@class='loader-normal']/div[@class='page-container']/div[@class='page-content']/div[@class='content-wrapper']/div[@class='content']/div/div[@id='security']/div[@id='security-2fa']/div[2]/div[1]/div[1]/div[1]/button[1]//*[name()='svg']");
    // Click Delete
    private By Delete =By.xpath("//button[normalize-space()='Delete Account']");
    private By CDelete =By.cssSelector("body > div:nth-child(15) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)");
    private By LOuT = By.xpath("//span[normalize-space()='Logout']");


    //Input Action on the element
   public void Setting(){driver.findElement(Set).click();}
   public void profile(){driver.findElement(prof).click();}
   public void BankAccount(){driver.findElement(BAccount).click();}
   public void Securit(){driver.findElement(Security).click();}
   public void ChangePin(){driver.findElement(Cpin).click();}
   public void closeModal(){driver.findElement(CloseX).click();}

    public void ResetPin(){driver.findElement(Rpin).click();}
    public void ResetClose(){driver.findElement(RClose).click();}
    public void ResetPassword(){driver.findElement(Rpasswd).click();}
    public void ResetOldPassword(){driver.findElement(RpOldPaswd).sendKeys("Blonde@77");}
    public void ResetNewPassword(){driver.findElement(RpNewPasswd).sendKeys("Blonde@88");}
    public void confirmPassword(){driver.findElement(RConPsswd).sendKeys("Blonde@88");}
    public void Saveit(){driver.findElement(Save).click();}
    //public void Closest(){driver.findElement(Close).click();}
    public void okies(){driver.findElement(Ok).click();}
    public void F2A (){driver.findElement(FA).click();}


    public void GStarted(){driver.findElement(GeTStarted).click();}
    public void Next(){driver.findElement(Nexty).click();}
    public void SecondN(){driver.findElement(SecondNext).click();}
    public void SendClose(){driver.findElement(SecondClose).click();}
    public void ClickDelet1(){driver.findElement(Delete).click();}
    public void Delete1(){driver.findElement(CDelete).click();}
    public void Logout(){driver.findElement(LOuT).click();}






}

