package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;
public class cartPage {

    @FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public WebElement cart;

@FindBy(xpath ="//*[@id=\"button_order_cart\"]/span")
public WebElement checkOut;

@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
public WebElement dress;

    @FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    public WebElement eveningDress;

    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement img;

    @FindBy(xpath ="//*[@id=\"layered_condition_new\"]")
    public WebElement checkBox;

    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    public WebElement addToCart;

    @FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedToCheckOut;

    @FindBy(xpath ="//*[@id=\"cart_quantity_up_4_16_0_0\"]/span/i")
    public WebElement pluseSign;

    @FindBy(xpath ="//*[@id=\"cart_quantity_down_4_16_0_0\"]/span/i")
    public WebElement minusSign;

    @FindBy(xpath ="//*[@id=\"4_16_0_0\"]/i")
    public WebElement delete;

    @FindBy(xpath ="//*[@id=\"columns\"]/div[1]/a/i")
    public WebElement homeIcon;

    @FindBy(xpath ="//*[@id=\"home-page-tabs\"]/li[2]/a")
    public WebElement bestSeller;

    @FindBy(xpath ="//*[@id=\"blockbestsellers\"]/li[4]/div/div[1]/div/a[1]/img")
    public WebElement img2;

    @FindBy(xpath ="//*[@id=\"blockbestsellers\"]/li[4]/div/div[2]/div[2]/a[1]/span")
    public WebElement addtocart2;

    @FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement procedToCheckOut2;

    @FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[2]")
    public WebElement continueShopping;

    @FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")
    public WebElement close;


   public cartPage(){
       PageFactory.initElements(driver,this);
   }
}
