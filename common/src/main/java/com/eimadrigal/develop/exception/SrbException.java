package com.eimadrigal.develop.exception;

import com.eimadrigal.develop.result.ResultEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SrbException extends RuntimeException {

    private Integer code;

    private String message;

    public SrbException(String message) {
        this.message = message;
    }

    public SrbException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public SrbException(Integer code, String message, Throwable cause) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public SrbException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public SrbException(ResultEnum resultEnum, Throwable cause) {
        super(cause);
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }
}
