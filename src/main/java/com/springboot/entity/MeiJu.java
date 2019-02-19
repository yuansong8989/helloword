package com.springboot.entity;

import lombok.Getter;

/**
 * Created by yzd on 2019/1/30.
 */
@Getter
public enum MeiJu {
    SUCCESS(200, "操作成功"),

    FAIL_PARAM_ERROR(0, "参数错误!"),
    operation_error(-1, "操作失败!"),
    DuplicateKeyException(-2, "该记录已存在!"),
    Invalid_token(-3, "token无效!"),
    JWT_expired(-3, "token已过期!"),
    login_password_error(-1000, "密码错误!"),
    edit_password_different_error(-1001, "两次新密码输入不一致!"),
    ;


    private int code;
    private String msg;

    MeiJu(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
