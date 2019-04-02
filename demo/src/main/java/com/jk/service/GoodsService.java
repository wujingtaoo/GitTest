package com.jk.service;

import com.jk.model.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryall(Goods goods);

    void addgoods(Goods goods);

    void update(Goods goods);

    Goods querybyid(Integer goodsid);

    void delbyid(Integer id);
}
