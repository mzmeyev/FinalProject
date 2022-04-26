package FinalProject.steps;

import FinalProject.pageobjects.ProductPagePom;
import FinalProject.models.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductPageSteps {
    ShoppingCart shoppingCart = new ShoppingCart();
    ProductPagePom productPagePom = new ProductPagePom();

    @Then("^Find the searchbar and enter (.*)$")
    public void findTheSearchbarAndEnter(String productName) {
        productPagePom.enterProductNameInSearchBar(productName);
    }

    @And("Click the search button")
    public void clickTheSearchButton() {
        productPagePom.setPressSearchButton();
    }

    @And("Click on the product")
    public void clickOnTheProduct() {
        productPagePom.setClickOnProduct();
    }

    @And("Set Product Price and Name")
    public void setProductPriceAndName() {
        shoppingCart.setProductPrice(shoppingCart.getProductPrice());
        shoppingCart.setProductName(shoppingCart.getProductName());
    }

    @And("Scroll down to Add to cart button and Click it")
    public void scrollDownToAddToCartButtonAndClickIt() {
        productPagePom.setClickOnAddToCart();
    }



    @Then("Click Browse the Shopping Cart button")
    public void clickBrowseTheShoppingCartButton() {
        productPagePom.setClickOnViewCart();
    }


}
