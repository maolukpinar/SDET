package Gun10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Zero2 extends BaseStaticDriver {
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

        WebElement FromAccount = driver.findElement(By.id("sp_payee"));
        Select Account = new Select(FromAccount);
        Account.selectByIndex(randomNum(3));//randomNum(5)
        WebElement ToAccount = driver.findElement(By.id("sp_account"));
        Select Account1 = new Select(ToAccount);
        Account1.selectByIndex(randomNum(5));//randomNum(5)
        driver.findElement(By.id("sp_amount")).sendKeys("1500");
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-09");
        driver.findElement(By.id("sp_description")).sendKeys("Para odendi");
        Thread.sleep(500);
        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(500);
        String yazi= driver.findElement(By.id("alert_content")).getText();
        System.out.println(yazi);
        Assert.assertTrue(yazi.equals("The payment was successfully submitted."));
        Thread.sleep(3000);
        driver.close();

    }
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }






        }
