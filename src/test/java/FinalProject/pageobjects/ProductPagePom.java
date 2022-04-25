package FinalProject.pageobjects;

import FinalProject.config.HomePage;
import FinalProject.models.ShoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPagePom extends HomePage {

    ShoppingCart shoppingCart = new ShoppingCart();

    public void enterProductNameInSearchBar(String productName) {
        shoppingCart.setProductName(productName);
        $(By.xpath("//input[@placeholder='Ierakstiet, ko vēlaties atrast']")).sendKeys(shoppingCart.getProductName());
    }

    public void setPressSearchButton() {
        $(By.className("main-search-submit")).click();
    }

    public void scrollDownToProduct() {
        $(By.xpath("//a[@data-gtm-link='448154']")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
    }

    public void setClickOnProduct() {
        $(By.xpath("//a[@data-gtm-link='448154']")).click();
    }

    public void setClickOnAddToCart() {
        $(By.id("add_to_cart_btn")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
    }

    public void setClickOnViewCart() {
        $(By.xpath("//a[@class='main-button']")).click();
    }

}

