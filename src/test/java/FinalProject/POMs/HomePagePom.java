package FinalProject.POMs;

import org.openqa.selenium.By;

public class HomePagePom extends BasePagePom {

    private final By dismissCookie = By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    private final By enterProductName = By.xpath("//input[@placeholder='Ierakstiet, ko vēlaties atrast']");
    private final By pressSearchButton = By.className("main-search-submit");
    private final By clickOnProduct = By.xpath("//a[@data-gtm-link='448154']");
    private final By clickOnAddToCart = By.id("add_to_cart_btn");
    private final By clickOnViewCart = By.xpath("//a[@class='main-button']");


    public void pressDismissCookie() {
        driver.findElement(dismissCookie).click();
    }

    public void enterProductNameInSearchBar(String productName) {
        driver.findElement(enterProductName).sendKeys(productName);
    }

    public void setPressSearchButton() {
        driver.findElement(pressSearchButton).click();
    }

    public void setClickOnProduct() {
        driver.findElement(clickOnProduct).click();
    }

    public void setClickOnAddToCart() {
        driver.findElement(clickOnAddToCart).click();
    }

    public void setClickOnViewCart() {
        driver.findElement(clickOnViewCart).click();
    }

}
