package FinalProject.pageobjects;

import FinalProject.config.HomePage;
import FinalProject.models.UserStatic;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;


public class CartPagePom extends HomePage {
    UserStatic userStatic = new UserStatic();

    private final By finalProductName = By.className("gtm-shipping");
    private final By finalProductPrice = By.className("gtm-shipping");

    public void setPressContinueButton() {
        $(By.name("commit")).click();
    }

    public void setEnterEmail () {
        $(By.name("user[email]")).sendKeys(userStatic.getEmail());
    }

    public void setEnterPassword () {
        $(By.name("user[password]")).sendKeys(userStatic.getPassword());
    }

    public void setClickLogIn() {
        $(By.name("commit")).click();
    }

    public void setSelectPickUp() {
        $(By.xpath("//input[@value='3207']")).click();
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
