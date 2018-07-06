package com.cn.service.impl;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cn.mapping.UserMapper;
import com.cn.model.User;
import com.cn.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	
	
	 @Autowired(required=false)
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		
		return this.userMapper.queryUser(userId);
	}

}
