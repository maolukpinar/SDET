package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.ebay.com/");


        WebElement txtara = driver.findElement(By.id("gh-cat"));
        Select menu = new Select(txtara);
        menu.selectByValue("2984");

        WebElement btnara=driver.findElement(By.id("gh-btn"));
        btnara.click();











        Thread.sleep(3000);
        driver.quit();
    }
}
