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


public HomePage(){
    PageFactory.initElements(driver,this);
}
}
