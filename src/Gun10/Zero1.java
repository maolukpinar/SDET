package Gun10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Zero1 extends BaseStaticDriver {
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

        WebElement trnsfer = driver.findElement(By.id("transfer_funds_tab"));
        trnsfer.click();
        Thread.sleep(1000);
        WebElement FromAccount = driver.findElement(By.id("tf_fromAccountId"));
        Select Account = new Select(FromAccount);
        Account.selectByIndex(randomNum(5));//randomNum(5)
        WebElement ToAccount = driver.findElement(By.id("tf_toAccountId"));
        Select Account1 = new Select(ToAccount);
        Account1.selectByIndex(randomNum(5));//randomNum(5)
        driver.findElement(By.id("tf_amount")).sendKeys("2500");
        driver.findElement(By.id("tf_description")).sendKeys("Para yatirildi");
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();

        Thread.sleep(3000);
        driver.close();

    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }

}