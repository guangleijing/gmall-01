package com.pattek.user.service.impl;

import com.pattek.entity.UserInfo;
import com.pattek.service.UserService;
import com.pattek.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

;
;

@org.apache.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserList() {
        UserInfo ue = new UserInfo();
        ue.setId(1);
        ue.setName("admin");
        ue.setPassword("123456");
        return ue;
    }


    public List<UserInfo> getAllUsers() {
        // return userMapper.selectAllUser();
        return userInfoMapper.selectAll();
    }

}
