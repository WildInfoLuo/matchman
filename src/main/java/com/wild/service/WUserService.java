package com.wild.service;

import java.util.List;

import com.wild.entity.WUser;

public interface WUserService {

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 */
	public int register(WUser user);

	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	public List<WUser> login(WUser user);

}
