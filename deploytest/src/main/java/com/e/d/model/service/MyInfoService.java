package com.e.d.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e.d.model.mapper.MyInfoMapper;
import com.e.d.model.vo.MyInfoVo;

@Service
public class MyInfoService {

	@Autowired
	private MyInfoMapper mapper;

	public MyInfoVo selectAll() {
		return mapper.selectAll();
	}

}
