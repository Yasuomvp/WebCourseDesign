package com.nefu.webcoursedesign;

import com.nefu.webcoursedesign.entity.Card;
import com.nefu.webcoursedesign.mapper.CardMapper;
import com.nefu.webcoursedesign.service.CardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebCourseDesignApplicationTests {

    @Autowired
    private CardService cardService;

    @Autowired
    private CardMapper cardMapper;

    @Test
    void contextLoads() throws Exception {

        Card card = new Card();
        card.setId("9");
        card.setTitle("AAAAAAAAAAAAAAAAAAA");
        cardMapper.updateById(card);

    }

}
