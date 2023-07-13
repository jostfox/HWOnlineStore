package com.example.HWOnlineStore.model;

public class Good {

    private int goodsId;
    private String goodsName;
    private double price;
    private int quantity;


    public Good(int goodsId, String goodsName, double price, int quantity) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
    }

    public Good() {
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
