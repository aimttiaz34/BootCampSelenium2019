package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;
import webElement.WebElementHomePage;

public class TestHomePage extends HomePage {
    public void getInitElements() {
        PageFactory.initElements(driver, TestHomePage.class);
    }

    @Test(priority = 1)//testing test information
    public void contribute() throws InterruptedException {
        getInitElements();
        Contribute.click();
        sleepFor(5);
    }

    @Test(priority = 2)
    public void contributee() throws InterruptedException {
        getInitElements();
        mouseHoverByXpath(XpathContribute);
        sleepFor(5);
    }

    @Test(priority = 3)
    public void CLA() throws InterruptedException {
        getInitElements();
        mouseHoverByXpath(XpathContribute);
        clickByXpath(XpathCLA);
        sleepFor(7);
    }

    @Test(priority = 4)
    public void CheckRadioButton() throws InterruptedException {
        getInitElements();
        clickByXpath(XpathCheckBoxRadio);
        sleepFor(7);
    }

    ;
    @Test(priority = 5)
    public void Frame() throws InterruptedException {
        getInitElements();
        clickByXpath(XpathCheckBoxRadio);
        iframeHandle(Frame);
        sleepFor(7);

    }
    @Test(priority = 6)
    public void RadioButton() throws InterruptedException {
        getInitElements();
        clickByXpath(XpathCheckBoxRadio);
        iframeHandle(Frame);
        radioButton(XpathRadioButton1);
        sleepFor(3);
        radioButton(XpathRadioButton2);
        sleepFor(3);
        radioButton(XpathRadioButton3);
        sleepFor(5);
    }
    @Test(priority = 6)
    public void CheckBoxButton() throws InterruptedException {
        getInitElements();
        clickByXpath(XpathCheckBoxRadio);
        iframeHandle(Frame);
        checkBox(XpathCheckBox1);
        sleepFor(2);
        checkBox(XpathCheckBox2);
        sleepFor(2);
        checkBox(XpathCheckBox3);
        sleepFor(2);

    }

}
