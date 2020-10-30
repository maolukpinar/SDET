package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

/*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.

    interviev larda dinamik eleman nedir diye sorulur


    Özet Bilgi
    u_1_2
    u_2_2
    u_3_2
    u_4_2
    u_6_2

    u_ başlıyor
    _2 bitiyor

    a[id^='u_'][id$='_2']

    CSS de
    ^ -> ile başlayan
    $ -> ile biten
    * -> içinde geçen


    Xpath
    [starts-with(@id,'u_')] -> ile başlayan
    [ends-with(@id,'_2')]    -> ile biten
    [contains(@id,'u_')]    -> içinde geçen





*/

public class _05_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.facebook.com/");
        WebElement btnYeniHesap=driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        btnYeniHesap.click();

        Thread.sleep(3000);
        WebElement txtilkAd=driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        txtilkAd.sendKeys("ismet");

        WebElement txtSoyad=driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        txtSoyad.sendKeys("temur");



        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        email.sendKeys("ismet@hotmail.com");

        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        tEmail.sendKeys("ismet@hotmail.com");

        WebElement yeniSifre=driver.findElement(By.id("password_step_input"));
        yeniSifre.sendKeys("11234");



        WebElement EGun=driver.findElement(By.id("day"));
        Select gun=new Select(EGun);
        gun.selectByValue("10");

        WebElement EAy=driver.findElement(By.id("month"));
        Select ay=new Select(EAy);
        ay.selectByValue("10");

        WebElement EYil=driver.findElement(By.id("year"));
        Select yil=new Select(EYil);
        yil.selectByVisibleText("1981");

        Thread.sleep(2000);
        WebElement cinsiyet=driver.findElement(By.cssSelector("input[id^='u_'][id$='_5']"));
        cinsiyet.click();

        WebElement kaydol=driver.findElement(By.cssSelector("button[id^='u_'][id$='_s']"));
        kaydol.click();



        Thread.sleep(7000);
        driver.quit();

    }
}
