package com.randomjoke.satresearch;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SatRestAPI {

	Logger logger = LoggerFactory.getLogger(SatRestAPI.class);

	@Autowired
	MovieRepository movierepo;
	
	@Autowired
	EmployeeRepository emprepo;

	@PostMapping("/storemovie")
	public String getMovieData(@RequestBody MoviePojo content) {

		saveMovie(content);
		return ("Movie Received : " + content.getMovieName());

	}

	public void saveMovie(MoviePojo content) {
		logger.info("Save Movie Called");
		MovieEntity movie = new MovieEntity();
		movie.setMovieName(content.getMovieName());
		movie.setMovieDirector(content.getMovieDirector());
		movie.setMovieStar(content.getMovieStar());
		movie.setMovieYear(content.getMovieYear());
		movierepo.save(movie);

	}

	@PostMapping("/storeemployee")
	public String getEmpoloyeeData(@RequestBody EmployeePojo employee) {

		saveEmployee(employee);
		return "Employee Saved" + employee.getEmployeeName();
	}
	
	@RequestMapping("/getallmovies")
	public List<MovieEntity> getAllMovies()
	{
		
		return movierepo.findAll();
	}
	
	
	public void saveEmployee(EmployeePojo employee) {
		logger.info("Save Employee Called");
		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmployeeId(employee.getEmployeeId());
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setEmployeeSal(employee.getEmployeeSal());
		emprepo.save(emp);
		

	}
	
	
	

}
