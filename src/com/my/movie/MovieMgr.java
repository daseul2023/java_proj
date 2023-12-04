package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr extends Movie{
	
	MovieMgr(){}
	int index = 0;
	
	List <Movie> movies = new ArrayList<>();
	
	void add (Movie m) {
		movies.add(m);
		
	}
	
	void serch () {
		for (int i =0; i<movies.size(); i++) {
			movies.get(i);
		}
		
	}
	
	void serch (String title) {
		for (int i=0; i<movies.size(); i++) {
			movies.get(i).setTitle(title);
			
		}
	}
	
	void serchDirector (String director) {
		for (int i =0; i<movies.size(); i++) {
			movies.get(i).setDirector(director);
		}
		
	}
	
	List<Movie> serchGenre (String genre) {
		List<Movie> aList = new ArrayList<>();
		
		boolean s =false;
		
		for (int i=0; i<movies.size(); i++) {
			Movie m = movies.get(i);
			if (genre.equals(m.getGenre())) {
				System.out.println("영화명 :" + m.getTitle() + "감독명 : " + m.getDirector() + "영화 등급 : " + m.getGrade() + "장르 : "+ m.getGenre());
				s = true;
			}
		}
		
		return aList;
		}
	
	
	void delete (String title) {
		for (int i=0; i<movies.size(); i++) {
			if (movies.get(i).getTitle().equals(title)) {
				movies.remove(i);
			}
		}
		
	}
	
	
	
}
