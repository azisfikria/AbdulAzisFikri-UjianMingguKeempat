package com.abdulazisfikriujianmingguempat.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnOne;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnTwo;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private MobileElement btnPlus;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnMinus;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnMultiply;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    private MobileElement btnDivide;
    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnEquals;
    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement result;

    public void calcAdd() {
        btnOne.click();
        btnPlus.click();
        btnTwo.click();
        btnEquals.click();
    }

    public void calcSubstract(){
        btnOne.click();
        btnMinus.click();
        btnTwo.click();
        btnEquals.click();
    }

    public void calcMultiply(){
        btnOne.click();
        btnMultiply.click();
        btnTwo.click();
        btnEquals.click();
    }

    public void calcDivide(){
        btnOne.click();
        btnDivide.click();
        btnTwo.click();
        btnEquals.click();
    }
    public String getTxtResult() {
        return result.getText();
    }

}
