package Mentors.Omer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Css_Selecvtor_Ders_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home%22"); // siteyi açtım
        driver.manage().window().maximize();

       // css        Basit hali
        WebElement searchArea = driver.findElement(By.cssSelector("input[name=search]"));

        searchArea.sendKeys("Iphone");

//          Class aramak için "." (nokta) kullanıyoruz.         Tüm html kodlarında class ismi arama
        WebElement searchButton=driver.findElement(By.cssSelector(".btn-default.btn-lg"));

        searchButton.click();
        //      Tüm buttonların içerisindeki class ismini arama : >>>>    button.btn-default
        //child-parent          span.input-group-btn>button


        /* todo   ID
        button[id=list-view]
        button#list-view
         */

        WebElement listButton = driver.findElement(By.cssSelector("button#list-view"));

        listButton.click();

       /*
todo  Contains   * işareti ile bulunur.

button[onclick*=cart] */

        driver.findElement(By.cssSelector("button[onclick*=cart]")).click();


    }
}