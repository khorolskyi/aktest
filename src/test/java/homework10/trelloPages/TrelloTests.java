package homework10.trelloPages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import homework10.config.TestBrowser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrelloTests {
  @BeforeTest
  public void setUpBrowser() {
    TestBrowser.setBrowser();
  }
  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  BoardsPage boardsPage = new BoardsPage();

  @Test
  public void testLogin() {
    loginPage.login();
  }

  @Test(dependsOnMethods = "testLogin")
  public void createCard() {
    dashboardPage.trelloButton.click();
    boardsPage.board.click();
    boardsPage.createCard.click();
    boardsPage.inputTitle.val(randomString());
    boardsPage.boardTitle.click();
    boardsPage.clickToCard.click();
    boardsPage.clickToCommentArea.click();
    boardsPage.inputComment.val("My comment");
    boardsPage.saveCommentBtn.click();
    boardsPage.archiveBtn.click();
    boardsPage.deleteCardBtn.click();
    boardsPage.deleteConfirmationBtn.click();
    assertCardDisappear();
  }
  public void assertCardDisappear(){
    boardsPage.clickToCard.shouldBe(Condition.disappear);
  }
  private static Faker faker = new Faker();

  public static String randomString() {
    return faker.lorem().fixedString(10);
  }
}
