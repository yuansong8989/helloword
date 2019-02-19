package com.springboot.entity;

/**
 * Created by yzd on 2019/1/30.
 */
public class ResultUt {
    public static <T> ResultModel success(T t) {
        ResultModel resultModel = new ResultModel(MeiJu.SUCCESS);
        resultModel.setData(t);
        resultModel.setResult(true);
        return resultModel;
    }
    public static ResultModel error(MeiJu meiJu){
        return new ResultModel(meiJu);
    }
}
