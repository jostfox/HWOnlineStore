package com.example.HWOnlineStore.repository;

import com.example.HWOnlineStore.model.Good;

import java.util.List;

public interface GoodsRepository {

    List<Good> getAllGoods();

    Good getGoodsById(int id);

    Good newGoods(Good good);

}
