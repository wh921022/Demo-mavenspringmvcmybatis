package com.svgteam.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ProjectUtil {
	private static SqlSessionFactory sessionFactory = null;
	private static SqlSession session = null;
	public static SqlSession getSession() {
		if (session == null) {
			String resource = "com/svgteam/mybatis/mybatis-config.xml";
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				session = new SqlSessionFactoryBuilder().build(inputStream).openSession();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return session;
	}
}
