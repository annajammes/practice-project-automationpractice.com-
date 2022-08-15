package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class SignInStep extends CommonMethods {

    @Given("user on website cliks on sign in tab and authentication page open")
    public void user_on_website_cliks_on_sign_in_tab_and_authentication_page_open() {
     click(homePage.signIn);
    }
    @When("user enter valid email address and click create acciunt")
    public void user_enter_valid_email_address_and_click_create_acciunt() throws InterruptedException {
   scrollWebsiteWindow(438,395);
     sendText(signin.emailAddress,"momomo@gmail.com");
            click(signin.createAccount);
        Thread.sleep(500);

    }
    @Then("user enters personal information")
    public void user_enters_personal_information() throws InterruptedException {
        click(signin.radioButtonMrs);
sendText(signin.firstName,"saima1");
        sendText(signin.lastName,"falak");
        sendText(signin.password,"KDS123456789!");
        selecWithValue(signin.selectDays,"6");
        selecWithValue(signin.selectMonth,"5");
        selecWithValue(signin.selectYear,"1991");
        signin.newsLetter.click();
        //click(signin.offer);
        signin.offer.click();
        Thread.sleep(2000);
    }
    @Then("user enters address info")
    public void user_enters_address_info() {
scrollWebsiteWindow(527,575);
sendText(signin.AddressFirstName,"saima1");
        sendText(signin.AddressLastName,"falak");
        sendText(signin.companyName,"ABCDEF");
        sendText(signin.Address1, "lahore punjab pakistan");
        sendText(signin.Address2,"StreetNo2,anarkali bazar Lahore");
        sendText(signin.cityName,"Lahore");
        selecWithValue(signin.stateName,"10");
        sendText(signin.postCode,"00006");
        selecWithValue(signin.countryName,"21");
    }
    @Then("user click on Register")
    public void user_click_on_register() throws InterruptedException {
        scrollWebsiteWindow(568,494);
        sendText(signin.textArea,"i am not a new user");
        sendText(signin.homePhone,"1289045679");
        sendText(signin.mobilePhone,"45678900");
        sendText(signin.aliasAddress,"pattoki tehsl district kasure");
        click(signin.registerButton);

        Thread.sleep(3000);
    }

}
