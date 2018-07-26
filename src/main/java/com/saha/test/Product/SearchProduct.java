package com.saha.test.Product;

import com.saha.test.util.BasePageUtil;
import com.saha.test.util.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchProduct extends BasePageUtil implements Constants {

    public SearchProduct(AndroidDriver<MobileElement> driver){
        super(driver);

    }

    public void search(){
        sleep(5);
        closeFirstLogin(loginId);
        closeWidget(widgetXpath);
        closeWidget(widgetXpath);

        homeSearchClick(homeSearchAreaId);
        sleep(2);
        searchBoxClickAndSendKey(searchBoxId,searchKey);

        pressSearch();
        // version kontrol icin yorum satiri
        //clickSearchProduct(productXpath);

        sleep(2);
        tapWithCoordinates();
        sleep(1);
        tapWithCoordinates();
        sleep(1);

        clickAfterSearchProduct(productXpathAfterSearch);

        swipeDown();
        swipeDown();

        productAddToCard(productAddToCard);





    }
}
