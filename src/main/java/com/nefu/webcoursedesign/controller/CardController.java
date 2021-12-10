package com.nefu.webcoursedesign.controller;


import com.nefu.webcoursedesign.entity.Card;
import com.nefu.webcoursedesign.entity.Result;
import com.nefu.webcoursedesign.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @CrossOrigin
    @RequestMapping("/get6")
    @ResponseBody
    public List<Card> get6Cards(){
        try {
            return cardService.get6Cards();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @CrossOrigin
    @RequestMapping("/getall")
    @ResponseBody
    public List<Card> getAllCards(){
        try {
            return cardService.getAllCards();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @CrossOrigin
    @PostMapping("/edit")
    @ResponseBody
    public Result cardEdit(@RequestBody Card card){

        if (Integer.parseInt(card.getId())<=6) return new Result(false,"不许更改前6条！",null);

        try {
            cardService.cardEdit(card);
            return new Result(true,"编辑成功，牛B",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(true,"编辑失败，咋回事？？",null);
    }

    @CrossOrigin
    @GetMapping("/delete/{id}")
    @ResponseBody
    public Result cardDelete(@PathVariable("id") String id){
        if (Integer.parseInt(id)<=6) return new Result(false,"不许删除前6条！否则项目会坏掉的！！！",null);

        try {
            cardService.cardDelete(id);
            return new Result(true,"删除成功，牛B",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(true,"删除失败，你是不是干坏事了？？",null);
    }

    @RequestMapping("/getById/{id}")
    @ResponseBody
    public Card getById(@PathVariable("id") String id){
        try {
            return cardService.getCardById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @CrossOrigin
    @PostMapping("/add")
    public Result cardAdd(@RequestBody Card card){
        try {
            cardService.cardInsert(card);
            return new Result(true,"插入成功，牛B",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"插入失败，这啥啊这是？刚才还好使呢",null);
    }
}
