package Gun11;
/*
 Senaryo :
   1- http://demo.guru99.com/test/drag_drop.html Siteyi açınız.
   2- Bank butonunu sürükleyerek bağtaki kutucuğa bırakınız.
   3- Daha sonra bütün kutularda BANK butonunun textini aratınız.
   4- Assert ile doğrulayınız.


 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class _05_Task01 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement bankButton = driver.findElement(By.id("credit2"));
        WebElement kutu = driver.findElement(By.id("bank"));

        Actions builder = new Actions(driver);
        Action build = builder.dragAndDrop(bankButton, kutu).build();
        build.perform();

        WebElement kutuicerigi = (WebElement) driver.findElements(By.cssSelector("#bank>li"));

        Assert.assertTrue( kutuicerigi.getText().equals(bankButton.getText())  );








        Thread.sleep(5000);
        driver.quit();
    }
}
