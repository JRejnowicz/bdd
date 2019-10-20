package com.vistula;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedCalculatorPage extends SimpleCalculatorPage{

    public AdvancedCalculatorPage(AndroidDriver driver) {
        super(driver);
        //PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "fun_cos")
    WebElement cos;
    @FindBy(id = "rparen")
    WebElement rightParen;
    @FindBy(id = "op_pct")
    WebElement percent;
    @FindBy(id = "pad_advanced")
    WebElement advPad;

}
