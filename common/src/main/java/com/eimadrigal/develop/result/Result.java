package com.eimadrigal.develop.result;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    private Result() {

    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    public static <T> Result<T> ok() {
        return ok(null);
    }

    public static <T> Result<T> error(ResultEnum resultEnum) {
        Result<T> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;
    }

    public static <T> Result<T> error() {
        return error(ResultEnum.ERROR);
    }

    public static <T> Result<T> error(Integer code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
