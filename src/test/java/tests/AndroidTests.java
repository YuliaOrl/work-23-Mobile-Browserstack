package tests;

import org.junit.jupiter.api.Test;
import tests.steps.Steps;

public class AndroidTests extends TestBase {
    Steps steps = new Steps();

    @Test
    void MobileSearchWordTest() {
        String searchWord = "Selenide";

        steps
             .skipLanguage()
             .searchRequest(searchWord)
             .VerifyContentFound()
             .OpenFirstArticle()
             .CheckContentArticle(searchWord);
    }

    @Test
    void MobileSearchPhraseTest() {
        String searchPhrase = "Mobile testing";

        steps
             .skipLanguage()
             .searchRequest(searchPhrase)
             .VerifyContentFound()
             .OpenRequestArticle(searchPhrase)
             .CheckContentArticle(searchPhrase);
    }
}
