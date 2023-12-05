package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class Test_Mgr {
	
	int index = 0;
	Test_Mgr(){}
	
	List <Test> tests = new ArrayList <>(); 
	
	void add(Test t) {
		
	}
	
	void search () {
		for (int i=0; i<tests.size(); i++) {
			tests.get(i);
			
		}
		
	}
	void search (String title) {
		boolean a = false;
		for(int i=0; i<tests.size(); i++) {
			tests.get(i).setTitle(title);
			if (title.equals(title)) {
				
			}
		}
	}
	
	void searchDirector (String name) {
		for (int i =0; i<tests.size(); i++) {
			tests.get(i).setDirector(name);
		}
		
	}
	List<Test> searchGenre (String genre){
		List<Test> aList = new ArrayList<>();
		boolean a =false;
		for (int i =0; i<aList.size(); i++) {
			a = true;
		}
		
		if (!a) {
			System.out.println("다시 입력하세요>>>");
		}
		
		return aList;
		
	}
	void delete (String title) {
		
	}

}
