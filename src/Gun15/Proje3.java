package Gun15;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

/*
        Manuel bir şekilde web sitesine kayıt olun. (Kendi hesabınızı oluşturun)

        Bu siteye gidin ->  https://app.hubspot.com/login
        Email address ve Password girdikten sonra Log in buttonuna tıklayınız.

        Sales'a tıklayınız.
        Deals'a tıklayınız.

        Create Deal'a tıklayınız. (Note: Otomasyon sırasında Deal'a tıkladığınızda tablo gözükmeyebilir. Browser'ı yenileyin. (refresh) )
        Deal name giriniz.

        Sales Pipeline'a tıklayınız. (İkinci websitesinin URL'inin bu URL olduğunu doğrulayınız. -->https://app.hubspot.com/pricing/7766931/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter )
        Deal Stage dropdown'undan rastgele bir şey seçiniz.
        Deal Type dropdown'undan rastgele bir şey seçiniz.
        Create button'a tıklayınız.

        Sol üstte, Verdiğiniz isimin yanındaki küçük kalem simgesine tklayınız.
        Deal name'i değiştiriniz.
        Save'e tıklayınız.
        Deal Name'in değiştiğini doğrulayınız.

        "Actions" button'una tıklayınız.
        Delete'e tıklayınız.
        Delete deal'a tıklayınız.

        Deal'ın artık görünmediğini doğrulayınız.



     */
public class Proje3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://app.hubspot.com/login");
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, 5);


        Thread.sleep(5000);
        WebElement signinwg = driver.findElement(By.xpath("//*[@id=\"hs-login\"]/div[8]/a/span[2]"));
        signinwg.click();

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("hudut001@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
        //*[@id="identifierNext"]/div/button/div[2]

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123456hudut");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
        Thread.sleep(3000);
        WebElement sales = driver.findElement(By.xpath("//*[@id=\"nav-primary-sales-branch\"]"));//sales
        wait.until(ExpectedConditions.visibilityOf(sales));
        sales.click();

        WebElement dealsButton = driver.findElement(By.xpath("//*[@id=\"nav-secondary-deals\"]/div[1]"));//deal
        wait.until(ExpectedConditions.visibilityOf(dealsButton));
        dealsButton.click();


        WebElement objeler = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/section/header/div/div/div/div/div[4]/div[3]/div/button/span/span"));
        wait.until(ExpectedConditions.visibilityOf(objeler));
        objeler.click();

        WebElement dealName = driver.findElement(By.xpath("//*[@id=\"UIFormControl-19\"]"));
        wait.until(ExpectedConditions.visibilityOf(dealName));
        dealName.sendKeys("hudut");

        WebElement ToAccount = driver.findElement(By.xpath("//*[@id=\"UIFormControl-23\"]/span/span[1]"));
        ToAccount.click();
        wait.until(ExpectedConditions.visibilityOf(ToAccount));
        driver.findElement(By.xpath("//*[@id=\"typeahead-52_3\"]/span/button/span/span/span")).click();
//        Select Account1 = new Select(ToAccount);
//        Account1.selectByIndex(randomNum(5));


        WebElement amount = driver.findElement(By.xpath("//*[@id=\"UIFormControl-27\"]"));
        wait.until(ExpectedConditions.visibilityOf(amount));
        amount.sendKeys("3000");

        WebElement creatt = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/footer/div/div/div/div/ul/li[1]/button/span"));
        creatt.click();
        WebElement penn = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/aside/div[2]/div/div/section/div/div/div[2]/div/div[2]/div[1]/div[2]/div/span/span"));
        penn.click();

        WebElement nameChange = driver.findElement(By.xpath("(//*[starts-with(@id,'UIFormControl-')])[2]"));
        nameChange.clear();
        nameChange.sendKeys("Border");

        WebElement saveButton = driver.findElement(By.xpath("//*[starts-with(@id,'popover-')]/div/div/div[2]/footer/div/div/button[1]/i18n-string"));
        saveButton.click();
        Thread.sleep(2000);


        WebElement confirmText = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/aside/div[2]/div/div/section/div/div/div[2]/div/div[2]/div[1]/div[1]/h3/span/span"));
        System.out.println(confirmText.getText());
        Assert.assertTrue(confirmText.getText().contains("Border"));
        Thread.sleep(2000);

        WebElement actionButton = driver.findElement(By.xpath("//*[@id=\"uiabstractdropdown-button-9\"]/span/span[1]"));
        actionButton.click();
        Thread.sleep(2000);
        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"dropdown-menu-8\"]/ul/li[8]/button/i18n-string"));
        deleteButton.click();
        Thread.sleep(2000);

        WebElement deletedealButton = driver.findElement(By.cssSelector("body > div:nth-child(15) > div > div > div > div > footer > div > div > button.uiButton.private-button.private-button--destructive.private-button--default.m-left-0.private-button--non-link > i18n-string"));
        deletedealButton.click();

        WebElement deals = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div/section/div/div/main/div/div[2]/div[4]/div/div/header/div[1]/div[2]/h6"));
        Thread.sleep(3000);
        System.out.println("Deals Number is " + deals.getText());


        Thread.sleep(3000);
        driver.quit();
    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}