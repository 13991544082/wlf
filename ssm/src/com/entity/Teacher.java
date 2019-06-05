package com.entity;

import java.io.Serializable;

public class Teacher implements Serializable{
	private Integer id;//����
	private String tname;//��ʦ����
	private String phone;//�绰
	private String subject;//�γ�
	private Integer status;//1�ڿ���ʦ  2��ҵ��ʦ
	private String remark;//��ע
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer id, String tname, String phone, String subject,
			Integer status, String remark) {
		super();
		this.id = id;
		this.tname = tname;
		this.phone = phone;
		this.subject = subject;
		this.status = status;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tname=" + tname + ", phone=" + phone
				+ ", subject=" + subject + ", status=" + status + ", remark="
				+ remark + "]";
	}
	
	
	
}
