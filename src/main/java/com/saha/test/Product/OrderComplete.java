package com.saha.test.Product;

import com.saha.test.util.BasePageUtil;
import com.saha.test.util.Constants;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OrderComplete extends BasePageUtil implements Constants {

    public OrderComplete(AndroidDriver<MobileElement> driver){
        super(driver);
    }

    public void orderComplete(){
        sleep(7);
        pressOrderComplete();
        pressOrderComplete();
        sleep(5);

        swipeDown();
        swipeDown();
        swipeDown();
        swipeDown();

        paymentOptions(paymentOptionsXpath);
        sleep(6);



        creditCard();



    }

    public void creditCard(){
        swipeDown();
        creditCardNo(creditCardXpath, "25252525252525");
        creditCardName(creditCardXpath,"Ahmet Demirel");
        creditCardMonth(creditCardDateClickXpath,creditCardMonthXpath);
        sleep(1);
        creditCardYear(creditCardDateClickXpath,creditCardYearXpath);
        creditCardCvv(creditCardXpath,"255");


    }
}
