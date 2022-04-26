package FinalProject.pageobjects;

import FinalProject.models.ShoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPagePom extends HomePage {
    ShoppingCart shoppingCart = new ShoppingCart();

    private final By searchBar = By.xpath("//input[@placeholder='Ierakstiet, ko vēlaties atrast']");
    private final By searchButton = By.className("main-search-submit");
    private final By productLink = By.xpath("//a[@data-gtm-link='448154']");
    private final By addToCartButton = By.id("add_to_cart_btn");
    private final By viewCartButton = By.xpath("//a[@class='main-button']");

    public void enterProductNameInSearchBar(String productName) {
        shoppingCart.setProductName(productName);
        $(searchBar).sendKeys(shoppingCart.getProductName());
    }

    public void setPressSearchButton() {
        $(searchButton).click();
    }


    public void setClickOnProduct() {
        $(productLink).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
    }

    public void setClickOnAddToCart() {
        $(addToCartButton).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
    }

    public void setClickOnViewCart() {
        $(viewCartButton).click();
    }

}

