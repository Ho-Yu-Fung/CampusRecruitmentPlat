package com.ho.result;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ResultApi<T> {

    private String code;

    private String msg;

    private T data;

    private ResultApi(ResultCode resultCode,T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
    private ResultApi(T data){
        this.data = data;
    }

    public static <T> ResultApi<T> success(T data){
        return new ResultApi<T>(data)
                .setCode(ResultCode.SUCCESS.getCode())
                .setMsg(ResultCode.SUCCESS.getMsg());
    }

    public static ResultApi success(String msg){
        return new ResultApi().setCode(ResultCode.SUCCESS.getCode())
                .setMsg(msg);
    }

    public static <T> ResultApi<T> error(T data){
        return new ResultApi<T>(data)
                .setCode(ResultCode.SUCCESS.getCode())
                .setMsg(ResultCode.SUCCESS.getMsg());
    }

    public static ResultApi error(String msg){
        return new ResultApi().setCode(ResultCode.FAILED.getCode())
                .setMsg(msg);
    }

    public static ResultApi unauthorized(){
        return new ResultApi()
                .setCode(ResultCode.UNAUTHORIZATED.getCode())
                .setMsg(ResultCode.UNAUTHORIZATED.getMsg());
    }

    public static ResultApi unauthenticated(){
        return new ResultApi()
                .setCode(ResultCode.UNAUTHENTICATED.getCode())
                .setMsg(ResultCode.UNAUTHENTICATED.getMsg());
    }
}
