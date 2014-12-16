package com.prj.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Account extends BaseEntity {
	public enum Status {
		NEW,
//		RESET_PASSWORD,
		ACTIVE,
		INACTIVE
	}
	
	private String number;
	private String password;
//	private AccountCharacter accountCharacter;
	private Status status = Status.NEW;
	private String loginToken;
	private String iconPath;
	
	@Column
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Transient
//	public AccountCharacter getAccountCharacter() {
//		return accountCharacter;
//	}
//	public void setAccountCharacter(AccountCharacter accountCharacter) {
//		this.accountCharacter = accountCharacter;
//	}
	@Column
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Column
	public String getLoginToken() {
		return loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
}
