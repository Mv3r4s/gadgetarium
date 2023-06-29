package stepsMV;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.GadgetariumHomePage;
import pages.LoginPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class CartSteps {
    WebDriver driver = Driver.getDriver();
    GadgetariumHomePage GadHomePage = new GadgetariumHomePage();
    LoginPage loginpage = new LoginPage();


    @Given("the user is on the main page of gadgetarium.us")
    public void the_user_is_on_the_main_page_of_gadgetarium_us() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(Config.getValue("gadgetariumURL"));
    }
    @When("the user selects an item")
    public void the_user_selects_an_item() {
        // Write code here that turns the phrase above into concrete actions
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 500);");
        ApplicationFlow.pause(3000);
        GadHomePage.catalog.click();
        ApplicationFlow.pause(3000);
        GadHomePage.Smartphone.click();

        GadHomePage.catalog.click();
        ApplicationFlow.pause(3000);
        GadHomePage.Laptops.click();

        GadHomePage.catalog.click();
        ApplicationFlow.pause(3000);
        GadHomePage.Tablets.click();


        GadHomePage.catalog.click();
        ApplicationFlow.pause(5000);
        GadHomePage.Smart_watches.click();

        ApplicationFlow.pause(5000);
    }
    @When("adds an item to the cart")
    public void adds_an_item_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(Config.getValue("gadgetariumURL"));
        ApplicationFlow.pause(3000);
        GadHomePage.item1.click();
        ApplicationFlow.pause(3000);
    }
    @Then("the user should be prompted to sign in or register")
    public void the_user_should_be_prompted_to_sign_in_or_register() {
        // Write code here that turns the phrase above into concrete actions
        loginpage.emailInput.sendKeys(Config.getValue("gadgetariumEmail"));
        ApplicationFlow.pause(3000);
        loginpage.passwordInput.sendKeys(Config.getValue("gadgetariumPassword"));
        ApplicationFlow.pause(3000);
        loginpage.signin.click();
        ApplicationFlow.pause(3000);
    }
    @Then("the item should be added to the cart")
    public void the_item_should_be_added_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(Config.getValue("gadgetariumURL"));
        ApplicationFlow.pause(3000);
        GadHomePage.cart.click();
        ApplicationFlow.pause(3000);

    }
    @Then("the item should be displayed in the cart")
    public void the_item_should_be_displayed_in_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        // Perform verification steps
        // For example, locate the item in the cart and check if it is displayed
        GadHomePage.cart.click();
        ApplicationFlow.pause(3000);
        boolean isItemDisplayed = driver.findElement(By.xpath("//main/div/div/a/button")).isDisplayed();
        Assert.assertFalse(isItemDisplayed);

        // Clean up: close the WebDriver
        driver.quit();
    }

    }




