package com.vistula;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleCalculatorPage {

    protected AndroidDriver driver;

    @FindBy(id = "digit_2")
    WebElement two;
    @FindBy(id = "digit_3")
    WebElement three;
    @FindBy(id = "digit_4")
    WebElement four;
    @FindBy(id = "op_add")
    WebElement plus;
    @FindBy(id = "op_mul")
    WebElement multiply;
    @FindBy(id = "eq")
    WebElement equals;
    @FindBy(id = "result")
    WebElement result;
    @FindBy(id = "digit_6")
    WebElement six;
    @FindBy(id = "op_sub")
    WebElement minus;
    @FindBy(id = "formula")
    WebElement formula;
    @FindBy(id = "digit_0")
    WebElement zero;
    @FindBy(id = "digit_5")
    WebElement five;

    public SimpleCalculatorPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void assertResult(String expected) {
        Assert.assertEquals(expected, result.getText());
    }



}
