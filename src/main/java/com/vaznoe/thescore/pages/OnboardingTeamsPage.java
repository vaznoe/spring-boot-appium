package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OnboardingTeamsPage extends BasePage {
    private static By TITLE = By.id("txt_title");
    private static By NEXT_BTN = By.id("btn_next");

    @Step("Verify 'Choose your favorite teams' title is displayed")
    public OnboardingTeamsPage verifyChooseFavoriteTeamsTitleDisplayed() {
        $(TITLE).isDisplayed();
        return this;
    }

    @Step("Tap on 'NEXT' button")
    public OnboardingNotificationSettingsPage tapNextButton() {
        $(NEXT_BTN).click();
        return new OnboardingNotificationSettingsPage();
    }
}
