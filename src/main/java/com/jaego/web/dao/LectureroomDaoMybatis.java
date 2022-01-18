package com.jaego.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.jaego.web.dto.LectureroomDto;

@Repository
public class LectureroomDaoMybatis implements LectureroomDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public LectureroomDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<LectureroomDto> list() {
		return sqlSessionTemplate.selectList("list");
	}

	@Override
	public void insert(LectureroomDto lectureroomDto) {
		sqlSessionTemplate.insert("insert", lectureroomDto);
	}

	@Override
	public LectureroomDto select(int LectureroomId) {
		LectureroomDto dto = (LectureroomDto) sqlSessionTemplate.selectOne("select", LectureroomId);
		return null;
	}
	
	
	
	
	
	

}
