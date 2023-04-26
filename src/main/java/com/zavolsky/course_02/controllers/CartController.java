package com.zavolsky.course_02.controllers;

import com.zavolsky.course_02.services.CartImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("session")
public class CartController {
    private final CartImpl cartImpl;

    CartController(CartImpl cartImpl) {
        this.cartImpl = cartImpl;
    }

    @GetMapping
    public String greetings() {
        return "hi";
    }

    @GetMapping(path = "/store/order/add")
    public String[] addGoods(@RequestParam("goods") String goods) {
        return cartImpl.addGoods(goods);
    }

    @GetMapping(path = "/store/order/get")
    public List<Integer> getGoods() {
        return cartImpl.getGoods();
    }

    @GetMapping(path = "/store/order/getCartID")
    public Integer getCartID() {
        return cartImpl.getCartID();
    }
}
