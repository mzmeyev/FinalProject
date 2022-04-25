package FinalProject.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage {


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

}
