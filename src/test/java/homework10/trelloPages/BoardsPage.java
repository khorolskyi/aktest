package homework10.trelloPages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class BoardsPage {
  public SelenideElement board = $(".board-tile").as("Board");
  public SelenideElement createCard = $(".IapUGb_Cq2VzSr").as("create card");
  public SelenideElement inputTitle = $(".qJv26NWQGVKzI9").as("inputTitle");
  public SelenideElement boardTitle = $(".mKJWg6W_CLHoiO").as("boardTitle");
  public SelenideElement clickToCard = $(".amUfYqLTZOvGsn").as("clickToCard");
  public SelenideElement clickToCommentArea = $(".c3OsZHKSpXeMAD").as("clickToCommentArea");
  public SelenideElement inputComment = $(".ua-chrome.ProseMirror.ProseMirror-focused").as("inputComment");
  public SelenideElement saveCommentBtn = $("[data-testid=card-back-comment-save-button]").as("saveCommentBtn");
  public SelenideElement archiveBtn = $(".button-link.js-archive-card").as("archiveBtn");
  public SelenideElement deleteCardBtn = $(".button-link.js-delete-card.negate").as("deleteCardBtn");
  public SelenideElement deleteConfirmationBtn = $(".js-confirm.full.nch-button.nch-button--danger").as("deleteConfirmationBtn");


  public void assertIsOpened(){
    board.shouldBe(Condition.visible);
  }


}