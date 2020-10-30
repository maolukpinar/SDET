package Gun14;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

public class ScrollToBottomOfThePage extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(2000);
      js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

        Thread.sleep(6000);
        driver.quit();

    }
}