package com.atguigu.springmvc.event;

public class User {

	private String source;
	
	private Integer age;
	
	private String username;
	
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [source=" + source + ", age=" + age + ", username=" + username + "]";
	}

	
	
	
	
}
