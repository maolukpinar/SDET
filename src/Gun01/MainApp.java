package Gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
         // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
         WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
         driver.get("https://www.google.de/"); // siteyi açtım

    }
}
