package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.RegistrationPage;

public class LandingPage {

    //instantiate webdriver
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate Elements on webpage
    private By ClickUSR = By.cssSelector("input[placeholder='Username']");
    private By ClickEmail = By.xpath("//input[@placeholder='E-mail']");
    private By ClickPwD = By.xpath("//input[@placeholder='Choose Password']");
    private By ComfPWD = By.xpath("//input[@placeholder='Confirm Password']");
    private By Referral = By.xpath("//input[@placeholder='Referral Code (Optional)']");
    private By Submit = By.cssSelector("button[type='sumbit']");

    //Select Actions on Elements
    // Click on Signup
    //public void EInnitSignup(){driver.findElement(By.xpath("//a[contains(text(),'Sign up here')]")).click();};
    //Select Username
    public void EClickUSR() {
        driver.findElement(ClickUSR).sendKeys("wesof5");
    }
    //Select Email
    public void EClickEmail() {
        driver.findElement(ClickEmail).sendKeys("tinahp52+014@gmail.com");
    }
    // Choose Password
    public void EClickPwd() {
        driver.findElement(ClickPwD).sendKeys("Blonde@77");
    }
    // Select Confirm password
    public void EComFirm() { driver.findElement(ComfPWD).sendKeys("Blonde@77");
    }

    public void typeInField( String value){
        String val = value;

        for (int i = 0; i < val.length(); i++){
            char c = val.charAt(i);
            String s = new StringBuilder().append(c).toString();
            driver.findElement(ComfPWD).sendKeys(s);
        }
    }
    // Select referral
    public void Refer() {
        driver.findElement(Referral).sendKeys("");
    }
    // Select Submit Button
    public RegistrationPage subB() {
        driver.findElement(Submit).click();
        return new RegistrationPage(driver);
        }

    }

