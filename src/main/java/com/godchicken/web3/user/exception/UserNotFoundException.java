package com.godchicken.web3.user.exception;

import com.godchicken.web3.base.exception.ServiceException;

public class UserNotFoundException extends ServiceException {
    public UserNotFoundException() {
        super(10404, "用户不存在");
    }
}