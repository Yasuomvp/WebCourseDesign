package com.nefu.webcoursedesign.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;


@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_card")
public class Card {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    private String title;
    private String text;
    private String pic;
    private Timestamp timestamp;

}
