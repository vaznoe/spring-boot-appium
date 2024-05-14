package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomePage extends BasePage {
    private static final By WELCOME = By.id("txt_welcome");
    private static final By GET_STARTED_BTN = By.id("btn_get_started");

    @Step("Verify 'Welcome' title is displayed")
    public WelcomePage verifyWelcomePageDisplayed() {
        $(WELCOME).isDisplayed();
        return this;
    }

    @Step("Tap on 'GET STARTED' button")
    public OnboardingLeaguesPage tapGetStartedButton() {
        $(GET_STARTED_BTN).click();
        return new OnboardingLeaguesPage();
    }
}
