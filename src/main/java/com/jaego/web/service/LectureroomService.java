package com.jaego.web.service;

import java.util.List;

import com.jaego.web.dto.LectureroomDto;

public interface LectureroomService {
	public abstract List<LectureroomDto> list();
	public abstract void write(LectureroomDto lectureroomDto);
	public abstract LectureroomDto read(int LectureroomId);
	
}
