package com.cakeshop.pricing;

public class NormalPrice implements PricePolicy {
    //オーバーライドでPricePolicyを変更する。
    @Override
    public int calculate(int basePrice) {
        return basePrice;
    }
}