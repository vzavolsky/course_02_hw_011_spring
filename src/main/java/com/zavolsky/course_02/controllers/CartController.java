package com.zavolsky.course_02.controllers;

import com.zavolsky.course_02.services.CartImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartImpl cartImpl;

    CartController(CartImpl cartImpl) {
        this.cartImpl = cartImpl;
    }

    @GetMapping
    public String greetings() {
        return "hi";
    }

    @GetMapping(path = "/add")
    public List<Integer> addGoods(@RequestParam("goods") List<Integer> goods) {
        return cartImpl.addGoods(goods);
    }

    @GetMapping(path = "/get")
    public List<Integer> getGoods() {
        return cartImpl.getGoods();
    }

    @GetMapping(path = "/getCartID")
    public Integer getCartID() {
        return cartImpl.getCartID();
    }
}
