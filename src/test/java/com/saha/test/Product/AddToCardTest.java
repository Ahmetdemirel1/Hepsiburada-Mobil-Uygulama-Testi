package com.saha.test.Product;

import com.saha.test.base.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddToCardTest extends BaseTest {

    @Test
    public void addToCard() {
        new AddToCard(driver).addToCard();
    }
}