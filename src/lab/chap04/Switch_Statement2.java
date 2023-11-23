package lab.chap04;

import java.util.Scanner;

public class Switch_Statement2 {

		public static void main(String[] args) {
	          /*
	              switch ~ case 문으로 프로그램을 작성
	              월을 입력해서 해당 월은 00일입니다.
	              
	              31일이 출력되는 월 : 1, 3, 5, 7, 8, 10, 12
	              30일이 출력되는 달 : 4, 6, 9, 11
	              28일이 출력되는 달 : 2
	              
	              스캐너로 달을 입력받고, 해당 달에 대한 일을 출력해라.
	                  출력 내용 : "해당 월은 00월이고, 00일까지 존재합니다."
	           */
			
			// 내가 한 실습
			int month ;         // 스캐너로 input을 받습니다.
			int day = 30;       // 
			
			Scanner sc = new Scanner(System.in);
		//	    System.out.println("해당 달을 입력하세요.>>>");
		//	    month = sc.nextInt();
		//	    System.out.println("해당 일을 입력하세요.>>>");
		//	    day = sc.nextInt();
			    
		//	    switch (day) {
		//	    case 31 : 
		//	    	System.out.println("해당 월은 " + month + "월이고, 31일까지 존재합니다.");
		//	    	break;
		//		case 30 : 
		//		    	System.out.println("해당 월은 " + month + "월이고, 30일까지 존재합니다.");
		//		    	break;
		//		case 28 : 
		//	    	System.out.println("해당 월은 " + month + "월이고, 28일까지 존재합니다.");
		//	    	break;
		//	    default :
		//	    	System.out.println("잘못 입력했습니다.");
		//	    }
			   
			    
			    // 선생님이 한 실습
			    //Scanner sc = new Scanner(System.in);
			    
			    System.out.println("(1월 ~ 12월)사이의 정수를 입력하세요.>>>");
			    month = sc.nextInt();
			    
			    switch (month) {
			    case 1 : case 3 : case 5 : case 7 : case 8: case 10: case 12:
			    	day += 1 ;  // day = day + 1 ;
			    	System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다. \n\n", month, day);
			    	break;
			    case 2 : 
			    	day -= 2 ;  // day = day -2 ;
			    	System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다. \n\n", month, day);
			    	break;
			    default :       // 4, 6, 9, 11
			    	System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다. \n\n", month, day);
			    }
		
		
			

	}

}
