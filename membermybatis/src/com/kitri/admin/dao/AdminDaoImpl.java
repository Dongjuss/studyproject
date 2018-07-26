package com.kitri.admin.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kitri.mapper.SqlMapConfig;
import com.kitri.member.model.MemberDetailDto;
import com.kitri.member.model.ZipDto;

public class AdminDaoImpl implements AdminDao {

	@Override
	public List<MemberDetailDto> memberList(Map<String, String> map) {
		SqlSession sqlSession = SqlMapConfig.getSqlSession(); //xml을 읽어드리고 xml안에 sql문장을 실행 준비단계
		try {
		return sqlSession.selectList("com.kitri.member.dao.MemberDao.MemberDetailDto",map); 
		//이름이 idCheck인 쿼리문을 찾아라.
		}finally {
			sqlSession.close();
		}
	}
}
