package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;
public class TshirtPage {

    @FindBy(id="selectProductSort")
    public WebElement selectBar;

    @FindBy(id="layered_id_attribute_group_1")
    public WebElement sizeCheckBox;

    @FindBy(id="layered_id_attribute_group_13")
    public WebElement colorCheckBox;

    @FindBy(id="layered_id_feature_5")
    public WebElement compotionCheckBox;

    @FindBy(id="layered_id_feature_11")
    public WebElement styleCheckBox;

    @FindBy(id="layered_id_feature_17")
    public WebElement propertiesCheckBox;

    @FindBy(id="layered_quantity_1")
    public WebElement availabilityCheckBox;

    @FindBy(id="layered_manufacturer_1")
    public WebElement manufacturerCheckBox;

    @FindBy(id="layered_condition_new")
    public WebElement conditionCheckBox;

    @FindBy(xpath = "//*[@id=\"layered_price_slider\"]/a[1]")
    public WebElement slider;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public WebElement AddToCart;

    @FindBy(xpath ="//div[@class='button-container']//a//span//i[@class='icon-chevron-right right']")
    public WebElement ProceedToCheckout1;

    @FindBy(className ="//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement ProceedToCheckout2;

    @FindBy(xpath ="//img[@title='Faded Short Sleeve T-shirts']")
    public WebElement imgFromCart;

    public TshirtPage(){
        PageFactory.initElements(driver,this);
    }
}

