package com.vaznoe.thescore;

import com.vaznoe.thescore.enums.LeaguesInfoTab;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.vaznoe.thescore.utils.TestUtils.leaguesName;

class TheScoreApplicationTests extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = { "NFL Football", "MLB Baseball", "NHL Hockey", "PGA Tour", "NCAA Women's Basketball" })
    void leaguesTest(String name) {
        scoresPage.verifyScoresTabSelected()
                .verifyTheScoreLogoDisplayed()
                .verifyScoresTabSelected()
                .tabLeaguesTabButton()
                .verifyLeaguesTabSelected()
                .selectLeagues(name)
                .verifyTitleDisplayed(leaguesName(name))
                .navigateTo(LeaguesInfoTab.NEWS)
                .verifyNewsTabOpened()
                .navigateBack()
                .verifyTheScoreLogoDisplayed();
    }
}
