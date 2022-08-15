package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import java.awt.*;

public class DressStep extends CommonMethods {

    @Given("user on website click on dresses option and then on casual dress option")
    public void user_on_website_click_on_dresses_option_and_then_on_casual_dress_option() {
        Actions action = new Actions(driver);
        action.moveToElement(dressObject.dress).perform();
        dressObject.casualDress.click();
    }
    @When("an item is selected the cliks on list view option")
    public void an_item_is_selected_the_cliks_on_list_view_option() {
dressObject.sizeCkBox.click();
dressObject.list.click();
    }
    @When("then on add to wishlist option and then clicks on add to compare comparison page shows")
    public void then_on_add_to_wishlist_option_and_then_clicks_on_add_to_compare_comparison_page_shows() throws InterruptedException {
//dressObject.wishList.click();
dressObject.addToCompare.click();
Thread.sleep(3000);
dressObject.compareButton.click();
       // click(dressObject.compareButton);
scrollWebsiteWindow(1056,433);
    }
    @When("click on view option and then click on send to a friend  fil the data and click send")
    public void click_on_view_option_and_then_click_on_send_to_a_friend_fil_the_data_and_click_send() {
dressObject.view.click();
scrollWebsiteWindow(788,360);
dressObject.sendToFriend.click();
sendText(dressObject.friendName,"sam");
sendText(dressObject.friendEmail,"abc@gmail.com");
dressObject.send.click();
dressObject.ok.click();


    }
    @When("clikc on print option and then print")
    public void clikc_on_print_option_and_then_print() throws AWTException, InterruptedException {
/*dressObject.print.click();
Thread.sleep(3000);
        Robot r = new Robot();
        r.delay(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);*/


    }
    @When("click on view larger and then on next option and then close")
    public void click_on_view_larger_and_then_on_next_option_and_then_close() throws InterruptedException {
        Thread.sleep(3000);
dressObject.viewLarger.click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(dressObject.next).perform();
dressObject.next.click();
        Thread.sleep(3000);
        dressObject.close.click();

    }
    @Then("user click on increase quantity and then decrese")
    public void user_click_on_increase_quantity_and_then_decrese() throws InterruptedException {
        dressObject.increaseButton.click();
        Thread.sleep(3000);
        dressObject.decreaseButton.click();
        Thread.sleep(3000);
    }
}
