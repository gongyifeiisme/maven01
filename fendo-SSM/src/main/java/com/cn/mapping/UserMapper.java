package com.cn.mapping;

import org.springframework.stereotype.Repository;

import com.cn.model.User;

@Repository
public interface UserMapper {

	 User queryUser(int userId);

}