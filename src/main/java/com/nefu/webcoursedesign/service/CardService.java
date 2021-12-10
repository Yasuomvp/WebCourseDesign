package com.nefu.webcoursedesign.service;

import com.nefu.webcoursedesign.entity.Card;
import org.springframework.stereotype.Service;

import java.security.spec.ECGenParameterSpec;
import java.util.List;

@Service
public interface CardService {

    List<Card> getAllCards() throws Exception;

    List<Card> get6Cards() throws Exception;

    Card getCardById(String id) throws Exception;

    void cardInsert(Card card) throws Exception;

    void cardDelete(String id) throws Exception;

    void cardEdit(Card card) throws Exception;

}
