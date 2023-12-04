package com.my.movie01;

import java.util.Scanner;

public class MovieMenu {
	
	Scanner sc = new Scanner(System.in);
	
	MovieMgr myMenu = new MovieMgr();
	Movie a = new Movie();
	
	void movieMenu() {
		
		out: do {
			System.out.println("<<영화 관리 프로그램>>");
			System.out.println("=======================================");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화 명 검색");
			System.out.println("4. 영화 감독별 검색");
			System.out.println("5. 영화 장르별 검색");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("=======================================");
			System.out.println("위의 정수를 입력해주세요");
			int select = sc.nextInt();
			
			
			switch(select) {
			case 1:
				System.out.println("영화 명을 문자열로 입력하세요: ");
				String Mytitle = sc.next();
				a.setTitle(Mytitle);
				System.out.println("감독 명을 문자열로 입력하세요: ");
				String Mydirector = sc.next();
				a.setDirector(Mydirector);
				System.out.println("등급을 정수로 입력하세요: ");
				int Mygrade = sc.nextInt();
				a.setGrade(Mygrade);
				System.out.println("장르를 문자열로 입력하세요: ");
				String Mygenre = sc.next();
				a.setGenre(Mygenre);
				
				myMenu.add(new Movie(a.getTitle(), a.getDirector(), a.getGrade(), a.getGenre()));
				System.out.println("성공적으로 추가되었습니다.");
				System.out.println("=======================================");
				break;
				
			case 2:
				System.out.println("추가된 영화의 정보입니다.");
				myMenu.search();
				System.out.println("=======================================");
				break;
				
			case 3:
				System.out.println("검색할 영화 명을 입력하세요: ");
				String sTitle = sc.next();
				myMenu.search(sTitle);
				System.out.println("=======================================");
				break;
				
			case 4:
				System.out.println("검색할 감독 명을 입력하세요: ");
				String sDirector = sc.next();
				myMenu.searchDirector(sDirector);
				System.out.println("=======================================");
				break;
				
			case 5:
				System.out.println("검색할 영화 장르를 입력하세요: ");
				String sGenre = sc.next();
				myMenu.searchGenre(sGenre);
				System.out.println("=======================================");
				break;
				
			case 6:
				System.out.println("삭제할 영화 명을 입력하세요: ");
				String dTitle = sc.next();
				myMenu.delete(dTitle);
				System.out.println("=======================================");
				break;

			case 0:
				break out;
			}
		} while(true);
		System.out.println("프로그램 종료");
		sc.close();
		
	}
}
	
	