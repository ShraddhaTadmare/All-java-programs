package com.Enum;

public enum MovieSeats {
	STANDARD(400),PREMIUM(450),RECLINER(500);
	
	int price; 
	
	private MovieSeats(int price) {
		this.price=price;
	}
	
	

}
