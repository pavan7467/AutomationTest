package com.automatedtest.sample.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    @CacheLookup
    private WebElement createAccountBtn;

    @FindBy(xpath = "//input[@name=\"email_create\"]")
    @CacheLookup
    private WebElement emailInput;
    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }

}
