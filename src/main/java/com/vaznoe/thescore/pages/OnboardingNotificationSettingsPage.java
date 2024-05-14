package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OnboardingNotificationSettingsPage extends BasePage {
    private static By DONE_BTN = By.id("btn_allow");

    @Step("Tap on 'DONE' button")
    public OnboardingNotificationSettingsPage tapDoneButton() {
        $(DONE_BTN).click();
        return this;
    }
}
