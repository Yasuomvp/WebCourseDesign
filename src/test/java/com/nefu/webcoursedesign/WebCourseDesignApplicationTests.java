package com.nefu.webcoursedesign;

import com.nefu.webcoursedesign.entity.Card;
import com.nefu.webcoursedesign.mapper.CardMapper;
import com.nefu.webcoursedesign.service.CardService;
import com.nefu.webcoursedesign.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebCourseDesignApplicationTests {

    @Autowired
    private CardService cardService;

    @Autowired
    private CardMapper cardMapper;

    @Autowired
    private RoleService roleService;

    @Test
    void contextLoads() throws Exception {

        System.out.println(roleService.getAllRolesByAdminId("1"));

    }

}
