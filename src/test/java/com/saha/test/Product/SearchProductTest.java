package com.saha.test.Product;

import com.saha.test.base.BaseTest;
import org.junit.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public void search() {

        new SearchProduct(driver).search();
        new OrderComplete(driver).orderComplete();

    }
}