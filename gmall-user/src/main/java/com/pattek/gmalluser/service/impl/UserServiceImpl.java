package com.pattek.gmalluser.service.impl;

import com.pattek.entity.UserInfo;
import com.pattek.gmalluser.mapper.UserInfoMapper;
import com.pattek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    ;
}
