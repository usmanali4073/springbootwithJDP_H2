package com.speaya.library.service;

import com.speaya.library.entity.User;
import com.speaya.library.repository.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepositoy _userReposito;

    public long insert(User user) {
        return this._userReposito.insert(user);
    }
}
