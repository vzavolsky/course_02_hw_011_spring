package com.zavolsky.course_02;

import java.util.List;

public interface CartService {
    String[] addGoods(String goods);
    List<Integer> getGoods();
    Integer getCartID();
}
