package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class GadgetariumHomePage {
    public GadgetariumHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//header/div[2]/div/div/div[2]/div/button")
    public WebElement catalog;
    @FindBy(xpath = "//header/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/ul/li[1]/a")
    public  WebElement Smartphone;
    @FindBy(xpath = "//header/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/ul/li[2]/a")
    public  WebElement Laptops;
    @FindBy(xpath = "//header/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/ul/li[3]/a")
    public  WebElement Tablets;
    @FindBy(xpath = "//header/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/ul/li[4]/a")
    public  WebElement Smart_watches;


    @FindBy(xpath = "//header/div[2]/div/div/div[5]/div/span[3]/a")
    public WebElement cart;

    @FindBy(xpath = "//section[1]/div/div[1]/div/div[2]/div/div/button")
    public WebElement item1;



}