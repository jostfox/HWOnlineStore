package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.model.Good;

import java.util.List;

public interface GoodsService {

    List<Good> getAllGoods();

    Good getGoodsById(int id);

    Good newGoods(Good good);
}
