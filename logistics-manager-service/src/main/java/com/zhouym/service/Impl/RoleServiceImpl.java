package com.zhouym.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhouym.mapper.RoleMapper;
import com.zhouym.pojo.Role;
import com.zhouym.pojo.RoleExample;
import com.zhouym.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	@Override
	public List<Role> query(Role role) {
		RoleExample example = new RoleExample();
		List<Role> list = roleMapper.selectByExample(example);
		return list;
	}

}
