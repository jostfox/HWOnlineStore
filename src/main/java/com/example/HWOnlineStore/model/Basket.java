package com.example.HWOnlineStore.model;

public class Basket {
    private int goodsId;
    private String goodsName;
    private int quantity;
    private double cost;

    public Basket() {
    }

    public Basket(int goodsId, int quantity) {
        this.goodsId = goodsId;
        this.quantity = quantity;
    }

    public Basket(int goodsId, String goodsName, int quantity, double cost) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.quantity = quantity;
        this.cost = cost;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Basket{" +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
