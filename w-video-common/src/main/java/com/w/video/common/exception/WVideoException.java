package com.w.video.common.exception;

/**
 * 业务异常类
 * @author devp006
 * @since 2017年9月13日 上午9:19:54
 */
public class WVideoException extends RuntimeException{

	private static final long serialVersionUID = 8426466280633202339L;
	
	public WVideoException(){
		super();
	}

	public WVideoException(Throwable cause){
		super(cause);
	}
	
	public WVideoException(String message){
		super(message);
	}
}
