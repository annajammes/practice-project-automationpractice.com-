package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.FileReader;

public class HomeStep extends CommonMethods {
    @Given("user on automationpractice website")
    public void user_on_automationpractice_website() {
//open();
    }
    @When("user enter data to search")
    public void user_enter_data_to_search() {
       // homePage.searchBar.sendKeys(FileReader.getPropertyValue("dataToserach"));
        sendText(homePage.searchBar, FileReader.getPropertyValue("dataToserach"));
        click(homePage.searchIcon);

    }
    @Then("data displayed successfully")
    public void data_displayed_successfully() {
        System.out.println("data printed successfully");

    }

    @Given("user clicks next button and previous button on home page")
    public void user_clicks_next_button_and_previous_button_on_home_page() throws InterruptedException {
       homePage.nextButton.click();
       Thread.sleep(2000);
       homePage.previousButton.click();
        Thread.sleep(2000);
    }

    @Given("user select a subject heading")
    public void user_select_a_subject_heading()throws InterruptedException {
        homePage.contactUs.click();
        Thread.sleep(3000);
selectDropdown(homePage.subjectHeading, "Webmaster");
    }
    @Given("user then enter email address and order reference")
    public void user_then_enter_email_address_and_order_reference() throws InterruptedException {
        scrollWebsiteWindow(452,494);
        Thread.sleep(4000);
sendText(homePage.emailAddres,"support@seleniumframework.com");
sendText(homePage.orderReference,"abc1234");
    }
    @Given("user then attach file")
    public void user_then_attach_file() {
homePage.uploadFile.sendKeys("C:\\Users\\saima\\OneDrive\\Desktop\\comd.txt");
    }
    @Given("user enter message")
    public void user_enter_message() {
        sendText(homePage.message,"i want to report a bug that proceed to checkout button is not working.");
    }
    @Given("user cliks send")
    public void user_cliks_send() {
        homePage.send.click();

    }
}
