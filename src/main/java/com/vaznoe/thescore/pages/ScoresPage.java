package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.vaznoe.thescore.pages.LeaguesPage.LEAGUES_TAB;

public class ScoresPage extends BasePage {
    private static By LOGO = By.id("img_score_logo");
    private static By SCORES_TAB = By.id("largeLabel");

    @Step("Verify 'theScore' logo is displayed")
    public ScoresPage verifyTheScoreLogoDisplayed() {
        $(LOGO).isDisplayed();
        return this;
    }

    @Step("Verify the 'Scores' tab is selected")
    public ScoresPage verifyScoresTabSelected() {
        $(SCORES_TAB).isDisplayed();
        $(SCORES_TAB).isSelected();
        return this;
    }

    @Step("Tap on the 'Leagues' tab button")
    public LeaguesPage tabLeaguesTabButton() {
        $(LEAGUES_TAB).click();
        return new LeaguesPage();
    }
}
