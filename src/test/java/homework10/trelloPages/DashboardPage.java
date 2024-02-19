package homework10.trelloPages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class DashboardPage {
  public SelenideElement trelloButton = $(".sc-drlKqa.eKcSXk").as("Trello button");

  public void assertIsOpened(){
    trelloButton.shouldBe(Condition.visible);
  }

//  public void
}