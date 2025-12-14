package com.cakeshop.product

import com.cakeshop.pricing.PricePolicy;

public abstract class Product {
    private final String name;
    private final String description;
    private final int basePrice;
    private final PricePolicy pricePolicy;

    protected Product(String name,String description,int basePrice,PricePolicy pricePolicy){
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.pricePolicy = pricePolicy;
    }

    
}