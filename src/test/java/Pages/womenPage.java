package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;

public class womenPage {

    @FindBy(className = "sf-with-ul")
    public WebElement womenTag;

   @FindBy(xpath ="//a[text()='Blouses']")
    public WebElement blouse;

    @FindBy(id="layered_id_attribute_group_1")
    public WebElement sizeCheckBox;

    @FindBy(xpath="//img[@title='Blouse']")
    public WebElement imgForOrderConf;

    @FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
    public WebElement addToCart;

    @FindBy(id="layered_condition_new")
    public WebElement conditionCheckBox;

    @FindBy(xpath="//a[@class='btn btn-default button button-medium']")
    public WebElement proceedToCheckout;

    @FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement proceedToCheckout2;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement passwordBox;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
    public WebElement signInButton;

    @FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceedToCheckout3;

    @FindBy(id="cgv")
    public WebElement termOfServiceCheckBox;

    @FindBy(xpath="//*[@id=\"form\"]/p/button/span")
    public WebElement proceedToCheckout4;

 @FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
 public WebElement payByBank;

 @FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
 public WebElement orderConfirm;

    public womenPage(){
        PageFactory.initElements(driver,this);

    }
}
