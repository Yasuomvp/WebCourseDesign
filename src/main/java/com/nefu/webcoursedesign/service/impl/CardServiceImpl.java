package com.nefu.webcoursedesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nefu.webcoursedesign.entity.Card;
import com.nefu.webcoursedesign.mapper.CardMapper;
import com.nefu.webcoursedesign.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;

    @Override
    public List<Card> getAllCards() throws Exception {
        return cardMapper.selectList(null);
    }

    @Override
    public List<Card> get6Cards() throws Exception {

        QueryWrapper<Card> cardQueryWrapper = new QueryWrapper<>();
        cardQueryWrapper.last("limit 6");
        return cardMapper.selectList(cardQueryWrapper);
    }


    @Override
    public Card getCardById(String id) throws Exception {
        return cardMapper.selectById(id);
    }

    @Override
    public void cardInsert(Card card) throws Exception {
        cardMapper.insert(card);
    }

    @Override
    public void cardDelete(String id) throws Exception {
        cardMapper.deleteById(id);
    }

    @Override
    public void cardEdit(Card card) throws Exception {
        cardMapper.updateById(card);
    }


}
