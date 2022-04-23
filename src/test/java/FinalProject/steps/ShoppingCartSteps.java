package FinalProject.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class ShoppingCartSteps {

    @And("Validate the product name")
    public void validateTheProductName() {
        String productName = "Spēļu konsole Microsoft XBOX Series S, USB 3.1 / HDMI / Wi-Fi";
        $(By.className("detailed-cart-item__name")).shouldHave(text(productName));

    }

    @And("Click continue in Shopping Cart page")
    public void clickContinueInShoppingCartPage() {
        $(By.name("commit")).click();
    }


    @And("^Enter email (.*) and password (.*)$")
    public void enterEmailAndPassword(String email, String password) {
        $(By.name("user[email]")).sendKeys(email);
        $(By.name("user[password]")).sendKeys(password);
        $(By.name("commit")).click();
    }

    @And("Select a pick up point")
    public void selectAPickUpPoint() {
        $(By.xpath("//input[@value='3207']")).click();
    }


    @Then("Validate the final price")
    public void validateTheFinalPrice() {
        $(By.className("checkout-order-summary")).shouldHave(text("308,99 €"));
    }

}
