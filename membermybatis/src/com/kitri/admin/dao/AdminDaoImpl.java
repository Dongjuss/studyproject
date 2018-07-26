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
		SqlSession sqlSession = SqlMapConfig.getSqlSession(); //xml�� �о�帮�� xml�ȿ� sql������ ���� �غ�ܰ�
		try {
		return sqlSession.selectList("com.kitri.member.dao.MemberDao.MemberDetailDto",map); 
		//�̸��� idCheck�� �������� ã�ƶ�.
		}finally {
			sqlSession.close();
		}
	}
}
