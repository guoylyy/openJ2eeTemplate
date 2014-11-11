package com.prj.util;

import java.io.Serializable;

public class DataWrapper<T> implements Serializable {

	private static final long serialVersionUID = -3075889087516685551L;

	private CallStatusEnum callStatus;
	private ErrorCodeEnum errorCode;

	private String token;

	private T data;

	private int numPerPage;
	private int currPageNum;
	private int totalItemNum;
	private int totalPageNum;

	public DataWrapper() {
		this.callStatus = CallStatusEnum.SUCCEED;
		this.errorCode = ErrorCodeEnum.No_Error;
	}

	public CallStatusEnum getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(CallStatusEnum callStatus) {
		this.callStatus = callStatus;
	}

	public ErrorCodeEnum getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCodeEnum errorCode) {
		this.errorCode = errorCode;
		if (!errorCode.equals(ErrorCodeEnum.No_Error)) {
			this.callStatus = CallStatusEnum.FAILED;
		}
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getCurrPageNum() {
		return currPageNum;
	}

	public void setCurrPageNum(int currPageNum) {
		this.currPageNum = currPageNum;
	}

	public int getTotalItemNum() {
		return totalItemNum;
	}

	public void setTotalItemNum(int totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	@Override
	public String toString() {
		return "Call Status:" + this.callStatus + "\n" + "Error Code:"
				+ this.errorCode + "\n" + "Current Page Number:"
				+ this.currPageNum + "\n" + "Total Page Number:"
				+ this.totalPageNum + "\n" + "Item Number PerPage:"
				+ this.numPerPage + "\n" + "Total Item Number:"
				+ this.totalItemNum;
	}
}