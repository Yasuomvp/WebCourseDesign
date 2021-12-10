package com.nefu.webcoursedesign.service;

import com.nefu.webcoursedesign.entity.Card;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService {

    List<Card> getAllCards() throws Exception;

    Card getCardById(String id) throws Exception;

}
