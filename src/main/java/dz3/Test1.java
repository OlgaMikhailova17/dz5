package dz3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start--maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://candles.ru");

        WebElement element1 = driver.findElement(By.cssSelector(".main-header > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
        element1.click();

        WebElement element2 = driver.findElement(By.id("username"));
        element2.click();
        element2.sendKeys("iterat57@gmail.com");

        WebElement element3 = driver.findElement(By.id("password"));
        element3.click();
        element3.sendKeys("1234567890!!qwer");

        WebElement element4 = driver.findElement(By.name("login"));
        element4.click();

    }
}
