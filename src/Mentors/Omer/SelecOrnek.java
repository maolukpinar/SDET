package Mentors.Omer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class SelecOrnek extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/202468401801346");

        //isim
        WebElement isim = driver.findElement(By.id("first_4"));
        isim.sendKeys("Mehmet");Thread.sleep(500);

        //soyisim
        WebElement soyad = driver.findElement(By.id("last_4"));
        soyad.sendKeys("Pınar");Thread.sleep(500);

        WebElement element = driver.findElement(By.cssSelector("select#input_14"));

        Select slc = new Select(element);
        slc.selectByVisibleText("Hukuk Fakültesi");Thread.sleep(500);

        element=driver.findElement(By.xpath("//select[@id='input_20']"));

        slc = new Select(element);
        slc.selectByIndex(3);

        driver.findElement(By.id("input_12_area")).sendKeys("0352");Thread.sleep(500);
        driver.findElement(By.id("input_12_phone")).sendKeys("7121987");Thread.sleep(500);
        driver.findElement(By.id("input_5")).sendKeys("maolukpinar@gmail.com");Thread.sleep(500);
        driver.findElement(By.id("input_3_addr_line1")).sendKeys("Am Schönenkamp");Thread.sleep(500);
        driver.findElement(By.id("input_3_addr_line2")).sendKeys("Hassels");Thread.sleep(500);
        driver.findElement(By.id("input_3_city")).sendKeys("Düesseldorf");Thread.sleep(500);
        driver.findElement(By.id("input_3_state")).sendKeys("NRW");Thread.sleep(500);
        driver.findElement(By.id("input_3_postal")).sendKeys("40599");Thread.sleep(500);

        element=driver.findElement(By.cssSelector("#input_3_country"));
        slc=new Select(element);
        slc.selectByValue("Germany");

       element = driver.findElement(By.cssSelector("#input_11"));

        slc=new Select(element);
//todo    Select tag 'inin içerisindeki options lara ulaşmak için -- >>    getOptions();
        List<WebElement> burs=slc.getOptions();
        //todo     Kaç adet options varsa, int option Sayisina eşitlendi.
        int optionSayisi = burs.size();
        int random = (int)((Math.random()*optionSayisi)+1);
        slc.selectByIndex(random);



        element=driver.findElement(By.cssSelector("#input_19"));
        slc=new Select(element);
        slc.selectByValue("10");




        Thread.sleep(3000);
        driver.quit();

    }
}