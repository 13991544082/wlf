package com.entity;

import java.io.Serializable;
import java.util.Date;

public class StuInfo implements Serializable{
	private Integer id;//主键
	private String sname;//学生名字
	private String sex;//性别
	private Date birthday;//生日
	private String gschool;//毕业院校
	private String major;//专业
	private String phone;//电话
	private String wechat;//微信
	private Date gdate;//毕业日期
	private String addr;//地址
	private Integer classId;//班级
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
