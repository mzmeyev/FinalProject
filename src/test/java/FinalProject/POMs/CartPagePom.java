package FinalProject.POMs;

import FinalProject.models.UserStatic;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;


public class CartPagePom{
    UserStatic userStatic = new UserStatic();


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
        String finalProductName =$(By.xpath("//div[@data-name]")).getAttribute("data-name");
        assertThat(productName).isEqualTo(finalProductName);
    }

    public void validateProductPrice(String productPrice) {
        String finalProductPrice =$(By.xpath("//div[@data-price]")).getAttribute("data-price");
        assertThat(productPrice).isEqualTo(finalProductPrice);
    }

}
