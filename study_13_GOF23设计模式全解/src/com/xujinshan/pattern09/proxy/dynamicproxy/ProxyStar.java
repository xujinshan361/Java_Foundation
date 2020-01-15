package com.xujinshan.pattern09.proxy.dynamicproxy;

/**
 * 模拟动态生成的代理的结构
 * @author xujinshan361@163.com
 *
 */
public class ProxyStar implements Star {
	
	StarHandler handler;
	
	public ProxyStar(StarHandler handler) {
		super();
		this.handler = handler;
	}

	public void bookTicket() {
//		handler.invoke(this,当前方法 , args);
	}

	public void collectMoney() {
//		handler.invoke(this,当前方法 , args);
	}

	public void confer() {
//		handler.invoke(this,当前方法 , args);
	}

	public void signContract() {
//		handler.invoke(this,当前方法 , args);
	}

	public void sing() {
//		handler.invoke(this,当前方法 , args);
	}

}
