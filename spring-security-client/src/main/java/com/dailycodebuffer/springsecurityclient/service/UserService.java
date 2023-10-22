package com.dailycodebuffer.springsecurityclient.service;

import com.dailycodebuffer.springsecurityclient.entity.User;
import com.dailycodebuffer.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
