package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order.Builder b = new Order.Builder(id, email).discount(discount).expedited(expedited).notes(notes);
        if (lines != null) b.addLines(lines);
        return b.build();
    }
}
