package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    // Instantiate Webdriver driver
    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locate Element on Webpage

    //private By confirmEmail = By.xpath("//b[normalize-space()='tinahp52+89@gmail.com']");
    // private By SelectDropdown = By.xpath("//select[@required='required']");
    //private By SelectCountry = By.xpath("//select[@required='required']");

    // click on the confirm  email
    // public void VconfirmEmail(String CEmail) throws InterruptedException {
    //     WebElement confirmEmail = driver.findElement(By.xpath("//b[normalize-space()='tinahp52+89@gmail.com']"));
    //    confirmEmail.sendKeys(CEmail);
    //  }

    By Ecountry = By.xpath("//select[@class='form-control']");
    By EphoneCode = By.cssSelector(".input-group select[class='form-control selectCountry']");
    By Ephoneno = By.xpath("//input[@type='number']");


    public void Scountry() {

        WebElement Countries = driver.findElement(Ecountry);
        Select country = new Select(Countries);
        country.selectByVisibleText("Nigeria");
    }
        public void Sphonecode() {
            WebElement Phonecode = driver.findElement(EphoneCode);
            Select sel = new Select(Phonecode);
            sel.selectByIndex(1);
        }
            public void Sphoneno() {
                WebElement Phoneno = driver.findElement(Ephoneno);
                Select no = new Select(Phoneno);
                no.selectByIndex(1);

            }

        }












