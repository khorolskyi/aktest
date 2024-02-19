package homework10.trelloPages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {

  public static final String EMAIL = "khorolskyi89@gmail.com";
  public static final String PASSWORD = "Qwerty!12345";

  public static final String URL = "https://id.atlassian.com/login?application=trello";


  private SelenideElement emailFld = $("#username").as("Email Field");
  private SelenideElement passwordFld = $("#password").as("Password Field");
  private SelenideElement continueBtn = $("#login-submit").as("Continue Button");

  public void open(){
    Selenide.open(URL);
    assertIsOpened();

  }
  public void login(){
    open();
    emailFld.val(EMAIL);
    continueBtn.click();
    passwordFld.shouldBe(Condition.visible).val(PASSWORD);
    continueBtn.click();
    new DashboardPage().assertIsOpened();
  }
  public void assertIsOpened(){
    emailFld.shouldBe(Condition.visible);
  }
}