package com.saha.test.Product;

import com.saha.test.util.BasePageUtil;
import com.saha.test.util.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddToCard extends BasePageUtil implements Constants {

    public AddToCard(AndroidDriver<MobileElement> driver){
        super(driver);

    }

    public void addToCard(){
        sleep(5);
        closeFirstLogin(loginId);
        closeWidget(widgetXpath);
        closeWidget(widgetXpath);
        sleep(1);
        addCard();


    }
    public void addCard(){
        swipeDown();
        sleep(1);
        swipeDown();
        sleep(3);


        //clickProduct(productPageXpath);
        chooseProduct(homeProductGroupXpath, productGroupIndex);
        sleep(2);
        swipeDown();

        productAddToCard(productAddToCard);

    }


}
