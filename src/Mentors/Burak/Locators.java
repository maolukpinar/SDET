package Mentors.Burak;

import net.bytebuddy.description.NamedElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.jar.Attributes;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        // TODO               lOCATORS

        //CSS SELECTOR
        //XPath
        //ID
        //TAG NAME
        //CLASS NAME
        //LİNK TEXT
        //PARTIAL LINK TEXT

        //http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"); // siteyi açtım
        driver.manage().window().maximize();

        driver.findElement(By.id("email_create")).sendKeys("seyyah@dunya.com");

        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(3000);//3

        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Mehmet Akif");

        driver.findElement(By.id("customer_lastname")).sendKeys("Olukpınar");

        driver.findElement(By.id("passwd")).sendKeys("12345");

        Select days = new Select(driver.findElement(By.id("days")));

        days.selectByValue("1");

        Select months = new Select(driver.findElement(By.id("months")));

        months.selectByValue("10");

        Select years = new Select(driver.findElement(By.id("years")));

        years.selectByValue("1981");

       // driver.findElement(By.id("firstname")).sendKeys("Mehmet Akif");

        //driver.findElement(By.id("lastname")).sendKeys("Olukpınar");

        driver.findElement(By.id("company")).sendKeys("Techno Study");

        driver.findElement(By.id("address1")).sendKeys("Leuchtenberger Kirchweg");

        driver.findElement(By.id("address2")).sendKeys("Louhausen");

        driver.findElement(By.id("city")).sendKeys("Washington");

        Select city = new Select(driver.findElement(By.id("id_state")));
        city.selectByValue("47");

        driver.findElement(By.id("postcode")).sendKeys("40474");











        Thread.sleep(3000);//3 saniye beklem ekledi
        driver.quit();// en sonda sayfayı kapattı
    }
}
