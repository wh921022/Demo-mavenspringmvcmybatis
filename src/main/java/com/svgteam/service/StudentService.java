package com.svgteam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.svgteam.entity.Student;
import com.svgteam.mybatis.mapper.StudentMapper;
import com.svgteam.util.ProjectUtil;

public class StudentService {
	SqlSession session = ProjectUtil.getSession();
	public List<Student> getAllStudent(){
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> stus = mapper.select();
		return stus;
	}
}
