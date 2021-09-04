package tests.javaTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pageObjects.ABTesting;

public class ABTestingJava {
  ABTesting page = new ABTesting();

  @Test
  public void checkTitle() {
    Configuration.headless = true;
    page
        .open()
        .hasTitle("No A/B Test");
  }

  @Test
  public void checkDescription() {
    Configuration.headless = true;
    page
        .open()
        .hasDescription("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn from different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
  }
}
