package com.automatedtest.sample.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public WebDriver ldriver;

    public HomePage(WebDriver rDriver) {
        this.ldriver = rDriver;
        PageFactory.initElements(rDriver,this);
    }

    @FindBy(xpath = "//a[@class = \"login\"]")
    @CacheLookup
    private WebElement signin;

    @FindBy(css = "input.search_query")
    @CacheLookup
    private WebElement searchInput;

    public void clickSignin() {
        signin.click();
    }

    public WebElement getSignin() {
        return signin;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

}
