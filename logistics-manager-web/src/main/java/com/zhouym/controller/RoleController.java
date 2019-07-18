package com.zhouym.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhouym.pojo.Role;
import com.zhouym.service.IRoleService;

@Controller
//窄化请求为了是请求路径不重名，在请求路径中多加一层目录
@RequestMapping("/role")
public class RoleController {
	
	@Resource
	private IRoleService iroleService;
	
	@RequestMapping("/query.do")
	public String query(Model m,Role role) {
		List<Role> roles = iroleService.query(role);
		m.addAttribute("list",roles);
		return "role/role";
	}
}
