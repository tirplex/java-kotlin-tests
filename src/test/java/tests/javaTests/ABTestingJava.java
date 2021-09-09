package tests.javaTests;

import base.TestsSpecUI;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pageObjects.ABTesting;

@ExtendWith(TestsSpecUI.class)
public class ABTestingJava {
  ABTesting page = new ABTesting();

  @Test
  @Disabled
  @DisplayName("User should see correct title")
  public void userShouldSeeCorrectTitle() {
    page
        .open()
        .hasTitle("No A/B Test");
  }

  @Test
  @Disabled
  @DisplayName("User should see correct description")
  public void userShouldSeeCorrectDescription() {
    page
        .open()
        .hasDescription("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn from different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
  }
}
