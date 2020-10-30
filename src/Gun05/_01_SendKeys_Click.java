package Gun05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
import static org.junit.Assert.*;

public class _01_SendKeys_Click extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com");

        Thread.sleep(3000);
        WebElement link = driver.findElement(By.linkText("Check Out"));
        link.click(); //tıklatma

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("info@techno.study");//text gönderme
        Thread.sleep(1000);

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Mehmet Akif");
        Thread.sleep(1000);

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Düsseldorf");
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.className("btn-primary"));
        button.click();

        WebElement menu = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuTxt=menu.getText();

        Assert.assertEquals("Menu",menuTxt);




        String url= driver.getCurrentUrl();
        Assert.assertEquals(" http://www.practiceselenium.com/menu.html?",url);


        Thread.sleep(3000);
        driver.quit();

    }
}
