package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transaction {

    // Instantiate Webdriver driver
    public WebDriver driver;

    public Transaction(WebDriver driver) {
        this.driver = driver;
    }

   //Locate the elements
    private By Trans = By.xpath("//span[contains(text(),'Transactions')]");
    //private By Trans = By.xpath("//span[normalize-space()='Transactions']");
    private By All =  By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4)");
    private By successful =By.xpath("//label[normalize-space()='Successful']");
    private By pending = By.xpath("//label[normalize-space()='Pending']");
    private By Declination =By.xpath("//label[normalize-space()='Declined']");
    private By Attention = By.xpath("//label[normalize-space()='Attention']");

    //Select Actions on Elements
    public void Transaction(){driver.findElement(Trans).click();}
    public void Ally(){driver.findElement(All).click();}
    public void success(){driver.findElement(successful).click();}
    public void pend(){driver.findElement(pending).click();}
    public void Decline(){driver.findElement(Declination).click();}
   // public void Attent(){driver.findElement(Attention).click();

  // Navigate to the next Page
        public walletPage Attent() {
            driver.findElement(Attention).click();
            return new walletPage(driver);

   }
}
