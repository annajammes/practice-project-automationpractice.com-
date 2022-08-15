package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;
public class dressPage {

    @FindBy(xpath ="(//a[@class='sf-with-ul'])[4]")
    public WebElement dress;

    @FindBy(xpath ="(//a[@title='Casual Dresses'])[2]")
    public WebElement casualDress;

    @FindBy(xpath ="//*[@id=\"list\"]/a/i")
    public WebElement list;

    @FindBy(id ="layered_id_attribute_group_3")
    public WebElement sizeCkBox;

    @FindBy(xpath ="//a[@class='addToWishlist wishlistProd_3']")
    public WebElement wishList;

@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[3]/div[2]/a")
public WebElement addToCompare;

@FindBy(xpath ="//*[@id=\"center_column\"]/div[2]/div[2]/form/button/span")
public WebElement compareButton;

    @FindBy(xpath ="//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[5]/div/div/a[2]/span")
    public WebElement view;

    @FindBy(id ="send_friend_button")
    public WebElement sendToFriend;

    @FindBy(id ="friend_name")
    public WebElement friendName;

    @FindBy(id ="friend_email")
    public WebElement friendEmail;

    @FindBy(xpath ="//*[@id=\"sendEmail\"]/span")
    public WebElement send;

    @FindBy(xpath ="//*[@id=\"product\"]/div[2]/div/div/a")
    public WebElement close;

    @FindBy(xpath ="//*[@id=\"usefull_link_block\"]/li[2]/a")
    public WebElement print;

    @FindBy(xpath ="//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")
    public WebElement printPage;

    @FindBy(xpath ="//*[@id=\"view_full_size\"]/span")
    public WebElement viewLarger;

    @FindBy(xpath ="//*[@id=\"product\"]/div[2]/div/div[1]/a[2]/span")
    public WebElement next;

    @FindBy(xpath ="//*[@id=\"product\"]/div[2]/div/div/div/p[2]/input")
    public WebElement ok;

    @FindBy(xpath ="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
    public WebElement increaseButton;

    @FindBy(xpath ="//*[@id=\"quantity_wanted_p\"]/a[1]/span/i")
    public WebElement decreaseButton;



    public dressPage(){
        PageFactory.initElements(driver,this);
    }
}
