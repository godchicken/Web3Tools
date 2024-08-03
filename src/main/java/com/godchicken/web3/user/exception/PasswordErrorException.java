package com.godchicken.web3.user.exception;

import com.godchicken.web3.base.exception.ServiceException;

public class PasswordErrorException extends ServiceException {
    public PasswordErrorException() {
        super(10400, "密码错误");
    }
}