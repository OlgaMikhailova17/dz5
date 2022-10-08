package dz5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Dz5Test extends AbstractTest {
    @Test
    void authorization() throws InterruptedException {
        Actions autho = new Actions(getDriver());
        WebElement element1 = getDriver().findElement(By.cssSelector(".main-header > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
        element1.click();
        autho
                .click(getDriver().findElement(By.cssSelector(".main-header > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")))
                .pause(1000l)
                .click(getDriver().findElement(By.id("username")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("username")),"iterat57@gmail.com")
                .pause(1000l)
                .click(getDriver().findElement(By.id("password")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("password")),"1234567890!!qwer")
                .pause(2000l)
                .click(getDriver().findElement(By.name("login")))
                .pause(2000l)
                .build()
                .perform();
        Thread.sleep(1000);
    }


}
