package com.containtment;

public class Author {
	
	    private	int id;
		private String name;
		private String qualification;
		

		public Author(int id,String name,String qualification ) {  
		    this.id = id;  
		    this.name = name;  
		    this.qualification = qualification;  
		} 
		  
		 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return qualification;
		}

		public void setLocation(String location) {
			this.qualification = location;
		}

		@Override
		public String toString() {
			return "Author [id=" + id + ", name=" + name + ", location=" + qualification + "]";
		}

		
		 
		}  

