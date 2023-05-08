package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    ProductPage productPage;
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        productPage = new ProductPage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.getProductText();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.getProductSize();
    }
}
