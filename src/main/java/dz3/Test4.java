package dz3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start--maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://candles.ru");

        WebElement element1 = driver.findElement(By.cssSelector(".menu-left #menu-item-59296 span"));
        element1.click();

        WebElement element2 = driver.findElement(By.cssSelector("div.product-grid-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h3:nth-child(1) > a:nth-child(1)"));
        element2.click();

        WebElement element3 = driver.findElement(By.name("add-to-cart"));
        element3.click();

        WebElement element4 = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/div/a[1]/img"));
        element4.click();

        WebElement element5 = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[4]/div[3]/a/span/span[1]"));
        element5.click();

        WebElement element6 = driver.findElement(By.cssSelector(".remove:nth-child(1)"));
        element6.click();
    }
}
