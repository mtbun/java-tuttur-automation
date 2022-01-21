package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

    public WebDriver driver;

    public Util(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By by){
        return driver.findElement(by);
    }

    public void clickElement(By by){
        driver.findElement(by).click();
    }

}
