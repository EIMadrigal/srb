package com.eimadrigal.develop.exception;

import com.eimadrigal.develop.result.Result;
import com.eimadrigal.develop.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error();
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public Result handleException(BadSqlGrammarException e) {
        log.error(e.getMessage(), e);
        return Result.error(ResultEnum.BAD_SQL_GRAMMAR_ERROR);
    }

    @ExceptionHandler(value = SrbException.class)
    public Result handleException(SrbException e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getCode(), e.getMessage());
    }
}
