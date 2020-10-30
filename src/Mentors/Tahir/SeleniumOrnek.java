package Mentors.Tahir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class SeleniumOrnek extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.etsy.com//");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.

        //yeni hesap butonuna tıklattım
        WebElement Gecistmasken = driver.findElement(By.xpath("//a[contains(.,'Face masks')]"));
        Gecistmasken.click();
        Thread.sleep(3000);
    }}


