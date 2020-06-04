package com.macc.base.api.model;

import com.macc.base.api.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author MCC
 * @Date 2020/6/3 16:54
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> implements Serializable {

    private boolean success;
    private String message;
    private String code;
    private T data;


    public static <T> Response<T> success() {
        Response<T> response = success("ok", null);
        return response;
    }

    public static <T> Response<T> success(T data) {
        Response<T> response = success(null, data);
        return response;
    }

    public static <T> Response<T> success(String message, T data) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setCode(ResultEnum.SUCCESS.getCode());
        response.setData(data);
        response.setMessage(message);
        return response;
    }

}
