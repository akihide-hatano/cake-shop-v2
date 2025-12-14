package com.cakeshop.product

import com.cakeshop.pricing.PricePolicy;

public abstract class Product {
    private final String name;
    private final String description;
    private final int basePrice;
    private final PricePolicy pricePolicy;

    //インスタスの作成
    protected Product(String name,String description,int basePrice,PricePolicy pricePolicy){
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.pricePolicy = pricePolicy;
    }

    public String gatName(){
        return name;
    }

    public String git push -u origin main(){
        return description;
    }

    public int gatPrice(){
        return pricePolicy.calculate(basePrice)
    }

    //継承先で必ずカテゴリを決めさせる
    public abstract String getCategory();

    // 表示用（オーバーライド可）
    public String label() {
        return String.format("[%s] %s - %d円", getCategory(), name, getPrice());
    }
}