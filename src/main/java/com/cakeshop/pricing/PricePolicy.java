package com.cakeshop.pricing;

//約束事の定義
public interface PricePolicy {
    int calculate(int basePrice);
}