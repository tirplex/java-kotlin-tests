package base;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestsWatcherUI implements TestWatcher, AfterAllCallback {

  @Override
  public void testDisabled(ExtensionContext context, Optional<String> reason) {
  }

  @Override
  public void testSuccessful(ExtensionContext context) {
  }

  @Override
  public void testAborted(ExtensionContext context, Throwable cause) {
  }

  @Override
  public void testFailed(ExtensionContext context, Throwable cause) {
    //take custom screenshot and put in folder with test name
    Selenide.screenshot("screenshots/" + context.getTestClass().get().getName() + "/" + context.getDisplayName());
  }

  @Override
  public void afterAll(ExtensionContext context) throws Exception {
  }
}