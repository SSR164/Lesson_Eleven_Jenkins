import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Configuration.*;
public class TestsBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        //Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
        Configuration.remote="https://user1:1234@selenoid.autotests.cloud/wd/hub";

    }
}
