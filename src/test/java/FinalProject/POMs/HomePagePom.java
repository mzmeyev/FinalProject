package FinalProject.POMs;

import FinalProject.models.ShoppingCart;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePagePom{

    ShoppingCart shoppingCart = new ShoppingCart();

    public void open1alvPage() {
        open("https://www.1a.lv/");
        Configuration.holdBrowserOpen = true;
        getWebDriver().manage().window().maximize();
    }

    public void pressDismissCookie() {
        $(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }

    public void validateThatHomePageIsOpen(String url) {
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo(url);
    }

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
