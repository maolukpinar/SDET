package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class IframeGiris extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        WebElement topic = driver.findElement(By.cssSelector("input[type='text']"));
        topic.sendKeys("Deutschland");









        Thread.sleep(6000);
        driver.quit();
    }



}
