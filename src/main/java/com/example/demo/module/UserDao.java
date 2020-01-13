package com.example.demo.module;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.UserEntity;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dzh
 * @since 2019-01-14
 */
public interface UserDao extends BaseMapper<UserEntity> {
    List<UserEntity> selectAll();
}
