package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
public class SolutionsTests {
    @BeforeAll
    static void beforeAll() {
                Configuration.baseUrl = "https://github.com/";
    }
    @Test
    void shouldFindSolutions() {
       $$("HeaderMenu-item").filterBy(text("Solutions")).first().hover();
        $("hero-section-brand-heading").$(byText("The AI-powered\n" +
                "developer platform.")).click();
        $("hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
                "developer platform."));
    }
}
