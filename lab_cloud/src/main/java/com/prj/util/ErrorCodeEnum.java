package com.prj.util;

import java.io.Serializable;

public enum ErrorCodeEnum implements Serializable{
	No_Error("No Error", 0),
	Unknown_Error("Unknown Error", 1),

	Account_Not_Exist("Account Not Exist", 2),
	Password_Wrong("Password Wrong", 3),
	Account_Exist("Account Exist", 4),
	Account_Not_Active("Account Not Active", 5),
	Token_Expired("Token Expired", 6),
	Token_Invalid("Token Invalid", 7),
	Access_Denied("Access Denied", 8), 
	Lab_Not_Exist("Lab Not Exist", 9), 
	Lab_Exist("Lab Exist", 10), 
	Course_Not_Exist("Course Not Exist", 11),
	Course_Exist("Course Exist", 12),
	Experiment_Not_Exist("Experiment Not Exist", 13),
	Experiment_Exist("Course Exist", 14),
	Lab_Not_Active("Lab Not Active", 15),
	Experiment_Not_Active("Experiment Not Active", 16),
	File_Creation_Error("File Creation Error", 17),
	Account_Character_Null("Account Character Null", 18), 
	Reach_Lab_Limit("Reach Lab Limit", 19), Search_Character_Wrong, Search_Criteria_Null;
	
	private String label;
	private Integer code;
	
	ErrorCodeEnum() {}
	
	ErrorCodeEnum(String label, Integer code) {
		this.setLabel(label);
		this.setCode(code);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return code.toString();
	}
	
	public static ErrorCodeEnum parse(int code) {
		for (ErrorCodeEnum theEnum : ErrorCodeEnum.values()) {
			if (theEnum.getCode() == code) {
				return theEnum;
			}
		}
		return No_Error;
	}
}
