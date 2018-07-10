package com.saha.test.util;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePageUtil {

    protected AndroidDriver<MobileElement> driver;

    public BasePageUtil(AndroidDriver<MobileElement> driver) {

        this.driver = driver;
    }


    public void closeFirstLogin(By loginId){
        driver.findElement(loginId).click();
    }

    public void closeWidget(By widgetXpath){
        driver.findElement(widgetXpath).click();
    }

    public void clickAccountImage(By accountImageId){
        driver.findElement(accountImageId).click();

    }

    public void goToLoginPage(By loginPageXpath ){
        driver.findElement(loginPageXpath).click();
    }

    public void emailClickandSendKey(By emailId, String email){
        driver.findElement(emailId).click();
        driver.findElement(emailId).sendKeys(email);

    }

    public void passwordClickandSendKey(By passId, String pass){
        driver.findElement(passId).click();
        driver.findElement(passId).sendKeys(pass);

    }
    public void clickLoginbutton(By loginButtonId){
        driver.findElement(loginButtonId).click();
    }

    public void googleSavePassword(By autoFillId){
        driver.findElement(autoFillId).click();
    }

    public void welcomeButtonClose(By welcomeButtonId){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(welcomeButtonId)).click();

    }

    public String getAccountUsername(By accountUsernameId){
         String Username = driver.findElement(accountUsernameId).getText();
        return Username;
    }

    public void closeAccountBar(By accountBarId){
        driver.findElement(accountBarId).click();
    }

    public void homeSearchClick(By searchAreaId){
        driver.findElement(searchAreaId).click();

    }
    public void searchBoxClickAndSendKey(By searchBoxId, String Key){
        driver.findElement(searchBoxId).click();
        driver.findElement(searchBoxId).sendKeys(Key);
    }

    public void clickSearchProduct(By productXpath){ // Arama ekranına gelen ürünlerden birisine tıklama
        driver.findElement(productXpath).click();
    }

    public void clickAfterSearchProduct(By productXpathAfterSearch){
        driver.findElement(productXpathAfterSearch).click();
    }

    public void swipeDown(){
        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.height;
        int width = dimension.width;
        int swipeStartWidth = (width * 50) / 100;
        int swipeEndWidth = (width * 50) / 100;
        int swipeEndHeight = (height * 1) / 100;
        int swipeStartHeight = (width );


        driver.swipe(swipeStartWidth,swipeStartHeight,swipeStartWidth,10,1000);


    }

    public void clickProduct(By productXpath){

        driver.findElement(productXpath).click();
    }

    public void chooseProduct(By homeProductGroupXpath, int index){
        List<MobileElement> productGroup = driver.findElements(homeProductGroupXpath);
        productGroup.get(index).click();
    }


    public void productAddToCard(By productAddToCard){

        driver.findElement(productAddToCard).click();
    }


    public String getProductPrice(By productPrice){
        String price = driver.findElement(productPrice).getText();
        return price;
    }

    public void paymentOptions(By paymentOptionsXpath){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentOptionsXpath)).click();

        //driver.findElement(paymentOptionsXpath).click();
    }

    public void creditCardNo(By creditCardXpath, String cardNo){

        List<MobileElement> productGroup = driver.findElements(creditCardXpath);
        productGroup.get(0).click();
        productGroup.get(0).sendKeys(cardNo);

    }

    public void creditCardName(By creditCardXpath, String cardName){
        List<MobileElement> productGroup = driver.findElements(creditCardXpath);
        productGroup.get(1).click();
        productGroup.get(1).sendKeys(cardName);
    }
    public void creditCardMonth(By creditCardDateClickXpath,By creditCardMonthXpath){
        List<MobileElement> productGroup = driver.findElements(creditCardDateClickXpath);
        productGroup.get(0).click();
        driver.findElement(creditCardMonthXpath).click();

    }
    public void creditCardYear(By creditCardDateClickXpath,By creditCardYearXpath){
        List<MobileElement> productGroup = driver.findElements(creditCardDateClickXpath);
        productGroup.get(1).click();
        driver.findElement(creditCardYearXpath).click();
    }

    public void creditCardCvv(By creditCardXpath, String cvv){
        List<MobileElement> productGroup = driver.findElements(creditCardXpath);
        productGroup.get(2).click();
        productGroup.get(2).sendKeys(cvv);
    }



    public void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void tapWithCoordinates() {
        //new TouchAction(driver).tap(PointOption.point(100,100)).perform();
        new TouchAction(driver).tap(100,100).perform();

    }


    public void pressEnter(){
            driver.pressKeyCode(AndroidKeyCode.ENTER);
        }

    public void pressSearch(){
        new TouchAction(driver).tap(988,1712).perform();

        //driver.tap(1,988,17127,1);
        //driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);
    }

    public void pressOrderComplete(){
        new TouchAction(driver).tap(528,1717).perform();
        //driver.tap(1,528,1717,1);

    }


}
