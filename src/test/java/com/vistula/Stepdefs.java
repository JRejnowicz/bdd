package com.vistula;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Stepdefs {

    AndroidDriver driver;
    SimpleCalculatorPage simplePage;
    AdvancedCalculatorPage advancedPage;

    @Before
    public void setup() throws MalformedURLException {
        URL server = new URL("http://0.0.0.0:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "nexus");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        driver = new AndroidDriver(server, capabilities);
        simplePage = new SimpleCalculatorPage(driver);
        advancedPage = new AdvancedCalculatorPage(driver);
    }

    @After
    public void teardown() {
        //driver.quit();
    }

    @Given("I open calculator")
    public void i_open_calculator() {

    }

    @When("I rotate to horizontal position")
    public void i_rotate_to_horizontal_position() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    @Then("advanced options are visible")
    public void advanced_options_are_visible() {
        assert advancedPage.advPad.isDisplayed();
    }

    @When("I add two numbers")
    public void i_add_two_numbers() {
        advancedPage.two.click();
        advancedPage.plus.click();
        advancedPage.three.click();
    }

    @When("I rotate to portrait position")
    public void i_rotate_to_portrait_position() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    @Then("advanced options are not shown")
    public boolean advanced_options_are_not_shown() {
        if (advancedPage.advPad.isDisplayed())
            return false;
        else
            return true;
}

catch(Exception e)
}
