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

    @And("Scroll down to product")
    public void scrollDownToProduct() {
        productPagePom.scrollDownToProduct();
    }

    @And("Click on the product")
    public void clickOnTheProduct() {
        productPagePom.setClickOnProduct();
    }


    @And("Scroll down to Add to cart button and Click it")
    public void scrollDownToAddToCartButtonAndClickIt() {
        productPagePom.setClickOnAddToCart();
    }

    @And("Set Product Price")
    public void setProductPrice() {
        shoppingCart.setProductPrice(shoppingCart.getProductPrice());
    }

    @And("Set Product Name")
    public void setProductName() {
        shoppingCart.setProductName(shoppingCart.getProductName());
    }

    @Then("Click Browse the Shopping Cart button")
    public void clickBrowseTheShoppingCartButton() {
        productPagePom.setClickOnViewCart();
    }

}
