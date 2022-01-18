package com.jaego.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jaego.web.service.LectureroomService;

@Controller
public class LectureroomController {
	private LectureroomService lectureroomService;
	
	public void setLectureroomService(LectureroomService lectureroomService) {
			this.lectureroomService = lectureroomService;
	}
	
	@RequestMapping(value="/lectureroom/list")
	@ResponseBody
	public String list() {
		return lectureroomService.list().toString();
	}

}