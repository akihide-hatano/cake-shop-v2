package com.cakeshop.pricing;

public class NormalPrice implements PricePolicy {
    @Override
    public int calculate(int basePrice) {
        return basePrice;
    }
}