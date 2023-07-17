package com.example.HWOnlineStore.controller;

import com.example.HWOnlineStore.model.Good;
import com.example.HWOnlineStore.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping
    public List<Good> getAllGoods() {
        return goodsService.getAllGoods();
    }

    @GetMapping("/{id}")
    public Good getGoodsById(@PathVariable(name = "id") int id) {
        return goodsService.getGoodsById(id);
    }

    @PostMapping
    public Good newGoods(@RequestBody Good good) {
        return goodsService.newGoods(good);
    }
}
