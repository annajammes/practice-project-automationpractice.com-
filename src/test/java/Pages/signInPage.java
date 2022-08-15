package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.driver;

public class signInPage {
    @FindBy(id="email_create")
    public WebElement emailAddress;

    @FindBy(xpath="//span//i[@class='icon-user left']")
    public WebElement createAccount;

    @FindBy(id="id_gender2")
    public WebElement radioButtonMrs;

    @FindBy(id="customer_firstname")
    public WebElement firstName;

    @FindBy(id="customer_lastname")
    public WebElement lastName;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="days")
    public WebElement selectDays;

    @FindBy(id="months")
    public WebElement selectMonth;

    @FindBy(id="years")
    public WebElement selectYear;

    @FindBy(id="newsletter")
    public WebElement newsLetter;

    @FindBy(id="optin")
    public WebElement offer;

// YOUR ADDRESS REALTED ELEMENTS

@FindBy(xpath="//input[@id='firstname']")
public WebElement AddressFirstName;

    @FindBy(id="lastname")
    public WebElement AddressLastName;;

    @FindBy(id="company")
    public WebElement companyName;

    @FindBy(id="address1")
    public WebElement Address1;

    @FindBy(id="address2")
    public WebElement Address2;

    @FindBy(id="city")
    public WebElement cityName;

    @FindBy(id="id_state")
    public WebElement stateName;

    @FindBy(id="postcode")
    public WebElement postCode;

    @FindBy(id="id_country")
    public WebElement countryName;


    @FindBy(id="other")
    public WebElement textArea;

    @FindBy(id="phone")
    public WebElement homePhone;

    @FindBy(id="phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id="alias")
    public WebElement aliasAddress;

    @FindBy(id="submitAccount")
    public WebElement registerButton;

    public signInPage(){
        PageFactory.initElements(driver,this);
    }
}
