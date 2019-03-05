package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletRequest;

public class RequestProxy  implements Proxy{

	private HttpServletRequest request;

	@Override
	public void carryOut(Object o) {
		System.out.println("----3-----");
		if((HttpServletRequest)o != null) {
			System.out.println("o 가 널아님");
			setRequest((HttpServletRequest)o);
		}else {
			System.out.println("o 가 널");
		}
		
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
}
