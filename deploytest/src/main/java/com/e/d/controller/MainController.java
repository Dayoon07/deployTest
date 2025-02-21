package com.e.d.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.e.d.model.service.MyInfoService;
import com.e.d.model.vo.MyInfoVo;

@Controller
public class MainController {
	
	@Autowired
	private MyInfoService service;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;

	@GetMapping("/")
	public String index(Model model) {
		MyInfoVo vo = service.selectAll();
		model.addAttribute("selectAllMyInfo", vo);
		return "index";
	}
	
}
