package basetest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

/**
 * Класс родитель для UI-тестов
 */
public class BaseTest {
    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "http://0.0.0.0:9999";
        Configuration.browserSize = "1600x900";
//        Configuration.holdBrowserOpen = true;
//        Configuration.headless = true;
    }
}
