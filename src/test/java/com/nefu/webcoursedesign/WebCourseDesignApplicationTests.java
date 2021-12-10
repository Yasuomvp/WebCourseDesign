package com.nefu.webcoursedesign;

import com.nefu.webcoursedesign.service.CardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebCourseDesignApplicationTests {

    @Autowired
    private CardService cardService;

    @Test
    void contextLoads() throws Exception {

        System.out.println(cardService.getAllCards());


    }

}
