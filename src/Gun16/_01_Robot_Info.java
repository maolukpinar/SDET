package Gun16;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _01_Robot_Info extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://www.cleartrip.com/");

        Robot rbt = new Robot();

        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_TAB);//keyPress tuşa basıldı
        rbt.keyRelease(KeyEvent.VK_TAB);//keyReLease tuşu bıraktı

        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_TAB);//keyPress tuşa basıldı
        rbt.keyRelease(KeyEvent.VK_TAB);//keyReLease tuşu bıraktı

        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_TAB);//keyPress tuşa basıldı
        rbt.keyRelease(KeyEvent.VK_TAB);//keyReLease tuşu bıraktı

        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_ENTER);//keyPress tuşa basıldı
        rbt.keyRelease(KeyEvent.VK_ENTER);//keyReLease tuşu bıraktı








       Thread.sleep(3000);
        driver.quit();

    }
}