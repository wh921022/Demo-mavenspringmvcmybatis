package com.svgteam.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.svgteam.entity.Student;

public interface StudentMapper {
	@Select("select * from student")
	public List<Student> select();
}
