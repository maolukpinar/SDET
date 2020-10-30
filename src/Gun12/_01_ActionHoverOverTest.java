package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import utils.BaseStaticDriver;
import java.awt.*;

public class _01_ActionHoverOverTest  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html"); // siteyi açtım
        driver.manage().window().maximize();

        WebElement btnBank=driver.findElement(By.cssSelector("#credit2>a"));

        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(btnBank).build();

        System.out.println("Mouse üzerine gelmeden önce renk :"+  Color.fromString(btnBank.getCssValue("color")).asHex());
        build.perform();
        System.out.println("Mouse üzerine geldikten sonra renk :"+Color.fromString(btnBank.getCssValue("color")).asHex());

        //Mouse üzerine gelmeden önce renk :rgba(255, 255, 255, 1)
        //Mouse üzerine geldikten sonra renk :rgba(238, 121, 51, 1)


        Thread.sleep(6000);
        driver.quit();

        /*
        RGB =>  Red Green Blue  renk lerini temsil ediyor.
Bilgisayarda ekran noktalardan oluşur.buna pixel denir
mesala bu noktaların miktarı söylenirken
800x600 tane pixel var
1024x768
1600x1400
1920x1080 HD high definitation
nokta fazla ise bir ekran o kadar net görüntü olur.
nokta(pixel) bir renk temsil eden en küçük birimdir.
her bir noktadaki renk oluşturuken, şu elektroniği
kullanıyor: her bir nokta kendisine iletilen kadar RED
iletilen kadar GREEN, iletilen BLUE gösteriyor
bunların nekadra iletildiği o pixelin rengini oluşturuyor.
bunların miktarı göstermek için şu format kullanılıyor.
2 hane 00->FF kadar RED   (0-255)
2 hane 00->FF kadar GREEN (0-255)
2 hane 00->FF kadar BLUE  (0-255)

R  G  B
FF FF FF=> bütün renkler en yüksey düzeyde > beyaz

#ee7933 => ee -> RED miktarı , 79 GREEN miktarı, 33 BLUE miktarı
0-9-> 10-> A
      11-> B
      12-> C
      13-> D
      14-> E
      15-> F

0-16 -> HexaDecimal 16 lık sistem deniyor.
asHex() -> 16 sistemde göster demek
         */


    }
}