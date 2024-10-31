package com.gsj.springbootmp.controller;

import com.gsj.springbootmp.common.vo.Result;
import com.gsj.springbootmp.entity.User;
import com.gsj.springbootmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("getUser/{id}")
    public User getUser(@PathVariable String id){
        return userService.getById(id);
    }

    /**
     * 插入学生信息
     * @param User
     */
    @RequestMapping("/insert")
    public void insertInfo(User User){

        User info=new User();
        info.setName(User.getName());
        info.setAge(User.getAge());
        info.setPassword(User.getPassword());
        userService.save(info);
    }

    /**
     * 根据id更新学生表信息
     * @param User
     */
    @RequestMapping("/update")
    public void updateById(User User){

        User info=new User();
        info.setId(User.getId());
        info.setName(User.getName());
        info.setAge(User.getAge());
        info.setPassword(User.getPassword());
        userService.updateById(info);
    }

    /**
     * 根据id删除学生信息
     * @param id
     */
    @RequestMapping("/delete")
    public void deleteById(String id){
        userService.removeById(id);
    }

    /**
     * 根据name、password校验登录
     * @paramname、password
     */
    @PostMapping("/login")
    public Result<Map<String,Object>> login(User user){
        Map<String,Object> data = userService.login(user);
        return Result.success(data);
    }

}
