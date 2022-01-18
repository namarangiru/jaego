package com.jaego.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaego.web.dao.LectureroomDao;
import com.jaego.web.dto.LectureroomDto;

public class LectureroomServiceImpl implements LectureroomService {
	private LectureroomDao lectureroomDao;
	
	public LectureroomDao getLectureroomDao() {
			return lectureroomDao;
	}
	
	public void setLectureroomDao(LectureroomDao lectureroomDao) {
			this.lectureroomDao = lectureroomDao;
	}
	@Override
	public List<LectureroomDto> list() {
		// TODO Auto-generated method stub
		return lectureroomDao.list();
	}

	

	@Override
	public void write(LectureroomDto lectureroomDto) {
		// TODO Auto-generated method stub
		lectureroomDao.insert(lectureroomDto);
	}

	@Override
	public LectureroomDto read(int LectureroomId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
