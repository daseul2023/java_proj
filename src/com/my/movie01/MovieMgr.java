package com.my.movie01;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr{
	
	List<Movie> movies = new ArrayList<>();
	int index = 0;
	
	
	MovieMgr() {}
	
	void add(Movie m) {
		movies.add(m);
	}
	
	
	void search() {
		
		for (int i = 0, k = 1; i < movies.size(); i++) {
			Movie m = movies.get(i);
			System.out.println(k + ". 영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
			k++;
		}
	}
	
	
	void search(String title) {
		boolean s = false;		//입력 값의 결과 초기값: false
		
	    for (int i = 0; i < movies.size(); i++) {
	        Movie m = movies.get(i);
	        if (title.equals(m.getTitle())) {
	            // 일치하는 영화를 찾았을 때 출력
	        	System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
	            s = true;
	        }
	    }
	    // 반복문을 모두 돌고 나서 일치하는 영화가 없으면 해당 메시지 출력
	    if (!s) {
	    	System.out.println("입력한 영화 명과 일치하는 영화 목록이 없습니다.");
	    }
	}
	
	
	void searchDirector(String name) {
		boolean s = false;
		
	    for (int i = 0; i < movies.size(); i++) {
	        Movie m = movies.get(i);
	        if (name.equals(m.getDirector())) {
	            // 일치하는 영화를 찾았을 때 출력
	        	System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
	            s = true;
	        }
	    }
	    // 반복문을 모두 돌고 나서 일치하는 영화가 없으면 해당 메시지 출력
	    if (!s) {
	    	System.out.println("입력한 감독 명과 일치하는 영화 목록이 없습니다.");
	    }
	}
	
	
	List<Movie> searchGenre = new ArrayList<> ();
	
	void searchGenre(String genre) {
		
		boolean s = false;
		searchGenre.clear();
		
	    for (int i = 0; i < movies.size(); i++) {
	        Movie m = movies.get(i);
	        if (genre.equals(m.getGenre())) {
	            // 일치하는 영화를 찾았을 때 출력
	        	System.out.println("영화 명: " + m.getTitle() + ", 감독 명: " + m.getDirector() + ", 영화 등급: " + m.getGrade() + ", 장르: " + m.getGenre());
	            s = true;
	        }
	    }
	    // 반복문을 모두 돌고 나서 일치하는 영화가 없으면 해당 메시지 출력
	    if (!s) {
	    	System.out.println("입력한 영화 장르와 일치하는 영화 목록이 없습니다.");
	    }
	}
	
	
	void delete(String title) {
		
		boolean s = false;
		
	    for (int i = 0; i < movies.size(); i++) {
	        Movie m = movies.get(i);
	        if (title.equals(m.getTitle())) {
	            // 일치하는 영화를 찾았을 때 출력
	        	movies.remove(i);
	        	System.out.println("영화 명: " + title + "인 행이 삭제되었습니다.");
	            s = true;
	        }
	    }
	    // 반복문을 모두 돌고 나서 일치하는 영화가 없으면 해당 메시지 출력
	    if (!s) {
	    	System.out.println("입력한 영화 명과 일치하는 영화 목록이 없습니다.");
	    }
	}
}