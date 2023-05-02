package com.sauce.demo.testsuite;

import com.sauce.demo.pages.InventoryPage;
import com.sauce.demo.pages.LoginPage;
import com.sauce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //object to call the methods
    LoginPage login = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //sending text to username field
        login.enterUserNameInTheUserNameField("standard_user");
        //sending the text to password field
        login.enterPasswordInThePasswordField("secret_sauce");
        //clicking on the loging button
        login.clickOnLoginButton();
        //comparing the actual and expected list size and the product text
        Assert.assertEquals(inventoryPage.getTitleOfThePage(), "Products", "Title of the page is incorrect");
        Assert.assertEquals(inventoryPage.sizeOfTheList(), 6, "The size of the list is incorrect");
    }

}
