package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class LoginPage {

        WebDriver driver;

        public LoginPage(){
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(name = "email")
        public WebElement emailInput;

        @FindBy(name = "password")
        public WebElement passwordInput;

        @FindBy(xpath = "//body/div[2]/div[2]/div/div[2]/form/button")
        public WebElement signin;

    }


