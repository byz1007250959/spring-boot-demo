package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.UserEntity;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dzh
 * @since 2019-01-14
 */
public interface UserService extends IService<UserEntity> {
    List<UserEntity> getAll();
}
