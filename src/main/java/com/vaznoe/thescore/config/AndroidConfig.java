package com.vaznoe.thescore.config;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.io.File;
import java.net.URL;
import java.time.Duration;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;

@Component
@PropertySource("classpath:config.properties")
@ParametersAreNonnullByDefault
public class AndroidConfig implements WebDriverProvider {
    @Value("${device.name}")
    private String name;

    @SneakyThrows
    @Override
    @CheckReturnValue
    @Nonnull
    public AndroidDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(ANDROID_UIAUTOMATOR2);
        options.setPlatformName("Android");
        options.setDeviceName(name);
        options.setNewCommandTimeout(Duration.ofSeconds(60));
        options.setFullReset(true);
        options.setAppPackage("com.fivemobile.thescore");
        options.autoGrantPermissions();
        options.setApp(new File("src/main/resources/theScore.apk").getAbsolutePath());
        return new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }
}
