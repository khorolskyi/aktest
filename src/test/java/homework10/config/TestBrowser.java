package homework10.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.TextCheck;
import com.codeborne.selenide.WebDriverRunner;

public class TestBrowser {
  public static void setBrowser(){
    var selenideConfig = new SelenideConfig();
    selenideConfig.browser("chrome");
    selenideConfig.browserSize("1920x1080");
    selenideConfig.pageLoadStrategy("normal");
    selenideConfig.pageLoadTimeout(150000);
    selenideConfig.timeout(15000);
    Configuration.timeout = selenideConfig.timeout();
    selenideConfig.textCheck(TextCheck.FULL_TEXT);

    var selenideDriver = new SelenideDriver(selenideConfig);
    WebDriverRunner.setWebDriver(selenideDriver.getAndCheckWebDriver());
  }
}
