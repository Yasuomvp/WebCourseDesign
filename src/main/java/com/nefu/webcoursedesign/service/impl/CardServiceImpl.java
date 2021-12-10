package com.nefu.webcoursedesign.service.impl;

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
    public Card getCardById(String id) throws Exception {
        return cardMapper.selectById(id);
    }
}
