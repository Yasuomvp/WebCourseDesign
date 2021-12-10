package com.nefu.webcoursedesign.controller;


import com.nefu.webcoursedesign.entity.Card;
import com.nefu.webcoursedesign.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

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
}
