package com.vaznoe.thescore.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeaguesPage extends BasePage {
    private static By LOGO = By.id("img_score_logo");
    static By LEAGUES_TAB = By.id("action_leagues");
    private static By LEAGUES_NAME = By.id("league_name_text");

    @Step("Verify 'theScore' logo is displayed")
    public LeaguesPage verifyTheScoreLogoDisplayed() {
        $(LOGO).isDisplayed();
        return this;
    }

    @Step("Verify the 'Leagues' tab is selected")
    public LeaguesPage verifyLeaguesTabSelected() {
        $(LEAGUES_TAB).isSelected();
        return this;
    }

    @Step("Tap on 'Leagues' tab")
    public LeaguePage selectLeagues(String name) {
        $$(LEAGUES_NAME).findBy(text(name)).click();
        return new LeaguePage();
    }
}
