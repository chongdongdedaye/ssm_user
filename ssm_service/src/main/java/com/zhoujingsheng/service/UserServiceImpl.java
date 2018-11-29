package com.zhoujingsheng.service;

import com.zhoujingsheng.dao.UserDao;
import com.zhoujingsheng.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
