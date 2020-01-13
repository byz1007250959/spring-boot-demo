package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;

import java.util.List;

/**
 * @author DUAN
 * @date 2019/1/13
 */
public interface UserMapper extends BaseMapper<User> {
    int count();
    List<User> selectAll();
}
