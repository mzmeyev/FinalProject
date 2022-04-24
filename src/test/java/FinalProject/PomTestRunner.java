package FinalProject;

import FinalProject.POMs.BasePagePom;
import FinalProject.POMs.CartPagePom;
import FinalProject.POMs.HomePagePom;
import org.junit.Test;

public class PomTestRunner {

    BasePagePom basePagePom = new BasePagePom();
    HomePagePom homePagePom = new HomePagePom();
    CartPagePom cartPagePom = new CartPagePom();

    @Test
    public void FinalProject() {
        basePagePom.openChromeByUrl("https://www.1a.lv/");
        basePagePom.waitThreeSeconds();
        homePagePom.pressDismissCookie();
        homePagePom.enterProductNameInSearchBar("Xbox");
        homePagePom.setPressSearchButton();
        basePagePom.waitThreeSeconds();
        basePagePom.scrollDown();
        basePagePom.waitThreeSeconds();
        homePagePom.setClickOnProduct();
        basePagePom.scrollDown();
        basePagePom.waitThreeSeconds();
        homePagePom.setClickOnAddToCart();
        basePagePom.waitThreeSeconds();
        homePagePom.setClickOnViewCart();
        cartPagePom.setPressContinueButton();
        basePagePom.scrollDownLoginPage();
        cartPagePom.setEnterEmail("akdmisha@gmail.com");
        cartPagePom.setEnterPassword("testpassword");
        cartPagePom.setClickLogIn();
        basePagePom.scrollDownPickUpPage();
        basePagePom.waitThreeSeconds();
        cartPagePom.setSelectPickUp();
        cartPagePom.validateProductName("Spēļu konsole Microsoft XBOX Series S, USB 3.1 / HDMI / Wi-Fi");
        cartPagePom.validateProductPrice("308.99");

    }
}
