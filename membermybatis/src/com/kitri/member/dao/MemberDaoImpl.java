package com.kitri.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kitri.mapper.SqlMapConfig;
import com.kitri.member.model.MemberDetailDto;
import com.kitri.member.model.MemberDto;
import com.kitri.member.model.ZipDto;

public class MemberDaoImpl implements MemberDao {

	@Override
	public int idCheck(String id) {
		SqlSession sqlSession = SqlMapConfig.getSqlSession(); //xml�� �о�帮�� xml�ȿ� sql������ ���� �غ�ܰ�
		try {
		return sqlSession.selectOne("memberDao.idCheck",id); 
		//�̸��� idCheck�� �������� ã�ƶ�.
		}finally {
			sqlSession.close();
		}
	}

	@Override
	public List<ZipDto> zipSearch(String dong) {
		SqlSession sqlSession = SqlMapConfig.getSqlSession(); //xml�� �о�帮�� xml�ȿ� sql������ ���� �غ�ܰ�
		try {
		return sqlSession.selectList("memberDao.zipSearch",dong); 
		//�̸��� idCheck�� �������� ã�ƶ�.
		}finally {
			sqlSession.close();
		}
	}

	@Override
	public int registerMember(MemberDetailDto memberDetailDto) {
		int cnt = 0;
		SqlSession sqlSession = SqlMapConfig.getSqlSession(); //xml�� �о�帮�� xml�ȿ� sql������ ���� �غ�ܰ�
		try {
			
		cnt= sqlSession.insert("memberDao.registerMember",memberDetailDto); 
		sqlSession.commit();
		//�̸��� idCheck�� �������� ã�ƶ�.
		}finally {
			sqlSession.close();
		}
		return cnt;
	}

	@Override
	public MemberDetailDto getMember(String id) {
		return null;
	}

	@Override
	public int modifyMember(MemberDetailDto memberDetailDto) {
		return 0;
	}

	@Override
	public void deleteMember(String id) {
		
	}

	@Override
	public MemberDto login(Map<String, String> map) {
		SqlSession sqlSession = SqlMapConfig.getSqlSession();
		try {
		return sqlSession.selectOne("memberDao.login",map); 
		
		}finally {
			sqlSession.close();
		}
	}

}




















