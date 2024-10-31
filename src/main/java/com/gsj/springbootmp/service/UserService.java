package com.gsj.springbootmp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsj.springbootmp.entity.User;

import java.util.Map;

public interface UserService extends IService<User> {

    Map<String, Object> login(User user);
}
