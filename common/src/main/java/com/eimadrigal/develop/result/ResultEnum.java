package com.eimadrigal.develop.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {

    SUCCESS(0, "Success"),
    ERROR(-1, "Internal server error"),

    // 1xx server error
    BAD_SQL_GRAMMAR_ERROR(101, "Bad SQL grammar"),
    SERVLET_ERROR(102, "Servlet request error"),

    // 2xx param validation
    BORROW_AMOUNT_ERROR(201, "Borrow amount cannot be negative"),
    ;

    private final Integer code;

    private final String message;
}
