import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

    @Test
    public void testtest() {
        wd = new ChromeDriver();
        wd.get("https://yandex.ru/");
        wd.quit();
    }
}
