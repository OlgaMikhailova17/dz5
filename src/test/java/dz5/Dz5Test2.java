package dz5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dz5Test2 extends AbstractTest{
    @Test
    void search() throws InterruptedException{
        Actions sh = new Actions(getDriver());
        WebElement element2 = getDriver().findElement(By.name("s"));
        element2.click();
        sh
                .click(element2)
                .sendKeys(getDriver().findElement(By.name("s")),"свечи")
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector("#woocommerce_product_search-5 .searchsubmit")))
                .click(getDriver().findElement(By.cssSelector(".product-grid-item:nth-child(2) .hover-img .attachment-woocommerce_thumbnail")))
                .build()
                .perform();
        Thread.sleep(1000);
    }
}
