package com.demo.exception;

import java.util.Date;

public class ApiError {

	int errCode;
	String errDesc;
	Date date;

	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiError(int errCode, String errDesc, Date date) {
		super();
		this.errCode = errCode;
		this.errDesc = errDesc;
		this.date = date;
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ApiError [errCode=" + errCode + ", errDesc=" + errDesc + ", date=" + date + "]";
	}
}
