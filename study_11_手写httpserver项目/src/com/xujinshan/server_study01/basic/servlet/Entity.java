package com.xujinshan.server_study01.basic.servlet;
/**
 * <servlet>
  <servlet-name>login</servlet-name>
  <servlet-class>com.shsxt.LoginServlet</servlet-class>
  </servlet>
 * 
 * @author xujinshan361@163.com
 *
 */
public class Entity {
	private String name;
	private String clz;
	public Entity() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClz() {
		return clz;
	}
	public void setClz(String clz) {
		this.clz = clz;
	}
}
