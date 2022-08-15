package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class WomenStep extends CommonMethods {

    @Given("user on website cliks women tag")
    public void user_on_website_cliks_women_tag()  {
        Actions action = new Actions(driver);
        action.moveToElement(womenobject.womenTag).perform();

    }
    @When("user select blouse tag and select an item add it to cart")
    public void user_select_blouse_tag_and_select_an_item_add_it_to_cart()throws InterruptedException {
        womenobject.blouse.click();
        womenobject.sizeCheckBox.click();
        womenobject.conditionCheckBox.click();
        scrollWebsiteWindow(993,263);
        Actions action = new Actions(driver);
        action.moveToElement(womenobject.imgForOrderConf).build().perform();
        action.moveToElement(womenobject.addToCart).click(womenobject.addToCart).build().perform();
        womenobject.proceedToCheckout.click();
        Thread.sleep(3000);
    }
    @Then("then click proceed checkout  summary page open and user click proceed checkout")
    public void then_click_proceed_checkout_summary_page_open_and_user_click_proceed_checkout() {
        scrollWebsiteWindow(1039,477);
        womenobject.proceedToCheckout2.click();

    }
    @Then("then user enter aleardy registered information and click sign in button")
    public void then_user_enter_aleardy_registered_information_and_click_sign_in_button() {
        scrollWebsiteWindow(985,355);
        sendText(womenobject.emailBox,"momomo@gmail.com");
        sendText(womenobject.passwordBox,"KDS123456789!");
        click(womenobject.signInButton);

    }
    @Then("then user click proceed checkout on shipping page user click agree to term checkbox")
    public void then_user_click_proceed_checkout_on_shipping_page_user_click_agree_to_term_checkbox() {
        scrollWebsiteWindow(995,430);
        womenobject.proceedToCheckout3.click();
        scrollWebsiteWindow(1004,392);
        womenobject.termOfServiceCheckBox.click();
        womenobject.proceedToCheckout4.click();

    }
    @Then("user on payment page click on pay by bank wire")
    public void user_on_payment_page_click_on_pay_by_bank_wire() {
        scrollWebsiteWindow(699,372);
        womenobject.payByBank.click();

    }
    @Then("user click on i confirm my order")
    public void user_click_on_i_confirm_my_order() {
        scrollWebsiteWindow(1005,317);
        womenobject.orderConfirm.click();


}}
