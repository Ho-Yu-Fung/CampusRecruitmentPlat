package com.ho.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultCode {

    SUCCESS("200","操作成功"),

    FAILED("400","操作失败"),

    UNAUTHENTICATED("403","未认证"),

    UNAUTHORIZATED("401","未授权");

    private String code;

    private String msg;


}
