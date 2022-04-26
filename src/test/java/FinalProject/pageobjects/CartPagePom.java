package FinalProject.pageobjects;

import FinalProject.models.UserStatic;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;


public class CartPagePom extends HomePage {
    UserStatic userStatic = new UserStatic();

    private final By finalProductName = By.className("gtm-shipping");
    private final By finalProductPrice = By.className("gtm-shipping");
    private final By continueButton = By.name("commit");
    private final By enterEmail = By.name("user[email]");
    private final By enterPassword = By.name("user[password]");
    private final By clickLogIn = By.name("commit");
    private final By selectPickUp = By.xpath("//input[@value='3207']");

    public void setPressContinueButton() {
        $(continueButton).click();
    }

    public void setEnterEmail () {
        $(enterEmail).sendKeys(userStatic.getEmail());
    }

    public void setEnterPassword () {
        $(enterPassword).sendKeys(userStatic.getPassword());
    }

    public void setClickLogIn() {
        $(clickLogIn).click();
    }

    public void setSelectPickUp() {
        $(selectPickUp).click();
    }

    public void validateProductName(String productName) {
        String finalNameText = $(finalProductName).getAttribute("data-name");
        assertThat(finalNameText).isEqualTo(productName);
    }

    public void validateProductPrice(String productPrice) {
        String finalPriceText = $(finalProductPrice).getAttribute("data-price");
        assertThat(finalPriceText).isEqualTo(productPrice);
    }

}
