package base;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    // Take custom screenshot and put it in folder with test name
    String testFolder = context.getTestClass().get().getName().replaceAll("\\.", "_");
    String testName = context.getDisplayName().replaceAll("\\s+", "_");
    String screenshot = Selenide.screenshot("screenshots/" + testFolder + "/" + testName);

    // Add screenshot to allure report
    Path content = Paths.get(screenshot.substring(5)); // remove file:/ prefix
    try (InputStream is = Files.newInputStream(content)) {
      Allure.addAttachment("Page screenshot", is);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void afterAll(ExtensionContext context) throws Exception {
  }
}