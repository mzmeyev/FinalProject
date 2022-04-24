package FinalProject.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps {
    @Given("Open HomePage")
    public void openHomePage() {
    open("https://www.1a.lv/");
    Configuration.holdBrowserOpen = true;
    getWebDriver().manage().window().maximize();
    }

    @Then("Dismiss Cookie popup")
    public void dismissCookiePopup() {
        $(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }

    @And("Validate that Home Page is open")
    public void validateThatHomePageIsOpen() {
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo("https://www.1a.lv/");
    }

    @Then("^Find the searchbar and enter (.*)$")
    public void findTheSearchbarAndEnter(String productName) {
        $(By.id("q")).sendKeys(productName);
    }

    @And("Click the search button")
    public void clickTheSearchButton() {
        $(By.className("main-search-submit")).click();
    }

    @And("Scroll down to product")
    public void scrollDownToProduct() {
        $(By.xpath("//a[@data-gtm-link='448154']")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
    }

    @And("Click on the product")
    public void clickOnTheProduct() {
        $(By.xpath("//a[@data-gtm-link='448154']")).click();
    }


    @And("Scroll down to Add to cart button and Click it")
    public void scrollDownToAddToCartButtonAndClickIt() {
        $(By.id("add_to_cart_btn")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
    }

    @Then("Click Browse the Shopping Cart button")
    public void clickBrowseTheShoppingCartButton() {
        $(By.xpath("//a[@class='main-button']")).click();
    }
}
