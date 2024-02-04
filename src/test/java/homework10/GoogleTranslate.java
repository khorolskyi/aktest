package homework10;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTranslate {
  String translatePhrase = "Я круто вивчу TestNG";


  public static void main(String[] args) {
  }

  @Test(dataProvider = "languages")
  public void translateText(String url, String translatedPhrase) {
    Selenide.open(url);
    Selenide.$(".er8xn").shouldBe(Condition.visible).setValue(translatePhrase);
    Selenide.$(".ryNqvb").shouldHave(Condition.text(translatedPhrase));
  }

  @DataProvider
  public Object[][] languages() {
    return new Object[][] {
        {getUrl("yi"),"איך וועל לערנען טעסטנג קיל" },
        {getUrl("en"),"I will study TESTNG cool" },
        {getUrl("it"),"Studierò Testng Cool" },
        {getUrl("ay"),"Nayax Testng Cool ukan yatxatäwa ." },
        {getUrl("az"),"Testng sərin öyrənəcəyəm" },
        {getUrl("sd"),"مان ٽيسٽنگ ٿڌي جو مطالعو ڪندس" },
        {getUrl("es"),"Estudiaré testng genial" },
        {getUrl("is"),"Ég mun læra testng flott" },
        {getUrl("kk"),"Мен тестілеуді керемет түрде оқимын" },
        {getUrl("de"),"Ich werde testng cool studieren" },
        {getUrl("nl"),"Ik zal testng cool bestuderen" },
        {getUrl("no"),"Jeg vil studere testng kult" },
        {getUrl("ro"),"Voi studia testng cool" },
        {getUrl("ja"),"テストをクールに勉強します" },
        {getUrl("et"),"Uurin testi jahedat" },
        {getUrl("hr"),"Proučit ću testng cool" },
        {getUrl("fr"),"J'étudierai le test." },
        {getUrl("sl"),"Preučeval bom testng kul" },
        {getUrl("sk"),"Budem študovať testng cool" },
        {getUrl("pt"),"Vou estudar testng legal" },
    };
  }
  private String getUrl(String language){
    return "https://translate.google.com/?sl=auto&tl=%s&op=translate".formatted(language);

  }
}
