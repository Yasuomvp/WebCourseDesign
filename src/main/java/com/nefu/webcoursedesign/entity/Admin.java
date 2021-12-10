package com.nefu.webcoursedesign.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin")
public class Admin {
    private String id;
    private String username;
    private String password;
}
