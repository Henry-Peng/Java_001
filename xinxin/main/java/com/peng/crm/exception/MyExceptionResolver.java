package com.peng.crm.exception;

/**
 * 自定义异常处理器
 * @author pfh
 * @date 2020年8月10日
 */
public class MyExceptionResolver extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyExceptionResolver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyExceptionResolver(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MyExceptionResolver [msg=" + msg + "]";
	}
	
	

	
}
