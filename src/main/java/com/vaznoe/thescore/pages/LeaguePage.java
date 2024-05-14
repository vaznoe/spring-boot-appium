package com.vaznoe.thescore.pages;

import com.codeborne.selenide.Selenide;
import com.vaznoe.thescore.enums.LeaguesInfoTab;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeaguePage extends BasePage {
    private static By TITLE = By.id("title_text");
    private static By NEWS_TITLE = By.id("caption");
    private static By NEWS_IMAGE = By.id("image_view");

    @Step("Verify title: {} is displayed")
    public LeaguePage verifyTitleDisplayed(String title) {
        $(TITLE).isDisplayed();
        $(TITLE).shouldHave(text(title));
        return this;
    }

    @Step("Navigate to: {subTab}")
    public LeaguePage navigateTo(LeaguesInfoTab subTab) {
        $(By.xpath(String.format("//android.widget.TextView[@text=\"%s\"]", subTab.name()))).click();
        return this;
    }

    @Step("Verify 'NEWS' tab is opened")
    public LeaguePage verifyNewsTabOpened() {
        assertTrue($$(NEWS_TITLE).size() > 0);
        $$(NEWS_TITLE).get(0).isDisplayed();
        $$(NEWS_IMAGE).get(0).isDisplayed();
        return this;
    }

    @Step("Navigate back to the Leagues page")
    public LeaguesPage navigateBack() {
        Selenide.back();
        return new LeaguesPage();
    }
}
