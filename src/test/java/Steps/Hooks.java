package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start(){
        open();
    }

    @After
    public void end(){

        close(); }
}
