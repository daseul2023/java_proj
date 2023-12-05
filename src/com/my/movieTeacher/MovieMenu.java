package com.my.movieTeacher;

import java.util.List;
import java.util.Scanner;

public class MovieMenu {
	
	MovieMenu(){}
	
	void movieMenu() {
		
		Scanner sc = new Scanner(System.in);


		//MovieMgr 객체 생성 
		MovieMgr mvManager = new MovieMgr(); 
		
		boolean flag = true;
		while(flag) {
			System.out.println();
			System.out.println("<<영화 관리 프로그램>>");
			System.out.println("=============================");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 감독별 검색");
			System.out.println("5. 영화 장르별 검색");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.println("위의 정수를 입력해 주세요>>>>");
			
			int selectNum = sc.nextInt();
						
			switch(selectNum) {
			case 1:
				System.out.print("영화 명을 문자열로 입력해주세요 : ");
				String mvName = sc.next();
				System.out.print("감독 명을 문자열로 입력해주세요 : ");
				String mvDir = sc.next();
				System.out.print("등급을 정수로 입력해주세요 : ");
				int mvGr = sc.nextInt();
				System.out.print("장르를 문자열로 입력해주세요 : ");
				String mvGre = sc.next();
				mvManager.add(new Movie(mvName, mvDir, mvGr, mvGre));
				System.out.println("성공적으로 추가되었습니다.");
				break;
			case 2:
				mvManager.search();
				break;
			case 3:
				System.out.println("찾고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				mvManager.search(mvName);
				break;
			case 4:
				System.out.println("찾고자하는 감독을 입력하세요 : ");
				mvName = sc.next();
				mvManager.searchDirector(mvName);
				break;
			case 5:
				System.out.print("찾고자하는 장르를 입력하세요 : ");
				mvGre = sc.next();
				List<Movie> movies = mvManager.searchGenre(mvGre);
				
				//리턴 받은 movies 를 출력 
				int index = 0;
				for (int i = 0 ; i < movies.size(); i++) {
					System.out.println( ++index  + ". " + movies.get(i)); 
				}
				
				break;
			case 6:
				System.out.print("삭제하고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				mvManager.delete(mvName);
				System.out.println("삭제완료");
				break;
			case 0:
				flag=false;
				break;
			}			
		}
		
		sc.close();
		/*
		1.  영화명		감독명			등급(int) 	장르	
		============================================================	 		
		    아바타  		제임스카메론 		12			SF	
		    아바타 		테스트			15			판타지 	
		    반지의제왕		피터잭슨			15			판타지	
		    서울의봄		김성수			20			시대극  	    
		    비트 			김성수			20			액션 	    
		*/
		
		
	}

}
