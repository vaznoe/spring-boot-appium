package com.vaznoe.thescore;

import com.vaznoe.thescore.config.AndroidConfig;
import com.vaznoe.thescore.config.TheScoreConfig;
import com.vaznoe.thescore.pages.ScoresPage;
import com.vaznoe.thescore.pages.WelcomePage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.appium.SelenideAppium.launchApp;

@SpringBootTest(classes = { TheScoreApplication.class, TheScoreConfig.class })
public abstract class BaseTest {
    @Autowired
    AndroidConfig androidConfig;
    @Autowired
    WelcomePage welcomePage;
    @Autowired
    ScoresPage scoresPage;

    @BeforeEach
    void setUp() {
        launchApp();
        skipOnboarding();
    }

    @Step("Skip Onboarding")
    ScoresPage skipOnboarding() {
        welcomePage.verifyWelcomePageDisplayed()
                .tapGetStartedButton()
                .verifyChooseFavoriteLeaguesTitleDisplayed()
                .tapNextButton()
                .verifyChooseFavoriteTeamsTitleDisplayed()
                .tapNextButton()
                .tapDoneButton();
        return new ScoresPage();
    }

    @AfterEach
    void after() {
        closeWebDriver();
    }
}
