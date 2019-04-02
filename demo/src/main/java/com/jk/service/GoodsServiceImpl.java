package com.jk.service;

import com.jk.dao.GoodsMapper;
import com.jk.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper  goodsMapper;

    @Override
    public List<Goods> queryall(Goods goods) {
        return goodsMapper.queryall(goods);
    }

    @Override
    public void addgoods(Goods goods) {
        goodsMapper.addgoods(goods);
    }

    public  void update(Goods goods){
        goodsMapper.update(goods);
    }


    @Override
    public Goods querybyid(Integer goodsid) {
        return goodsMapper.querybyid(goodsid);
    }

    @Override
    public void delbyid(Integer id) {
        goodsMapper.delbyid(id);
    }
}
