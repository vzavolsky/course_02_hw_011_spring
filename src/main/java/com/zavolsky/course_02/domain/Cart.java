package com.zavolsky.course_02.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static int cartIDInc = 0;
    private int cartID = ++cartIDInc;

    private List<Integer> listOfGoods;

    public Cart() {
        this.listOfGoods = new ArrayList<>();
    }

    public int getCartID() {
        return cartID;
    }

    public List<Integer> getListOfGoods() {
        return listOfGoods;
    }

    public void setListOfGoods(int goodsID) {
        this.listOfGoods.add(goodsID);
    }
}
