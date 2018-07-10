package com.saha.test.login;

import com.saha.test.util.BasePageUtil;
import com.saha.test.util.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePageUtil implements Constants {

    public LoginPage(AndroidDriver<MobileElement> driver){
        super(driver);

    }

    public void loginAndUsernameControl(){


    userLogin();
    userNameControl();

    closeAccountBar(closeAccountBardId);








    }

    public void userLogin(){
        sleep(5);

        closeFirstLogin(loginId);

        closeWidget(widgetXpath);
        sleep(2);
        closeWidget(widgetXpath);

        sleep(2);
        clickAccountImage(accountImageId);

        goToLoginPage(loginPageXpath);

        sleep(2);

        emailClickandSendKey(emailId,email);
        passwordClickandSendKey(passwordId,password);

        sleep(1);
        clickLoginbutton(loginButtonId);

        //googleSavePass(autoFillId); ilk giriş için geçerli

        welcomeButtonClose(welcomeButtonId);

    }

    public void userNameControl(){
        String userName = getAccountUsername(userAccountUsernameId);

        Assert.assertEquals("Kullanıcı Adı hatası",userName,"ahmet demirel");

    }


}
