package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;


public class TshirtStep extends CommonMethods {
    @Given("user on automationpractice website clicks on T-shirt tab")
    public void user_on_automationpractice_website_clicks_on_t_shirt_tab() {
        click(homePage.Tshirts);
    }
    @Then("user select different catalouge options")
    public void user_select_different_catalouge_options() {
    //   click(tshirt.sizeCheckBox);
        tshirt.sizeCheckBox.click();
      // click(tshirt.colorCheckBox);
        tshirt.colorCheckBox.click();
       // click(tshirt.compotionCheckBox);
       tshirt.compotionCheckBox.click();
       // click(tshirt.styleCheckBox);
        tshirt.styleCheckBox.click();
       //click(tshirt.propertiesCheckBox);
       tshirt.propertiesCheckBox.click();
       // click(tshirt.availabilityCheckBox);
       tshirt.availabilityCheckBox.click();
       // click(tshirt.manufacturerCheckBox);
        tshirt.manufacturerCheckBox.click();
       // click(tshirt.conditionCheckBox);
       tshirt.conditionCheckBox.click();

//$0.getBoundingClientRect() element ko select kar ka console man ya
// type karna sa element ka coordinates mil jata h

      Actions action  = new Actions(driver) ;
      action.moveToElement(tshirt.slider);
        action.perform();
        action.dragAndDropBy(tshirt.slider,169,-105).release().build().perform();
       click(tshirt.slider);
        //tshirt.slider.click();
    }
    @Then("user then sort produts")
    public void user_then_sort_produts() throws InterruptedException {
        selectDropdown(tshirt.selectBar,"In stock");
        Thread.sleep(4000);
    }
    @Then("result is displayed sucessfully")
    public void result_is_displayed_sucessfully() {
        System.out.println("success");
    }

    @Then("user add product to cart")
    public void user_add_product_to_cart() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(tshirt.imgFromCart).build().perform();
        action.moveToElement(tshirt.AddToCart).click(tshirt.AddToCart).perform();
        Thread.sleep(3000);

    }
    @Then("user proceed to checkout")
    public void user_proceed_to_checkout()throws InterruptedException {
       /* JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(336,741)");*/

        scrollWebsiteWindow(336,741);
    tshirt.ProceedToCheckout1.click();
    }
    @Then("shopping cart summery page is displayed user cliks on proceed to checkout")
    public void shopping_cart_summery_page_is_displayed_user_cliks_on_proceed_to_checkout()throws InterruptedException {
        scrollWebsiteWindow(1241,409);
        //click(tshirt.ProceedToCheckout2);
        //javaClick(tshirt.ProceedToCheckout2);
        tshirt.ProceedToCheckout2.click();
    }
    @Then("authentication page is displayed")
    public void authentication_page_is_displayed() {

    }



}




