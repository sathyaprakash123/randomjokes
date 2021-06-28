package com.randomjoke.satresearch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movietable")
public class MovieEntity {
	
	@Id
	@Column(name="moviename")
	private String movieName;
	
	@Column(name="moviedirector")
	private String movieDirector;
	
	@Column(name="movieyear")
	private Integer movieYear;
	
	@Column(name="moviestar")
	private String movieStar;
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public Integer getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(Integer movieYear) {
		this.movieYear = movieYear;
	}
	public String getMovieStar() {
		return movieStar;
	}
	public void setMovieStar(String movieStar) {
		this.movieStar = movieStar;
	}
	
	

}
