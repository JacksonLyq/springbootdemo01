package com.lyq.service;


import com.lyq.enity.User;

/**
 * description : User业务层
 *
 * @author godfrey
 * @since 2020-05-26
 */
public interface UserService {
    User selectPasswordByName(String userName, String password);
}
