package com.nefu.webcoursedesign.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;


@Data
@Component
@TableName(value = "t_card")
public class Card {
    private String id;
    private String title;
    private String text;
    private String pic;
    private Timestamp timestamp;


}
