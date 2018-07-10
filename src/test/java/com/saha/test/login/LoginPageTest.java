package com.saha.test.login;

import com.saha.test.Product.AddToCard;
import com.saha.test.Product.OrderComplete;
import com.saha.test.base.BaseTest;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void login() {
        new LoginPage(driver).loginAndUsernameControl();
        new AddToCard(driver).addCard();
        new OrderComplete(driver).orderComplete();

    }
}