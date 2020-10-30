package Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Xpath extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/"); // siteyi açtım

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']']"));
        username.sendKeys("standard_user");

        Thread.sleep(1000);
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        Thread.sleep(1000);
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();





        Thread.sleep(6000);

    }
}
