package Mentors.Tahir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssWorking {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.salesforce.com/signup");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        driver.quit();
    }
}
