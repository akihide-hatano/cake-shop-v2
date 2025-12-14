package com.cakeshop;

import com.cakeshop.pricing.NormalPrice;
import com.cakeshop.pricing.PricePolicy;
import com.cakeshop.product.BakedSweet;
import com.cakeshop.product.Cake;
import com.cakeshop.shop.CakeShop;

public class App {
    public static void main(String[] args) {
        PricePolicy normal = new NormalPrice();

        CakeShop shop = new CakeShop("Cake Shin", "新宿区");

        // ---- 生ケーキ 10 ----
        shop.add(new Cake("ショートケーキ", "苺と生クリームの王道。", 500, normal));
        shop.add(new Cake("チョコレートケーキ", "濃厚カカオでビター甘。", 550, normal));
        shop.add(new Cake("モンブラン", "和栗ペーストで香り強め。", 620, normal));
        shop.add(new Cake("チーズケーキ", "ベイクド。酸味控えめ。", 580, normal));
        shop.add(new Cake("フルーツタルト", "季節フルーツ盛り。", 600, normal));
        shop.add(new Cake("ティラミス", "エスプレッソ香る大人味。", 560, normal));
        shop.add(new Cake("抹茶ケーキ", "宇治抹茶のほろ苦。", 540, normal));
        shop.add(new Cake("オペラ", "層が多い。コーヒー×チョコ。", 650, normal));
        shop.add(new Cake("ミルクレープ", "薄焼きクレープ重ね。", 590, normal));
        shop.add(new Cake("シフォンケーキ", "ふわふわ軽い口当たり。", 520, normal));

        // ---- 焼き菓子 10 ----
        shop.add(new BakedSweet("フィナンシェ", "焦がしバター香る定番。", 260, normal));
        shop.add(new BakedSweet("マドレーヌ", "しっとりレモン風味。", 240, normal));
        shop.add(new BakedSweet("カヌレ", "外カリ中もち。ラム香る。", 320, normal));
        shop.add(new BakedSweet("サブレ", "バター強めのサクサク。", 200, normal));
        shop.add(new BakedSweet("パウンドケーキ", "紅茶の茶葉入り。", 380, normal));
        shop.add(new BakedSweet("クッキー（チョコ）", "チョコチップごろごろ。", 220, normal));
        shop.add(new BakedSweet("クッキー（抹茶）", "抹茶の苦みが良い。", 220, normal));
        shop.add(new BakedSweet("ブラウニー", "ねっとり濃厚系。", 360, normal));
        shop.add(new BakedSweet("スコーン", "クロテッド推奨。", 300, normal));
        shop.add(new BakedSweet("ビスコッティ", "硬め。コーヒーに合う。", 280, normal));

        shop.printMenu();
    }
}