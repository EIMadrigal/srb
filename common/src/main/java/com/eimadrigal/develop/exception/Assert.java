package com.eimadrigal.develop.exception;

import com.eimadrigal.develop.result.ResultEnum;

public class Assert {

    public static void notNull(Object object, ResultEnum resultEnum) {
        if (object == null) {
            throw new SrbException(resultEnum);
        }
    }
}
