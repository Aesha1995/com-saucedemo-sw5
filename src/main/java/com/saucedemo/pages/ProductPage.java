package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productText;
    By productSize = By.xpath("//div[@class='inventory_item']");
    public String getProductText(){
        CustomListeners.test.log(Status.PASS,"Get Product Text"+productText);
        Reporter.log("Get Product Text");
        return getTextFromElement(productText);
    }
    public String getProductSize(){
        CustomListeners.test.log(Status.PASS,"Get Product Size"+productSize);
        Reporter.log("Get Product Text");
        List<WebElement> size = driver.findElements(productSize);
        return String.valueOf(size);
    }
}
