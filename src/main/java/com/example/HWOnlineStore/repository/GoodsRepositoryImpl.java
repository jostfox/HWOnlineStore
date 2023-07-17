package com.example.HWOnlineStore.repository;

import com.example.HWOnlineStore.model.Good;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GoodsRepositoryImpl implements GoodsRepository {

    private Map<Integer, Good> goodsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        goodsMap.put(1, new Good(1, "Laptop Lenovo", 658.23, 5));
        goodsMap.put(2, new Good(2, "RAM Memory 16", 124.15, 10));
        goodsMap.put(3, new Good(3, "Processor AMD Ryzen 5", 321.23, 3));
        goodsMap.put(4, new Good(4, "Cooler", 58.46, 5));
    }

    @Override
    public List<Good> getAllGoods() {
        return new ArrayList<>(goodsMap.values());
    }

    @Override
    public Good getGoodsById(int id) {
        return goodsMap.get(id);
    }

    @Override
    public Good newGoods(Good good) {
        int lastId = goodsMap.keySet().stream().mapToInt(s -> s).max().getAsInt();
        good.setGoodsId(lastId + 1);
        goodsMap.put(good.getGoodsId(), good);
        return good;
    }

    public Map<Integer, Good> getGoodsMap() {
        return goodsMap;
    }

    @Override
    public String toString() {
        return "GoodsRepositoryImpl{" +
                "goodsMap=" + goodsMap +
                '}';
    }
}
