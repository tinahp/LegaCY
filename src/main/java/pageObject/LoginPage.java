package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // Instantiate Webdriver driver
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate Elements on webpage
    private By EUsername = By.xpath("//input[@placeholder='Username']");
    private By EPassword = By.xpath("//input[@placeholder='Password']");
    private By ESubmit = By.xpath("//button[@type='submit']");
    private By Skippop = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(6)");

    //Select Actions on Elements
    // Input Log in Information
    // Input Username
    public void EUser() {
        driver.findElement(EUsername).sendKeys("tinahp52+17@gmail.com");}
    //Input Password
    public void Epass() {
        driver.findElement(EPassword).sendKeys("Blonde@88");}
    //Click on Submit
    public void Esub(){
        driver.findElement(ESubmit).click();
    }

  //  Navigate to the Dashboard
     public DashboardPage Spop() {
         driver.findElement(Skippop).click();
         return new DashboardPage(driver);
    }
}

