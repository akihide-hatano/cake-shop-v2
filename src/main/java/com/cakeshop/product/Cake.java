package com.cakeshop.product;

import com.cakeshop.pricing.PricePolicy;

public class Cake extends Product{
    public Cake(String name,String description,int basePrice,PricePolicy pricePolicy){
        super(name, description, basePrice, pricePolicy);
    }

    @Override
    public String getCategory(){
        return "生ケーキ";
    }

    @Override
    public String label(){
        return super.label()+"(用冷蔵)";
    }
}