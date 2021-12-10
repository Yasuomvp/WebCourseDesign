package com.nefu.webcoursedesign.entity;

import lombok.Data;

@Data
public class Result {
    private boolean flag;
    private String message;
    private Object data;

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
