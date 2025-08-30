package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final Integer discountPercent;
    private final boolean expedited;
    private final String notes;
    
    private Order(Builder b) {
        this.id = b.id;
        this.customerEmail = b.email;
        this.discountPercent = b.discount;
        this.expedited = b.expedited;
        this.notes = b.notes;

        List<OrderLine> copy = new ArrayList<>(b.lines.size());
        for (OrderLine l : b.lines)
            copy.add(new OrderLine(l.getSku(), l.getQuantity(), l.getUnitPriceCents()));
        this.lines = Collections.unmodifiableList(copy);
    }
    public static class Builder {
        private final String id;
        private final String email;
        private final List<OrderLine> lines = new ArrayList<>();
        private Integer discount;
        private boolean expedited;
        private String notes;

        public Builder(String id, String email) { this.id = id; this.email = email; }

        public Builder addLine(OrderLine l) { if (l != null) lines.add(l); return this; }
        public Builder addLines(List<OrderLine> ls) { if (ls != null) lines.addAll(ls); return this; }
        public Builder discount(Integer discount) { this.discount = discount; return this; }
        public Builder expedited(boolean expedited) { this.expedited = expedited; return this; }
        public Builder notes(String notes) { this.notes = notes; return this; }

        public Order build() {
            if (id == null || id.isBlank()) throw new IllegalStateException("id must not be blank");
            if (!PricingRules.isValidEmail(email)) throw new IllegalStateException("invalid email");
            if (!PricingRules.isValidDiscount(discount)) throw new IllegalStateException("discount must be 0..100");
            if (lines.isEmpty()) throw new IllegalStateException("order must have at least one line");
            return new Order(this);
        }
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; }
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }
}
