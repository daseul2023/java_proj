package com.my.movieTeacher;

import java.util.ArrayList;
import java.util.List;



public class MovieMgr {
	
	List<Movie> movies = new ArrayList<>();
    int index = 0 ;                      // 방의 번호.
	
	MovieMgr() {}						// 기본 생성자 
		
	//영화 정보 추가하기
	public void add(Movie m) { 
		movies.add(m);
//		movies[index++] = m;
	}
	
	// 영화 정보 모두 출하기
	void search() {

		index = 0; 
		for (int i = 0 ; i < movies.size() ; i++) {
			System.out.println(++index + ". " + movies.get(i));
		}
		
	}
	
	// 영화 제목으로 영화 찾기
	 void search(String title) {
		 
		 //기존의 movies 에 저장된 객체중 title 를 가져와서 새로운 findTitle ArrayList 에 검색된 내용을 추가한다. 
		 List<Movie> findTitle = new ArrayList<>(); ; 
		 for (int i =0 ; i < movies.size(); i++) {
			 
			 if ( (movies.get(i).getTitle()).equals(title) ) {
				 findTitle.add(movies.get(i)); 				 
			 } 
		 }
		 
		 // 새로운 ArrayList 인 findTitle 에 검색된 객체를 끄집어 내서 출력 한다. 
		 
		System.out.println("영화 제목으로 검색된 결과는 아래와 같습니다. "); 
		System.out.println("===================================== "); 
		index = 0 ; 
		for (int i = 0 ; i < findTitle.size() ; i++) {
			System.out.println(++index + ". " + findTitle.get(i)); 
		}		 
	}

	// 감독명으로 영화 찾기
	void searchDirector(String name) {
		 //기존의 movies 에 저장된 객체중 director 를 가져와서 새로운 findDirector ArrayList 에 검색된 내용을 추가한다. 
		 List<Movie> findDirector = new ArrayList<>(); ; 
		 for (int i =0 ; i < movies.size(); i++) {
			 
			 if ( (movies.get(i).getDirector()).equals(name) ) {
				 findDirector.add(movies.get(i)); 				 
			 } 
		 }
		 
		 // 새로운 ArrayList 인 findDirector 에 검색된 객체를 끄집어 내서 출력 한다. 
		 
		System.out.println("감독명 으로 검색된 결과는 아래와 같습니다. "); 
		System.out.println("===================================== "); 
		index = 0 ;
		for (int i = 0 ; i < findDirector.size() ; i++) {
 
			System.out.println(++index + ". " + findDirector.get(i)); 
		}
	
		
	}

	// 장르로 영화 찾기 <== 검색된 내용을 List<Movie> 를 담아서 리던 하기 
	List<Movie> searchGenre(String genre) {
		 //기존의 movies 에 저장된 객체중 genre 를 가져와서 새로운 findDirector ArrayList 에 검색된 내용을 추가한다. 
		 List<Movie> findGenre = new ArrayList<>();
		 for (int i =0 ; i < movies.size(); i++) {
			 
			 if ( movies.get(i).getGenre().equals(genre) ) {
				 findGenre.add(movies.get(i)); 
			 } 
		 }
		 
		 // 새로운 ArrayList 인 findGenre 에 검색된 객체를 끄집어 내서 출력 한다. 
		 // 출력은 리턴으로 받아서 출력 한다. 

	
		return findGenre; 
		
	}

	// 이름으로 영화 정보 삭제하기
	void delete(String title) {
		 
		
		for (int i = 0 ; i < movies.size(); i++) {
			if ( movies.get(i).getTitle().equals(title)) {
				movies.remove(i);
				System.out.println("해당 영화 제목 이름 : " + title + " 으로된 영화가 잘 삭제 되었습니다. ");
			}
		}

	}

	
	
	
}
