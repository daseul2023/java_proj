package lab.chap04;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		
		/*
		      // if ~ else if, .equals("월요일")
		       
		      콘솔에서 "월요일" 입력됐을 때 출력 "월요일은 자바를 공부합니다."
		      콘솔에서 "화요일" 입력됐을 때 출력 "화요일은 데이터베이스를 공부합니다."
		      콘솔에서 "수요일" 입력됐을 때 출력 "수요일은 html javascript를 공부합니다."
		      콘솔에서 "목요일" 입력됐을 때 출력 "목요일은 JSP를 공부합니다."
		      콘솔에서 "금요일" 입력됐을 때 출력 "금요일은 Spring을 공부합니다."
		      콘솔에서 "토요일" 입력됐을 때 출력 "토요일은 운동을 합니다."
		      콘솔에서 "일요일" 입력됐을 때 출력 "일요일은 TV를 시청 합니다."
		      콘솔에서 "그 외의 값이 입력 시" 입력됐을 때 출력 "잘못 입력 했습니다. 요일을 입력하세요."
		 */
		 
	             // 내가 실습한 것	
		         Scanner sc =new Scanner(System.in);
		         String str;
		         System.out.println("요일을 입력하세요.>>>");
		         str = sc.next();
		         
		         if ( str.equals("월요일") ) {
		        	 System.out.println("자바를 공부합니다. ");
			     }else if (str.equals("화요일")){
			    	 System.out.println("데이터베이스를 공부합니다. ");
			     }else if (str.equals("수요일")){
			    	 System.out.println("html javascript를 공부합니다. ");	
			     }else if (str.equals("목요일")){
			    	 System.out.println("JSP를 공부합니다. ");
			     }else if (str.equals("금요일")){
			     	 System.out.println("Spring을 공부합니다. ");
			     }else if (str.equals("토요일")) {
			         System.out.println("운동을 합니다. ");
			     }else if (str.equals("일요일")) {
			    	 System.out.println("TV를 시청 합니다. ");
		         }else {
		        	 System.out.println("잘못 입력 했습니다. 요일을 입력하세요. ");
		         }
		         
		         // 선생님이 실습한 것
		         
		         // 1. Scanner Import
		         // Scanner sc (변수명이라서 아무거나 와도 됨) = new Scanner(System.in);
		         String str1;
		         
		         // 2. 콘솔에서 입력 받아서 변수에 할당
		         System.out.println("요일을 한글로 입력하세요. 예) 월요일>>>");
		         str1 = sc.next();
		         
		         // 3. if ~ else if 문을 사용해서 처리
		         if (str1.equals("월요일")) {          //월요일
		        	 System.out.println(str1 + "은 자바를 공부합니다.");
		        	 System.out.println("월요일 출력입니다. ");
		         }else if (str1.equals("화요일")){
		        	 System.out.println(str1 + "은 데이터베이스를 공부합니다.");
		         }else if (str1.equals("수요일")){
		        	 System.out.println(str1 + "은 html javascript를 공부합니다.");
		         }else if (str1.equals("목요일")){
		        	 System.out.println(str1 + "은 JSP를 공부합니다.");
		         }else if (str1.equals("금요일")){
		        	 System.out.println(str1 + "은 Spring을 공부합니다.");
		         }else if (str1.equals("토요일")){
		        	 System.out.println(str1 + "은 운동을 합니다.");
		         }else if (str1.equals("일요일")){
		        	 System.out.println(str1 + "은 TV를 시청 합니다.");
		         }else {
		        	 System.out.println(str1 + "잘못 입력 했습니다. 요일을 입력하세요.");
		         }
	

	}

}
