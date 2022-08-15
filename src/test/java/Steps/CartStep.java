package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class CartStep extends CommonMethods {

    @Given(":user on automationpractice website clicks on cart icon")
    public void user_on_automationpractice_website_clicks_on_cart_icon()throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(cartObject.cart).click(cartObject.cart).build().perform();
        Thread.sleep(3000);
    }
    @When(":user clicks on checkout option")
    public void user_clicks_on_checkout_option() throws InterruptedException {
     /*   Thread.sleep(3000);
        cartObject.checkOut.click();*/
        //elment is shown by moving the cursor but later it becomes disable so i cliked the element instead of
        //moving to the element so this part have to comment

    }
    @When("user clicks on dresses option and then on Evenig dresses and add an item")
    public void user_clicks_on_dresses_option_and_then_on_evenig_dresses_and_add_an_item() throws InterruptedException {
        moveToElement(cartObject.dress);
        Thread.sleep(3000);
        cartObject.eveningDress.click();
        Thread.sleep(3000);
        cartObject.checkBox.click();
        scrollWebsiteWindow(779,346);
        Thread.sleep(5000);
        moveToElement(cartObject.img);
        cartObject.addToCart.click();
        Thread.sleep(3000);
        cartObject.proceedToCheckOut.click();

    }
    @When("user increses item quantity and decrese item quantity and cliks on delete icon")
    public void user_increses_item_quantity_and_decrese_item_quantity_and_cliks_on_delete_icon() throws InterruptedException {
scrollWebsiteWindow(849,548);
       Thread.sleep(3000);
cartObject.pluseSign.click();
        //cartObject.pluseSign.click();
        Thread.sleep(3000);
cartObject.minusSign.click();
        Thread.sleep(3000);
cartObject.delete.click();
        Thread.sleep(3000);
    }
    @When("user clicks on Home icon and on Best seller option add an item")
    public void user_clicks_on_home_icon_and_on_best_seller_option_add_an_item() throws InterruptedException {
cartObject.homeIcon.click();
scrollWebsiteWindow(667,396);
Thread.sleep(7000);
cartObject.bestSeller.click();
moveToElement(cartObject.img2);
cartObject.addtocart2.click();
cartObject.procedToCheckOut2.click();


    }
    @When("user clicks continue shopping option")
    public void user_clicks_continue_shopping_option() {
        scrollWebsiteWindow(370,421);
        cartObject.continueShopping.click();

    }
    @Then("user clicks on cart option again and clicks on close option cart is empty now")
    public void user_clicks_on_cart_option_again_and_clicks_on_close_option_cart_is_empty_now() throws InterruptedException {
moveToElement(cartObject.cart);
cartObject.close.click();
Thread.sleep(3000);
    }

}
