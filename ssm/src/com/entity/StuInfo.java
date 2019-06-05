package com.entity;

import java.io.Serializable;
import java.util.Date;

public class StuInfo implements Serializable{
	private Integer id;//����
	private String sname;//ѧ������
	private String sex;//�Ա�
	private Date birthday;//����
	private String gschool;//��ҵԺУ
	private String major;//רҵ
	private String phone;//�绰
	private String wechat;//΢��
	private Date gdate;//��ҵ����
	private String addr;//��ַ
	private Integer classId;//�༶
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGschool() {
		return gschool;
	}
	public void setGschool(String gschool) {
		this.gschool = gschool;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public StuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuInfo(Integer id, String sname, String sex, Date birthday,
			String gschool, String major, String phone, String wechat,
			Date gdate, String addr, Integer classId) {
		super();
		this.id = id;
		this.sname = sname;
		this.sex = sex;
		this.birthday = birthday;
		this.gschool = gschool;
		this.major = major;
		this.phone = phone;
		this.wechat = wechat;
		this.gdate = gdate;
		this.addr = addr;
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "StuInfo [id=" + id + ", sname=" + sname + ", sex=" + sex
				+ ", birthday=" + birthday + ", gschool=" + gschool
				+ ", major=" + major + ", phone=" + phone + ", wechat="
				+ wechat + ", gdate=" + gdate + ", addr=" + addr + ", classId="
				+ classId + "]";
	}
	
}
