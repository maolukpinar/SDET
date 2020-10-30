package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.practiceselenium.com"); //siteyi açar

        Thread.sleep(3000);
        WebElement link = driver.findElement(By.linkText("Check Out"));
        link.click(); //tıklatma

        Thread.sleep(3000);
        driver.navigate().back(); //geri

        Thread.sleep(3000);
        driver.navigate().forward(); //ileri

        Thread.sleep(3000);
        driver.manage().window().maximize();//tarayıcıyı tam ekran yapar



        Thread.sleep(3000);
        driver.quit();
    }
}
