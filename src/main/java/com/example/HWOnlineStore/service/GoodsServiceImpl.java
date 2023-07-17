package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.exceptions.EmptyListException;
import com.example.HWOnlineStore.exceptions.MissingArgumentException;
import com.example.HWOnlineStore.exceptions.NoSuchIdException;
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
        List<Good> goodList = goodsRepository.getAllGoods();
        if (goodList.isEmpty()) {
            throw new EmptyListException("Empty Goods List Exception");
        }
        return goodList;
    }

    @Override
    public Good getGoodsById(int id) {
        Good good = goodsRepository.getGoodsById(id);
        if (id < 1 || good == null) {
            throw new NoSuchIdException("No such ID Exception");
        }
        return goodsRepository.getGoodsById(id);
    }

    @Override
    public Good newGoods(Good good) {
        if (good.getGoodsName() == null) {
            throw new MissingArgumentException("Missing argument Exception");
        }
        return goodsRepository.newGoods(good);
    }
}
