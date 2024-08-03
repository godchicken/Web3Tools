package com.godchicken.web3.auth.exception;

import com.godchicken.web3.base.exception.ServiceException;

/**
 * 未认证异常
 *
 * @author Li Jinhui
 * @since 2018/12/7
 */
public class UnauthorizedException extends ServiceException {
    public UnauthorizedException() {
        super("Unauthorized", 401);
    }
}
