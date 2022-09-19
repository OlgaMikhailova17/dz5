package dz3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start--maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://candles.ru");

        WebElement element1 = driver.findElement(By.name("s"));
        element1.click();
        element1.sendKeys("свечи");

        WebElement element2 = driver.findElement(By.cssSelector("#woocommerce_product_search-5 .searchsubmit"));
        element2.click();

        WebElement element3 = driver.findElement(By.cssSelector(".product-grid-item:nth-child(2) .hover-img .attachment-woocommerce_thumbnail"));
        element3.click();
    }
}
