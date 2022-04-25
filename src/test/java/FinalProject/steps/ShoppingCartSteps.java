package FinalProject.steps;

import FinalProject.POMs.CartPagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class ShoppingCartSteps {
    CartPagePom cartPagePom = new CartPagePom();


    @And("Click continue in Shopping Cart page")
    public void clickContinueInShoppingCartPage() {
        cartPagePom.setPressContinueButton();
    }


    @And("Enter email and password")
    public void enterEmailAndPassword() {
        cartPagePom.setEnterEmail();
        cartPagePom.setEnterPassword();
    }

    @And("Login as User")
    public void loginAsUser() {
        cartPagePom.setClickLogIn();
    }

    @Then("Select a pick up point")
    public void selectAPickUpPoint() {
       cartPagePom.setSelectPickUp();
    }

    @And("^Validate the final price to be (.*)$")
    public void validateTheFinalPriceToBe(String productPrice) {
        cartPagePom.validateProductPrice(productPrice);
    }

    @And("^Validate the final name to be (.*)$")
    public void validateTheFinalNameToBe(String productName) {
        cartPagePom.validateProductName(productName);
    }
}
