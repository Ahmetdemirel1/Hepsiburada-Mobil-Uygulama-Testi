package com.saha.test.util;

import org.openqa.selenium.By;

public interface Constants {

    By loginId = By.id("com.pozitron.hepsiburada:id/ivLoginClose");
    By widgetXpath = By.xpath("//android.widget.TextView[@text='Size Özel']");

    By accountImageId = By.id("com.pozitron.hepsiburada:id/iv_toolbar_user_account_menu");

    By loginPageXpath = By.xpath("//android.widget.TextView[@text='Giriş Yap']");

    By emailId = By.id("com.pozitron.hepsiburada:id/etLoginEmail");
    By passwordId = By.id("com.pozitron.hepsiburada:id/etLoginPassword");

    String email = "ahmetdemirel123@ahmetdemirel.com";
    String password = "ahmet123";

    By loginButtonId = By.id("com.pozitron.hepsiburada:id/btnLoginLogin");

    By autoFillId = By.id("android:id/autofill_save_no");

    By welcomeButtonId = By.id("android:id/button1");

    By userAccountUsernameId = By.id("com.pozitron.hepsiburada:id/tvUserAccountUsername");

    By closeAccountBardId = By.id("com.pozitron.hepsiburada:id/btnUserAccountClose");


    //#########################
    // Ürün arama
    By homeSearchAreaId = By.id("com.pozitron.hepsiburada:id/tv_home_search");
    By searchBoxId = By.id("com.pozitron.hepsiburada:id/etACBSearchBox");

    String searchKey = "iphone";

    By productXpath = By.xpath("//android.widget.TextView[@text='iphone']");

    //Aranan ürünlerden ilk sıradakinin sayfasına gitme
    By productXpathAfterSearch = By.xpath("//android.widget.TextView[@text='Apple iPhone 8 Plus 64 GB (Apple Türkiye Garantili)']");


    // ############################


    // swipedown sonrası ürün sayfasına gitme



    int productGroupIndex = 1;
    By homeProductGroupXpath = By.xpath("//android.view.ViewGroup[@index='1']//android.widget.ImageView");

    By productAddToCard = By.id("com.pozitron.hepsiburada:id/atcb_product_detail_add_to_cart");

    //Odeme secenekleri

    By paymentOptionsXpath = By.xpath("//android.widget.Button[@text='Ödeme Seçenekleri']");
    By creditCardXpath = By.xpath("//android.view.View[@index='1']//android.widget.EditText");

    By creditCardDateClickXpath = By.xpath("//android.view.View[@index='1']//android.widget.Spinner");


    int month = 04;
    int year = 2021;
    By creditCardMonthXpath = By.xpath("//android.widget.CheckedTextView[@text='04']");
    By creditCardYearXpath = By.xpath("//android.widget.CheckedTextView[@text='2021']");






}
