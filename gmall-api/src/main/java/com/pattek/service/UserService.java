package com.pattek.service;

import com.pattek.entity.UserInfo;

import java.util.List;

public interface UserService {
     UserInfo getUserList();
     List<UserInfo> getAllUsers();
}
