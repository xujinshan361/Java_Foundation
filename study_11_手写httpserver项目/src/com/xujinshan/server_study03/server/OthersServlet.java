package com.xujinshan.server_study03.server;

public class OthersServlet implements Servlet {

	@Override
	public void service(Request request,Response response) {
		response.print("其他测试页面"); 
	}

}
