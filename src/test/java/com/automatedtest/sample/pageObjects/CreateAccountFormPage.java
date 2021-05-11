package com.automatedtest.sample.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAccountFormPage {

    @FindBy(xpath = "//input[@name=\"email_create\"]")
    @CacheLookup
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"customer_firstname\"]")
    @CacheLookup
    private WebElement fName;

    @FindBy(xpath = "//input[@id=\"customer_lastname\"]")
    @CacheLookup
    private WebElement lName;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    @CacheLookup
    private WebElement password;

    @FindBy(xpath = "//input[@id=\"address1\"]")
    @CacheLookup
    private WebElement address;

    @FindBy(xpath = "//input[@id=\"city\"]")
    @CacheLookup
    private WebElement city;


    @FindBy(xpath = "//input[@id=\"id_state\"]")
    @CacheLookup
    private WebElement state;

    @FindBy(xpath = "//input[@id=\"postcode\"]")
    @CacheLookup
    private WebElement pCode;

    @FindBy(xpath = "//input[@id=\"id_country\"]")
    @CacheLookup
    private WebElement country;

    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    @CacheLookup
    private WebElement mPhone;

    @FindBy(xpath = "//input[@id=\"alias\"]")
    @CacheLookup
    private WebElement reference;

    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    @CacheLookup
    private WebElement submitBtn;


    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }

    public WebElement getfName() {
        return fName;
    }

    public void setfName(WebElement fName) {
        this.fName = fName;
    }

    public WebElement getlName() {
        return lName;
    }

    public void setlName(WebElement lName) {
        this.lName = lName;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getAddress() {
        return address;
    }

    public void setAddress(WebElement address) {
        this.address = address;
    }

    public WebElement getCity() {
        return city;
    }

    public void setCity(WebElement city) {
        this.city = city;
    }

    public WebElement getState() {
        return state;
    }

    public void setState(WebElement state) {
        this.state = state;
    }

    public WebElement getpCode() {
        return pCode;
    }

    public void setpCode(WebElement pCode) {
        this.pCode = pCode;
    }

    public WebElement getCountry() {
        return country;
    }

    public void setCountry(WebElement country) {
        this.country = country;
    }

    public WebElement getmPhone() {
        return mPhone;
    }

    public void setmPhone(WebElement mPhone) {
        this.mPhone = mPhone;
    }

    public WebElement getReference() {
        return reference;
    }

    public void setReference(WebElement reference) {
        this.reference = reference;
    }

    public void clickSubmit() {
        submitBtn.click();
    }
}
