package Steps;

import Pages.*;

public class PageInitalizer {
    public static HomePage homePage;
public static TshirtPage tshirt;
    public static signInPage signin;
    public static womenPage womenobject;
    public static dressPage dressObject;
    public static cartPage cartObject;

    public static void initalizePagesObject(){
        homePage=new HomePage();
        tshirt=new TshirtPage();
        signin=new signInPage();
      womenobject=new womenPage();
      dressObject=new dressPage();
      cartObject=new cartPage();
    }
}


