package com.demo.model;

public class Product {
	int pid;
	String name;
	String author;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String name, String author) {
		super();
		this.pid = pid;
		this.name = name;
		this.author = author;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", author=" + author + "]";
	}

}
