package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static base.Constants.site;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ABTesting {
  private SelenideElement content = $("#content");

  public ABTesting open() {
    Selenide.open(site + "/abtest");
    return this;
  }

  public ABTesting hasTitle(String title) {
    content
        .$("h3")
        .shouldHave(text(title));
    return this;
  }

  public ABTesting hasDescription(String title) {
    content
        .$("p")
        .shouldHave(text(title));
    return this;
  }
}
