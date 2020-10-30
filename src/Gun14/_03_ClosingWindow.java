package Gun14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _03_ClosingWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        String anaSayfaIDsi = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target=_blank]"));
        for (WebElement link : linkler) {
            link.click();
        }

        Set<String > windowIDler = driver.getWindowHandles();

        for (String ID:windowIDler)
        {
            System.out.println(ID);

            if(ID.equals(anaSayfaIDsi)) continue;

            driver.switchTo().window(ID);
            System.out.println("Window title" +driver.getTitle());
            driver.close();
        }








        Thread.sleep(5000);
        driver.quit();
    }
}