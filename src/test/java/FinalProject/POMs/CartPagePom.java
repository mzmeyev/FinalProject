package FinalProject.POMs;

import org.junit.Assert;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class CartPagePom extends BasePagePom{

    private final By pressContinueButton = By.name("commit");
    private final By enterEmail = By.name("user[email]");
    private final By enterPassword = By.name("user[password]");
    private final By clickLogIn = By.name("commit");
    private final By selectPickUp = By.xpath("//input[@value='3207']");

    public void setPressContinueButton() {
        driver.findElement(pressContinueButton).click();
    }

    public void setEnterEmail (String email) {
        driver.findElement(enterEmail).sendKeys(email);
    }

    public void setEnterPassword (String password) {
        driver.findElement(enterPassword).sendKeys(password);
    }

    public void setClickLogIn() {
        driver.findElement(clickLogIn).click();
    }

    public void setSelectPickUp() {
        driver.findElement(selectPickUp).click();
    }

    public void validateProductName(String productName) {
        String finalProductName = driver.findElement(By.xpath("//div[@data-name]")).getAttribute("data-name");
        assertThat(finalProductName).isEqualTo(productName);
    }

    public void validateProductPrice(String productPrice) {
        String finalProductPrice = driver.findElement(By.xpath("//div[@data-price]")).getAttribute("data-price");
        assertThat(finalProductPrice).isEqualTo(productPrice);;

    }

}
