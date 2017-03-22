package com.wild.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 
 * @author Wild
 *
 */
public class WUser implements Serializable {

	private static final long serialVersionUID = 1632537799039372010L;

	private int WID;// 用户id
	private String WName;// 用户名字
	private String WUserNum;// 用户帐号
	private String WPassWord;// 用户密码
	private Date WDate;
	private int WStatus;// 用户状态
	private int WSuperManager;// 用户角色

	public WUser(String string, String string2, int i, int j) {
	}

	public int getWID() {
		return WID;
	}

	public void setWID(int wID) {
		WID = wID;
	}

	public String getWName() {
		return WName;
	}

	public void setWName(String wName) {
		WName = wName;
	}

	public String getWUserNum() {
		return WUserNum;
	}

	public void setWUserNum(String wUserNum) {
		WUserNum = wUserNum;
	}

	public String getWPassWord() {
		return WPassWord;
	}

	public void setWPassWord(String wPassWord) {
		WPassWord = wPassWord;
	}

	public Date getWDate() {
		return WDate;
	}

	public void setWDate(Date wDate) {
		WDate = wDate;
	}

	public int getWStatus() {
		return WStatus;
	}

	public void setWStatus(int wStatus) {
		WStatus = wStatus;
	}

	public int getWSuperManager() {
		return WSuperManager;
	}

	public void setWSuperManager(int wSuperManager) {
		WSuperManager = wSuperManager;
	}

	@Override
	public String toString() {
		return "WUser [WID=" + WID + ", WName=" + WName + ", WUserNum=" + WUserNum + ", WPassWord=" + WPassWord
				+ ", WDate=" + WDate + ", WStatus=" + WStatus + ", WSuperManager=" + WSuperManager + "]";
	}
}
