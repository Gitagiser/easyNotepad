package com.gsj.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gsj.springbootmp.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
