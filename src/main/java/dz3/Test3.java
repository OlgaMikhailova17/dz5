package dz3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Test3 {
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

        WebElement element4 = driver.findElement(By.cssSelector(".main-header .woodmart-cart-icon"));
        element4.click();
    }
}
