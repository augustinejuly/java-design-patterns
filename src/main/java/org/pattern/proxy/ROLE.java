package org.pattern.proxy;

public enum ROLE{

	USER(0),
	ADMIN(101);

	private int code;

	private ROLE(int c) {
		this.code = c;
	}

	public int getCode(){
		return code;
	}
}
