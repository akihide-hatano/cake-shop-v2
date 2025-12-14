package com.cakeshop.shop;

import com.cakeshop.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CakeShop {
    private final String shopName;
    private final String ward;//新宿区
    private final List<Product> products = new ArrayList<>();

    public CakeShop(String shopName,String ward){
        this.shopName = shopName;
        this.ward = ward;
    }

    public void add(Product product){
        products.add(product);
    }

    public List<Product>geProducts(){
        return Collections.unmodifiableList(products);
    }

    public void printMenu(){
        System.out.println();
        for(Product p : products){
            System.out.println(p.label());
            System.out.println("  説明: " + p.getDescription());
        }
    }
}