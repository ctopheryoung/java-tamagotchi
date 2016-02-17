import org.fluentlenium.adapter.FluentTest;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Create a Tamagotchi");
  }

  @Test
  public void tamagotchiIsCreatedTest() {
    goTo("http://localhost:4567/");
    fill("#name").with("steve");
    submit(".btn");
    assertThat(pageSource()).contains("steve");
  }

  @Test
  public void tamagotchiIsFedTest() {
    goTo("http://localhost:4567/");
    fill("#name").with("steve");
    submit(".btn");
    click("a", withText("Feed"));
    assertThat(pageSource()).contains("Hunger: 2");
  }
}
