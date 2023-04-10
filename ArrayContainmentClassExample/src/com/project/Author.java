package com.project;

public class Author {
   private int id;
   private String name;
   
   
   public Author() {
	   
   }
   
   public Author(int id, String name)
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
   
   public String setName() {
	   return name;
   }
   
   public void getname(String name)
   {
	   this.name=name;
   }

@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + "]";
}
   
   
}

