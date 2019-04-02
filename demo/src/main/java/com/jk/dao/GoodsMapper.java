package com.jk.dao;

import com.jk.model.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsMapper {

    List<Goods> queryall(Goods goods);

    @Insert("INSERT INTO t_goods(goodsname,goodsprice,goodsdate,goodsimg,attentionnumber) VALUES(#{goodsname}, #{goodsprice}, #{goodsdate}, #{goodsimg}, #{attentionnumber})")
    void addgoods(Goods goods);

    @Update("update t_goods set goodsname=#{goodsname},goodsimg=#{goodsimg},goodsprice=#{goodsprice},goodsdate=#{goodsdate},attentionnumber=#{attentionnumber} where goodsid=#{goodsid}")
    void update(Goods goods);

    @Select("select * from t_goods where goodsid = #{goodsid}")
    Goods querybyid(Integer goodsid);

    @Delete("delete from t_goods where goodsid = #{id}")
    void delbyid(Integer id);
}
