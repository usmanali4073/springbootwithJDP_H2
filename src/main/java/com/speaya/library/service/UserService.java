package com.speaya.library.service;

import com.speaya.library.entity.User;
import com.speaya.library.repository.IUserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepositoy _userReposito;

    public User AddUser(User user){
      return   _userReposito.save(user);
    }
    public List<User> getAllUser(){
        return this._userReposito.findAll();
    }
}
