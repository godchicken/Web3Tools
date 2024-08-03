package com.godchicken.web3.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.godchicken.web3.user.entity.User;
import com.godchicken.web3.user.data.SignInData;
import com.godchicken.web3.user.data.SignUpData;
import com.godchicken.web3.user.view.SignInView;

public interface UserService extends IService<User> {
    SignInView signIn(SignInData data);
    void signUp(SignUpData data);
}
