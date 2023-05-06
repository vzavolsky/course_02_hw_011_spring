package com.zavolsky.course_02.services;

import com.zavolsky.course_02.CartService;
import com.zavolsky.course_02.domain.Cart;
import com.zavolsky.course_02.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartImpl implements CartService {

    private final Cart cart;

    public CartImpl(Cart cart) {
        this.cart = cart;
    }

    public String[] addGoods(String goods) {
        if (!goods.matches("^[0-9,]+$")) {
            System.out.println("Error");
            throw new BadRequestException();
        }
        String[] goodsToAdd = goods.split(",");
        System.out.println(goods);
        System.out.println(goodsToAdd.length);
        for (String goodsID: goodsToAdd) {
            cart.setListOfGoods(Integer.parseInt(goodsID));
        }
        return goodsToAdd;
    }

    public List<Integer> addGoods(List<Integer> goods) {
        cart.setListOfGoods(goods);
        return goods;
    }

    public List<Integer> getGoods() {
        return cart.getListOfGoods();
    }

    public Integer getCartID() {
        return cart.getCartID();
    }
}
