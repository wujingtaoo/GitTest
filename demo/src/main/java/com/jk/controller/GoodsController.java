package com.jk.controller;

import com.jk.model.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService  goodsService;

    @RequestMapping("queryall")
    public String queryall(Model model,Goods goods){
        List<Goods> goodslist =  goodsService.queryall(goods);
        model.addAttribute("goods",goodslist);
        return "index";
    }

    @RequestMapping("/toadd")
    public  String  toadd(){
        return "addgoods";
    }

    @RequestMapping("/addgoods")
    @ResponseBody
    public  void  addgoods(Goods goods){
        goodsService.addgoods(goods);
    }

    @RequestMapping("/update")
    @ResponseBody
    public  void  update(Goods goods){
        goodsService.update(goods);
    }

    @RequestMapping("/querybyid")
    public  String  querybyid(Goods goods,Model model){
        Goods goods2 = goodsService.querybyid(goods.getGoodsid());
        model.addAttribute("shop",goods2);
        return "updategoods";
    }

    @RequestMapping("/delbyid")
    @ResponseBody
    public void delbyid(Integer id){
        goodsService.delbyid(id);
    }



}
