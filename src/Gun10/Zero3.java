package Gun10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Zero3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("username");
        Thread.sleep(1000);

        WebElement passw = driver.findElement(By.id("user_password"));
        passw.sendKeys("password");
        Thread.sleep(1000);

        WebElement buttn = driver.findElement(By.name("submit"));
        buttn.click();
        Thread.sleep(1000);


        driver.findElement(By.id("pay_bills_tab")).click();
        driver.findElement(By.xpath("//a[@href='#ui-tabs-3']")).click();
        Thread.sleep(500);
        WebElement Currency = driver.findElement(By.id("pc_currency"));
        Thread.sleep(500);
        Select Curr = new Select(Currency);
        Curr.selectByIndex(randomNum(15));//randomNum(5)
        driver.findElement(By.id("pc_amount")).sendKeys("1200");
        driver.findElement(By.id("pc_inDollars_true")).click();
        driver.findElement(By.id("purchase_cash")).click();


        Thread.sleep(3000);
        driver.close();

    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}