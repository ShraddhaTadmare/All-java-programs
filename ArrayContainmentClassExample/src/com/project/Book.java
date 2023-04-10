package com.project;

public class Book {
     private int id;
     private String name;
     private float price;
     private Author author;
     
     public Book() {
    	 
     }
     
     public Book(int id,String name)
     {
    	 this.id=id;
    	 this.name=name;
     }
     
     public int setId() {
    	 return id;
     }
     
     public void getId(int id)
     {
    	 this.id=id;
     }
     
     public String setName()
     {
    	 return name;
     }
     
     public void getName(String name)
     {
    	 this.name=name;	 
     }
     
     public float setPrice()
     {
    	 return price;
     }
     
     public void getPrice(float price) {
    	 this.price=price;
     }
     
     public Author setAuthor()
     {
    	 return author;
     }
     
     public void getAuthor(Author author)
     {
    	 this.author=author;
     }
     public String toString()
     {
    	 return "Book details:"+id+" "+name+""+price+""+author;
     }
}
