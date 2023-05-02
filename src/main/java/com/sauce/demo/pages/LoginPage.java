package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //declaring the variables

    By usernameField = (By.id("user-name"));

    By passwordField = (By.id("password"));

    By loginButton = (By.xpath("//input[@class='submit-button btn_action']"));

    //this method will enter the username
    public void enterUserNameInTheUserNameField(String username) {
        sendTextToElement(usernameField, username);


    }

    // this method will enter the password
    public void enterPasswordInThePasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    //this method will click on the  login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);

    }
}