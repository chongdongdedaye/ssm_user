package com.zhoujingsheng.dao;

import com.zhoujingsheng.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 查找单个用户
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 查找所有用户
     */
    List<User> findAll();

    /**
     * 修改某个用户信息
     * @param user
     */
    void updateUser(User user);
}
