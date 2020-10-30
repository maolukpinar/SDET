package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04_ActionDragAndDrupTest extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement city = driver.findElement(By.id("box3"));
        WebElement land = driver.findElement(By.id("box103"));

        Actions builder = new Actions(driver);

        Action build =builder.dragAndDrop(city, land).build();
        Thread.sleep(3000);
        build.perform();



        Thread.sleep(6000);
        driver.quit();
    }
}