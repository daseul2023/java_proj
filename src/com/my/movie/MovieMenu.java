package com.my.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieMenu {
	MovieMenu (){}

	public static void main(String[] args) {
		
		int select;
		
//		Movie m = new MovieMenu ();
		MovieMgr mvMenu = new MovieMgr();
//		MovieMgr mgr = new MovieMgr();
		
		
			
			Scanner sc =new Scanner(System.in);
			
			List<Movie> mList = new ArrayList<>();
//			mList.add(m);
			mList.add(mvMenu);
			
		
			
	out:	do {
			System.out.println("1. 영화 제목을 입력하세요.");
			System.out.println("2. 영화 감독을 입력하세요.");
			System.out.println("3. 영화 장르를 입력하세요.");
			System.out.println("4. 영화 정보를 입력하세요.");
			System.out.println("5. 영화 등급 입력하세요.");
			System.out.println("6. 삭제할 영화 제목을 입력하세요.");
			System.out.println("============================");
			System.out.println("위 내용의 번호를 입력하세요");
			select = sc.nextInt();
			
			switch(select){
		
			case 1 :
				if (mvMenu.getTitle() != null) {
					System.out.println("영화 제목을 올바르게 입력해주세요>>>");
					break;
				}
				System.out.println("영화 제목을 입력하세요>>>");
				String title = sc.next();
				mvMenu.setTitle(title);
			case 2 :
				if (mvMenu.getDirector() != null) {
					System.out.println("영화 감독을 올바르게 입력해주세요>>>");
					break;
				}
				System.out.println("영화 감독을 입력하세요>>>");
				String director = sc.next();
				mvMenu.setDirector(director);
			case 3 :
				if (mvMenu.getGenre() != null) {
					System.out.println("영화 장르를 올바르게 입력해주세요>>>");
					break;
				}
				System.out.println("영화 장르를 입력하세요>>>");
				String genre = sc.next();
				mvMenu.setGenre(genre);
			case 4 : 
				System.out.println("영화 정보를 입력하세요>>>");
				String add = sc.next();
				mvMenu.add(mvMenu);
			case 5 :
				System.out.println("영화 등급을 입력하세요>>>");
				String grade = sc.next();
				mvMenu.getGrade();
			case 6 : 
//				if (m1.getTitle() != sc.next()) {
//					System.out.println("삭제할 영화 제목을 올바르게 입력해주세요>>>");
//					break;
//				}
				System.out.println("삭제할 영화 이름을 입력하세요>>>");
				String delete = sc.next();
				mvMenu.delete(delete);
				break;
			case 7 :
				
				break out;
			}
				
			}while(true);

			System.out.println("프로그램 종료");
			sc.close();
			
			}

	

}

