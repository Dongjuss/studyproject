package com.kitri.mapper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 마이바티스 설정이 어디있는지 알려주고 읽고 SQL세션을 만들어라.

public class SqlMapConfig {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try{
		String resource = "com/kitri/mapper/Configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);  
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
