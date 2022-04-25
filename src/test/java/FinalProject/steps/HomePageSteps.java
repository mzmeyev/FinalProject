package FinalProject.steps;


import FinalProject.POMs.HomePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HomePageSteps{
    HomePagePom homePagePom = new HomePagePom();


    @Given("Open HomePage")
    public void openHomePage() {
        homePagePom.open1alvPage();
    }

    @Then("Dismiss Cookie popup")
    public void dismissCookie() {
        homePagePom.pressDismissCookie();
    }

    @And("^Validate that Home Page is open (.*)$")
    public void validateThatHomePageIsOpen(String url) {
        homePagePom.validateThatHomePageIsOpen(url);
    }

    @Then("^Find the searchbar and enter (.*)$")
    public void findTheSearchbarAndEnter(String productName) {
        homePagePom.enterProductNameInSearchBar(productName);
    }

    @And("Click the search button")
    public void clickTheSearchButton() {
        homePagePom.setPressSearchButton();
    }

    @And("Scroll down to product")
    public void scrollDownToProduct() {
        homePagePom.scrollDownToProduct();
    }

    @And("Click on the product")
    public void clickOnTheProduct() {
        homePagePom.setClickOnProduct();
    }


    @And("Scroll down to Add to cart button and Click it")
    public void scrollDownToAddToCartButtonAndClickIt() {
        homePagePom.setClickOnAddToCart();
    }

    @Then("Click Browse the Shopping Cart button")
    public void clickBrowseTheShoppingCartButton() {
        homePagePom.setClickOnViewCart();
    }

}
