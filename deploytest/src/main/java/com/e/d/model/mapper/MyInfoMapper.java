package com.e.d.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.e.d.model.vo.MyInfoVo;

@Mapper
public interface MyInfoMapper {

	MyInfoVo selectAll();
	
}
