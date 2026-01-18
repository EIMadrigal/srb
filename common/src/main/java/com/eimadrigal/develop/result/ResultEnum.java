package com.eimadrigal.develop.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {

    SUCCESS(0, "Success"),
    ERROR(-1, "Internal server error");

    private final Integer code;

    private final String message;
}
