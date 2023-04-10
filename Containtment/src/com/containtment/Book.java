package com.containtment;

public class Book {
	
    private String name;
    private float price;
	private Author auth;
	
	public Book(String name, float price, Author auth) {
		super();
		this.name = name;
		this.price = price;
		this.auth = auth;
	}
	public Book(String name, float price) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", auth=" + auth + "]";
	}
	
	
    
    
}
