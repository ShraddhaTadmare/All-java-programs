package com.containtment;

public class Theatre {
	
	private int theatreId;
	private String theatreNane;
	private String theatreLocation;
	private Movie movie;
	
	
	
	public Theatre() {
	
	}


	public Theatre(int theatreId, String theatreNane, String theatreLocation) {
		
		this.theatreId = theatreId;
		this.theatreNane = theatreNane;
		this.theatreLocation = theatreLocation;
	}
	
	public Theatre(int theatreId, String theatreNane, String theatreLocation, Movie movie) {
		
		this(theatreId,theatreNane,theatreLocation);
		this.movie = movie;
	}


	public int getTheatreId() {
		return theatreId;
	}


	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}


	public String getTheatreNane() {
		return theatreNane;
	}


	public void setTheatreNane(String theatreNane) {
		this.theatreNane = theatreNane;
	}


	public String getTheatreLocation() {
		return theatreLocation;
	}


	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreNane=" + theatreNane + ", theatreLocation="
				+ theatreLocation + ", movie=" + movie + "]";
	}
	
	
	
	
	

}
