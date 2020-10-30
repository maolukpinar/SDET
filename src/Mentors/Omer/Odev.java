package Mentors.Omer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseStaticDriver;

public class Odev extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();



        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Ömer");


        driver.findElement(By.cssSelector("#lastName.mr-sm-2")).sendKeys("Özdemir");


        driver.findElement(By.cssSelector("div>input#userEmail")).sendKeys("omer@gmail.com");


        driver.findElement(By.cssSelector("label[for=gender-radio-1]")).click();


        driver.findElement(By.cssSelector("#userNumber")).sendKeys("0535123123");


        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-3]")).click();


        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Germany");



        driver.findElement(By.cssSelector("button.btn-primary")).click();


        WebElement gerceklesecekOlanMesaj = driver.findElement(By.cssSelector(".modal-title"));

        String beklenenMesaj="Thanks for submitting the form";


        Assert.assertEquals(beklenenMesaj,gerceklesecekOlanMesaj.getText());

        System.out.println("Formu doldurduğunuz için teşekkür ederiz....");


        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div>button#closeLargeModal")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
