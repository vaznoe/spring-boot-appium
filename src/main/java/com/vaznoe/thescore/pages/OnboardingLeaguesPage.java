package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OnboardingLeaguesPage extends BasePage {
    private static By TITLE = By.xpath("//android.widget.TextView[@text=\"Choose your favorite leagues\"]");
    private static By NEXT_BTN = By.id("btn_next");

    @Step("Verify 'Choose your favorite leagues' title is displayed")
    public OnboardingLeaguesPage verifyChooseFavoriteLeaguesTitleDisplayed() {
        $(TITLE).isDisplayed();
        return this;
    }

    @Step("Tap on 'NEXT' button")
    public OnboardingTeamsPage tapNextButton() {
        $(NEXT_BTN).click();
        return new OnboardingTeamsPage();
    }
}
