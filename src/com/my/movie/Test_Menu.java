package com.my.movie;

import java.util.List;
import java.util.Scanner;

public class Test_Menu {
	
	Test_Menu(){}
	Scanner sc = new Scanner(System.in);
	Test_Mgr testManager = new Test_Mgr();
	
	int index;
	void Test_Menu() {
		
out :	do {
			System.out.println("영화 정보를 추가하세요");
			System.out.println("1. 제목으로 영화 정보를 검색하세요");
			System.out.println("2. 감독으로 영화 정보를 검색하세요");
			System.out.println("3. 장르로 영화 정보를 검색하세요");
			System.out.println("4. 삭제할 영화 제목을 입력하세요");
			
			index = sc.nextInt();
			switch (index) {
			case 1 :
				System.out.println("영화 제목을 입력하세요>>>");
				String myTitle = sc.next();
				System.out.println("영화 감독을 입력하세요>>>");
				String myDirector = sc.next();
				System.out.println("영화 등급을 입력하세요>>>");
				int myGrade = sc.nextInt();
				System.out.println("영화 장르를 입력하세요>>>");
				String myGenre = sc.next();
				testManager.add(new Test (myTitle, myDirector, myGrade, myGenre));
				System.out.println("성공적으로 추가되었습니다.");
				break;
				
			case 2 :
				testManager.search();
				break;
			case 3 :
				System.out.println("찾고자 하는 영화 제목을 입력하세요>>>");
				myTitle = sc.next();
				testManager.search(myTitle);
				break;
			case 4 : 
				System.out.println("찾고자 하는 영화 감독을 입력하세요>>>");
				myDirector = sc.next();
				testManager.search(myDirector);
				break;
			case 5 : 
				System.out.println("찾고자 하는 영화 장르를 입력하세요>>>");
				myGenre = sc.next();
				List<Test>tests = testManager.searchGenre(myGenre);
				
				int index =0;
				for (int i=0; i<tests.size(); i++) {
					System.out.println(++i + ". " + tests.get(i));
				}
				break;
			case 6:
				System.out.println("삭제하고자 하는 영화명을 입력하세요>>>");
				myTitle = sc.next();
				testManager.delete(myTitle);
				System.out.println("삭제완료");
				break;
				
			case 7 :
				break out;
			
			}
		}while(true);
		
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}

}
