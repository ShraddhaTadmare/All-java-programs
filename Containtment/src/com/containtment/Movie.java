package com.containtment;

public class Movie {
	
	private int movieId;
	private String movieName;
	private String movieReleaseDate;
	
	public Movie() {
		
		
	}
	public Movie(int movieId, String movieName, String movieReleaseDate) {
		
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieReleaseDate = movieReleaseDate;
	}
	
	
	public Movie(int movieId, String movieName) {
	
		this.movieId = movieId;
		this.movieName = movieName;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieReleaseDate=" + movieReleaseDate + "]";
	}
	
	
	
	

}
