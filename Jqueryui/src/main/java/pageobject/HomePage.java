package pageobject;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import webElement.WebElementHomePage;


public class HomePage extends WebElementHomePage {

    // All the Home Page Action Methods comes on this class

    @FindBy(how= How.LINK_TEXT,using = LinkTextContribute)
    public static WebElement Contribute;
    public static WebElement getContribute(){return Contribute; }
    //public static  void clickContributeMenu(){ getContribute().click();
    //}

    @FindBy(how= How.XPATH,using = XpathContribute)
    public static WebElement Contributee;
    public static WebElement getContributee(){return Contributee; }

    @FindBy(how= How.XPATH,using = XpathCLA)
    public static WebElement CLA;
    public static WebElement getCLA(){return CLA; }

    @FindBy(how= How.XPATH,using = XpathCheckBoxRadio)
    public static WebElement CheckBoxRadio;
    public static WebElement getCheckBoxRadio(){return CheckBoxRadio; }

    @FindBy(how= How.XPATH,using = XpathRadioButton1)
    public static WebElement RadioButton1;
    public static WebElement getRadioButton1(){return RadioButton1; }

    @FindBy(how= How.XPATH,using = XpathRadioButton2)
    public static WebElement RadioButton2;
    public static WebElement getRadioButton2(){return RadioButton2; }

    @FindBy(how= How.XPATH,using = XpathRadioButton3)
    public static WebElement RadioButton3;
    public static WebElement getRadioButton3(){return RadioButton3; }

    @FindBy(how= How.XPATH,using = XpathFrame)
    public static WebElement Frame;
    public static WebElement getFrame(){return Frame; }

    @FindBy(how= How.XPATH,using = XpathCheckBox1)
    public static WebElement CheckBox1;
    public static WebElement getCheckBox1(){return CheckBox1; }
    @FindBy(how= How.XPATH,using = XpathCheckBox2)
    public static WebElement CheckBox2;
    public static WebElement getCheckBox2(){return CheckBox2; }
    @FindBy(how= How.XPATH,using = XpathCheckBox3)
    public static WebElement CheckBox3;
    public static WebElement getCheckBox3(){return CheckBox3; }
}
