package com.sample.spring.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMyUserDao {
	List<MyUserDTO> list();
}
