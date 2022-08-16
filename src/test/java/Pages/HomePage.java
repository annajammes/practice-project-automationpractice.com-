package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;

public class HomePage {
    @FindBy(id="search_query_top")
   public WebElement searchBar;

    @FindBy(xpath="//button[@class='btn btn-default button-search']")
    public WebElement searchIcon;

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement Tshirts;

    @FindBy(xpath ="//a[@title='Log in to your customer account']")
   public WebElement signIn;

    @FindBy(xpath ="//*[@id=\"homepage-slider\"]/div/div[2]/div/a[2]")
    public WebElement nextButton;

    @FindBy(xpath ="//*[@id=\"homepage-slider\"]/div/div[2]/div/a[1]")
    public WebElement previousButton;

    @FindBy(xpath ="//*[@id=\"contact-link\"]/a")
    public WebElement contactUs;

    @FindBy(id ="id_contact")
    public WebElement subjectHeading;

    @FindBy(xpath="//*[@id=\"email\"]")
    public WebElement emailAddres;

    @FindBy(id ="id_order")
    public WebElement orderReference;

    @FindBy(xpath ="//*[@id=\"submitMessage\"]/span")
    public WebElement send;

    @FindBy(id="message")
    public WebElement message;

 @FindBy(id="fileUpload")
 public WebElement uploadFile;

 @FindBy(xpath="//*[@id=\"social_block\"]/ul/li[1]/a")
 public WebElement faceBook;

 @FindBy(xpath="//*[@id=\"social_block\"]/ul/li[2]/a")
 public WebElement twitter;

 @FindBy(xpath="//*[@id=\"social_block\"]/ul/li[3]/a")
 public WebElement yotube;

 @FindBy(xpath="//*[@id=\"social_block\"]/ul/li[4]/a")
 public WebElement googlePliuse;




public HomePage(){
    PageFactory.initElements(driver,this);
}
}
