package com.jaego.web.dto;

import java.sql.Timestamp;

public class LectureroomDto {
	private int lectureroomId;
	private int lectureId;
	private int mentorId;
	private String lectureroomTitle;
	private String lectureroomContent;
	private String lectureroomReplystatus;
	private String lectureroomReply;
	private Timestamp lectureroomRegdate;
	private String lectureroomFname;
	public int getLectureroomId() {
		return lectureroomId;
	}
	public void setLectureroomId(int lectureroomId) {
		this.lectureroomId = lectureroomId;
	}
	public int getLectureId() {
		return lectureId;
	}
	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getLectureroomTitle() {
		return lectureroomTitle;
	}
	public void setLectureroomTitle(String lectureroomTitle) {
		this.lectureroomTitle = lectureroomTitle;
	}
	public String getLectureroomContent() {
		return lectureroomContent;
	}
	public void setLectureroomContent(String lectureroomContent) {
		this.lectureroomContent = lectureroomContent;
	}
	public String getLectureroomReplystatus() {
		return lectureroomReplystatus;
	}
	public void setLectureroomReplystatus(String lectureroomReplystatus) {
		this.lectureroomReplystatus = lectureroomReplystatus;
	}
	public String getLectureroomReply() {
		return lectureroomReply;
	}
	public void setLectureroomReply(String lectureroomReply) {
		this.lectureroomReply = lectureroomReply;
	}
	public Timestamp getLectureroomRegdate() {
		return lectureroomRegdate;
	}
	public void setLectureroomRegdate(Timestamp lectureroomRegdate) {
		this.lectureroomRegdate = lectureroomRegdate;
	}
	public String getLectureroomFname() {
		return lectureroomFname;
	}
	public void setLectureroomFname(String lectureroomFname) {
		this.lectureroomFname = lectureroomFname;
	}
	
	
	
}
