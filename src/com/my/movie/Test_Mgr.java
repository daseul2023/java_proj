package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class Test_Mgr {
	
	int index = 0;
	Test_Mgr(){}
	
	List <Test> tests = new ArrayList <>(); 
	
	void add(Test t) {
		tests.add(t);
		
	}
	
	void search () {
		index = 0;
		for (int i=0; i<tests.size(); i++) {
			System.out.println(++index + ". " + tests.get(i));
		}
		
	}
	void search (String title) {
		List<Test> findTitle = new ArrayList<>();
		
		for (int i = 0; i<tests.size(); i++) {
			if (tests.get(i).getTitle().equals(title)) {
				findTitle.add(tests.get(i));
			}
		}
		System.out.println("영화 제목으로 검색하세요>>>");
		index = 0;
		for (int i =0; i<tests.size(); i++) {
			System.out.println(++index + ". " + findTitle.get(i));
		}
	}
	
	void searchDirector (String name) {
		List<Test> findDirector = new ArrayList<>();
		index = 0;
		for (int i = 0; i<tests.size(); i++) {
			if (tests.get(i).getDirector().equals(name)) {
				findDirector.add(tests.get(i));
			}
		}
		System.out.println("영화 감독으로 검색하세요>>>");
		for (int i =0; i<tests.size(); i++) {
			System.out.println(++index + ". " + findDirector.get(i));
		}
		
	}
	List<Test> searchGenre (String genre){
		List<Test> findGenre = new ArrayList<>();
		
		for (int i = 0; i <tests.size(); i++) {
			if (tests.get(i).getGenre().equals(genre)) {
				findGenre.add(tests.get(i));
			}
			
		}
		return findGenre;
		
	}
	void delete (String title) {
		for (int i=0; i< tests.size(); i++) {
			if (tests.get(i).getTitle().equals(title)) {
				tests.remove(i);
			}
		}
		System.out.println("해당 영화 제목 : " + title + "이 삭제되었습니다.");
	}
	

}
