package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userNameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    /**
     * this method is used to enter user name
     *
     * @param name
     */
    public void enterUserName(String name) {
        CustomListeners.test.log(Status.PASS, "Enter User Name : " + userNameField);
        Reporter.log("Enter User Name " + userNameField.toString());
        sendTextToElement(userNameField, name);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "Enter Password" + passwordField);
        Reporter.log("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void clickLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click on Login Button"+loginButton);
        Reporter.log("Click on Login Button");
        clickOnElement(loginButton);
    }
}
