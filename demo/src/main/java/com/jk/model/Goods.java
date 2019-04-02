package com.jk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{

    private  Integer  goodsid;
    private  String   goodsname;
    private  Integer  goodsprice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date     goodsdate;
    private  String   goodsimg;
    private  Integer  attentionnumber;

    private  String  goodsdatemin;
    private  String  goodsdatemax;

    public String getGoodsdatemin() {
        return goodsdatemin;
    }

    public void setGoodsdatemin(String goodsdatemin) {
        this.goodsdatemin = goodsdatemin;
    }

    public String getGoodsdatemax() {
        return goodsdatemax;
    }

    public void setGoodsdatemax(String goodsdatemax) {
        this.goodsdatemax = goodsdatemax;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Date getGoodsdate() {
        return goodsdate;
    }

    public void setGoodsdate(Date goodsdate) {
        this.goodsdate = goodsdate;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public Integer getAttentionnumber() {
        return attentionnumber;
    }

    public void setAttentionnumber(Integer attentionnumber) {
        this.attentionnumber = attentionnumber;
    }
}
