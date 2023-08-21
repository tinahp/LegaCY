package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage {

    //instantiate webdriver
    public WebDriver driver;

    public VerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locate Element on Webpage
    // click on the verification link
    // Open a new tab to get Token sent
    private By EmailVEr = By.xpath("//a[normalize-space()='Confirm Email Address']");
}