package com.jaego.web.dao;

import java.util.List;

import com.jaego.web.dto.LectureroomDto;

public interface LectureroomDao {
	public abstract List<LectureroomDto> list();
	public abstract void insert(LectureroomDto lectureroomDto);
	public abstract LectureroomDto select(int LectureroomId);

}