package com.springboot.entity;

import lombok.Data;

/**
 * Created by yzd on 2019/1/30.
 */
@Data
public class ResultModel<T> {
    private String massage;
    private T data;
    private boolean result;
    private  int code;
public ResultModel(MeiJu meiJu){
    this.code=meiJu.getCode();
    this.massage=meiJu.getMsg();

    }

}
