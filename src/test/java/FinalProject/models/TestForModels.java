package FinalProject.models;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class TestForModels {

    UserStatic userStatic = new UserStatic();
    ShoppingCart shoppingCart = new ShoppingCart();

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
    }

    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollDownLoginPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void scrollDownPickUpPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }

    public static ChromeDriver driver;
    private final By dismissCookie = By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    private final By enterProductName = By.xpath("//input[@placeholder='Ierakstiet, ko vēlaties atrast']");
    private final By pressSearchButton = By.className("main-search-submit");
    private final By clickOnProduct = By.xpath("//a[@data-gtm-link='448154']");
    private final By clickOnAddToCart = By.id("add_to_cart_btn");
    private final By clickOnViewCart = By.xpath("//a[@class='main-button']");
    private final By pressContinueButton = By.name("commit");
    private final By enterEmail = By.name("user[email]");
    private final By enterPassword = By.name("user[password]");
    private final By clickLogIn = By.name("commit");
    private final By selectPickUp = By.xpath("//input[@value='3207']");

    @Test
    public void loginTo1alv() {
        String driverPath = "C:\\Users\\Dell\\FinalProject\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");
        driver.manage().window().maximize();

        //Wait 3 seconds
        waitThreeSeconds();

        //Dismiss cookie
        driver.findElement(dismissCookie).click();

        //Set product name
        shoppingCart.setProductName("Spēļu konsole Microsoft XBOX Series S, USB 3.1 / HDMI / Wi-Fi");

        //Set product price
        shoppingCart.setProductPrice("308.99");

        //Input product name in the searchbar
        driver.findElement(enterProductName).sendKeys(shoppingCart.getProductName());

        //Click on Search button
        driver.findElement(pressSearchButton).click();

        //Wait 3 seconds
        waitThreeSeconds();

        //Scroll down
        scrollDown();

        //Wait 3 seconds
        waitThreeSeconds();

        //Click on product
        driver.findElement(clickOnProduct).click();

        //Wait 3 seconds
        waitThreeSeconds();

        //Scroll down
        scrollDown();

        //Wait 3 seconds
        waitThreeSeconds();

        //Add product to cart
        driver.findElement(clickOnAddToCart).click();

        //Wait 3 seconds
        waitThreeSeconds();

        //Click on View Cart
        driver.findElement(clickOnViewCart).click();

        //Press Continue button
        driver.findElement(pressContinueButton).click();

        //Scroll down
        scrollDownLoginPage();

        //Enter email
        driver.findElement(enterEmail).sendKeys(userStatic.getEmail());

        //Enter password
        driver.findElement(enterPassword).sendKeys(userStatic.getPassword());

        //Click Log In button
        driver.findElement(clickLogIn).click();

        //Scroll down
        scrollDownPickUpPage();

        //Wait 3 seconds
        waitThreeSeconds();

        //Select Jelgava as Pick up point
        driver.findElement(selectPickUp).click();

        //Assert product price
        String actualPrice = shoppingCart.getProductPrice();
        String finalProductPrice = driver.findElement(By.xpath("//div[@data-price]")).getAttribute("data-price");
        assertThat(actualPrice).isEqualTo(finalProductPrice);

        //Asser product name
        String actualName = shoppingCart.getProductName();
        String finalProductName = driver.findElement(By.xpath("//div[@data-name]")).getAttribute("data-name");
        assertThat(actualName).isEqualTo(finalProductName);


    }


}
