import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

    @Test
    public void testtest() {
        wd = new ChromeDriver();
        wd.get("https://yandex.ru/");
        wd.get("https://yandex.ru/news/story/Uchenye_vpervye_smogli_vyrastit_ehmbriony_myshej_viskusstvennoj_matke--7a5e6896d9acebaa557a903ae9154323?fan=1&from=reg_portal&lang=ru&lr=132&mlid=1616094777.geo_181.7a5e6896&msid=1616095530.08763.85207.86707&persistent_id=135742690&stid=MXT1ASk_&t=1616094777&utm_medium=topnews_region&utm_source=morda_desktop");
        wd.quit();
    }
}
