package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.FileReader;

public class HomeSearchBarStep extends CommonMethods {
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
}
