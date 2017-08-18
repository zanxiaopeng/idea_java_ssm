package com.rsx.api.service.impl;

import com.rsx.api.dao.IUserDao;
import com.rsx.api.pojo.User;
import com.rsx.api.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User selectUser(Integer userId) {

        return this.userDao.selectByPrimaryKey(userId);

    }

}
