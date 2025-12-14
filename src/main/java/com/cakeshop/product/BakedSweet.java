package com.cakeshop.product;

import com.cakeshop.pricing.PricePolicy;

public class BakedSweet extends Product {

    public BakedSweet(String name, String description, int basePrice, PricePolicy pricePolicy) {
        super(name, description, basePrice, pricePolicy);
    }

    @Override
    public String getCategory() {
        return "焼き菓子";
    }

    @Override
    public String label() {
        return super.label() + "（常温OK）";
    }
}