package dz5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeAll
    static void init(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start--maximized");

        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @BeforeEach
    void getPage(){
        driver.get("https://candles.ru");
    }
    @AfterAll
    static void close(){
      // driver.quit();
    }
}
