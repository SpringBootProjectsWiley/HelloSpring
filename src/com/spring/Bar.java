package com.spring;

public class Bar {
	private String name;
	private int age;
	private Foo foo;
	public Bar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Bar() {
		super();
	}
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	@Override
	public String toString() {
		return "Bar [name=" + name + ", age=" + age + ", foo=" + foo + "]";
	}
	public void processFooName() {
		System.out.println("Name in injected foo is"+foo.getName());
	}
	
}
