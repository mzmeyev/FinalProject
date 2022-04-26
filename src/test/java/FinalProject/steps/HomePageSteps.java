package FinalProject.steps;


import FinalProject.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HomePageSteps{
    HomePage homePage = new HomePage();

    @Given("Open HomePage")
    public void openHomePage() {
        homePage.open1alvPage();
    }

    @Then("Dismiss Cookie popup")
    public void dismissCookie() {
        homePage.pressDismissCookie();
    }

    @And("^Validate that Home Page is open (.*)$")
    public void validateThatHomePageIsOpen(String url) {
        homePage.validateThatHomePageIsOpen(url);
    }


}
