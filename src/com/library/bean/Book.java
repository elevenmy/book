package com.library.bean;

public class Book {
	private int no;
	private String name;
	private String author;
	private double count;
	private double price;
	private int num;
	private String play;
	public Book(String name, String author, double count, double price, int num, String play) {
		super();
		this.name = name;
		this.author = author;
		this.count = count;
		this.price = price;
		this.num = num;
		this.play = play;
	}
	public Book(int no, String name, String author, double count, double price, int num, String play) {
		super();
		this.no = no;
		this.name = name;
		this.author = author;
		this.count = count;
		this.price = price;
		this.num = num;
		this.play = play;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	
}
