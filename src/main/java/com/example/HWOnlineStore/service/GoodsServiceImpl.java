package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.model.Good;
import com.example.HWOnlineStore.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public List<Good> getAllGoods() {
       return goodsRepository.getAllGoods();
    }

    @Override
    public Good getGoodsById(int id) {
        return goodsRepository.getGoodsById(id);
    }

    @Override
    public Good newGoods(Good good) {
        return goodsRepository.newGoods(good);
    }
}
