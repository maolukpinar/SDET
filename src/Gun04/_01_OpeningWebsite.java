package Gun04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://www.practiceselenium.com"); // siteyi açtım

        Thread.sleep(3000);//3 saniye beklem ekledi
        driver.quit();// en sonda sayfayı kapattı
    }
    }

