package lab.chap05;

import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) {
		/*
	 	1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 7의 배수와 8의 배수를 저장후 출력 
	 	2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력 
	 	3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 	 	
	    */
	
	   // 배열, 제어문 ( for, do ~ while, 연산자 ( || ,  != (같지않다)  , == (같다) ) 
	
		// 1. Scanner 선언 
		Scanner sc = new Scanner(System.in);  //콘솔로 값을 인풋 
		
		// 내부 블락에서 사용할 변수 선언 
		// 배열 변수 , 스캐너로 선택하는 변수 , 배열의 방의 크기를 스캐너로 받는 변수 
//		int[] arr1 = new int[50] ; 
		
		int[] arr ;     	// 배열 변수만 선언 
//		arr = new int[50]; 	// 배열의 방의 크기를 나중에 선언 
		
		int n ; 		// 출력을 선택 하는 변수 : scanner 로 콘솔로 인풋 
		int idx ; 		// 배열의 방의 크기를 지정하는 변수 
		
		
		do {
			System.out.println("====================================================");
			System.out.println("1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 7의 배수와 8의 배수를 저장후 출력 ");
			System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력 출력 ");
			System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 ");
			System.out.println("4. 프로그램 종료  ");
			System.out.println("====================================================");
			System.out.println("위의 내용을 선택 하세요 >>>>>>");
			n = sc.nextInt(); 
			
			if ( n == 1) {
				System.out.println("1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 7의 배수와 8의 배수를 저장후 출력 ");
			
				System.out.println("배열 방의 크기를 정수로 넣으세요 >>>>> ");
				idx = sc.nextInt(); 
				
				arr = new int[idx] ; 
				
				System.out.println("입력된 배열 방의 크기는 : " + arr.length);   //스케너로 입력 받아서 방크기 지정
				
				int a = 1 ; 	// 방에 값을 넣는 변수 
				// 각 배열 방에 7의 배수와 8의 배수를 입력 
				for ( int i = 0 ;  ; a++) {		//조건이 공백이면 무한루프  
													// i = 방번호 , a = 값 ( 7 의 배수, 8의 배수 ) 					 
					if ( i == idx ) {break; }
					
					if ( a % 7 == 0 || a % 8 == 0 ) {   // a 가 7의 배수 나 8의 배수일때 
						arr[i] = a; 					// arr[i] 
						i++ ;                          // 7의 배수나 8의 배수의 값이 등록 되었을때 방번호 증가 
					} 
									
				}
				// 각 배열의 방에 내용을 출력 : 
				for ( int i = 0 ; i < arr.length; i++) {
					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
				}
				
				
			
			}else if (n == 2) {
				System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력 출력 ");
				System.out.println("방의 크기를 정수 값으로 넣으세요 >>>>>>>> ");
				idx = sc.nextInt(); 
				
				arr = new int[idx] ;  // 배열 방의 크기를 스캐너로 입력 받아서 처리함. 
				
				// 1, 2, 3, 5, 6, 7, 9, 10, 11...... 
				// 배열 방에 값넣기 : for 문을 사용 
				
				int a = 1 ;  
				for ( int i = 0 ; i < arr.length ; a++  ) {       // i : 방번호 , a : 값 
					
					if ( a % 4 == 0 ) { continue ; }  // a 변수의 값이 4의 배수일때는 아래 내용을 싱행 하지 않는다. 
					
					arr[i] = a ; 
					i++; 
										
				}
				
				// 각 방의 내용을 for  문을 사용해서 출력 
				for ( int i = 0 ; i < arr.length  ; i ++) {
					System.out.println("방번호 : " + i + " , 방의 값 : " + arr[i]);
				}
							
			}else if (n == 3) {				
				System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 ");
				System.out.println("방의 크기를 정수로 입력 하세요 >>>> ");
				idx = sc.nextInt(); 
				
				arr = new int[idx] ;    // 배열 방의 크기를 스캐너로 입력 받아서 지정 
				
				// 배열의 각 방에 값을 넣음. for 
				// 3,  9 , 15,  
				
				int a = 1 ; 
				for ( int i = 0 ; i < arr.length ; a++  ) {     // i : 방번호 는 값이 들어갔을때만 방번호가 늘어야 한다. 
				
					if ( a % 3 == 0 ) {   // a의 값이 3의 배수  <<==  3, 6배수 
						if (a % 6 != 0 ) {   // 6의 배수가 아닐때 true 
							// 3의 배수이면서 6의 배수가 아닌것이 실행 
							arr [i] = a ;      // 
							i ++; 				//값이 들어갈때 방번호 증가 														
						}						
					}				
				}
				// 배열의 각 방에 값을 출력 하는 for 
				for (int i = 0 ; i < arr.length ; i++) {
					System.out.println("방번호 : " + i + " , 값 : " + arr[i]);
				}
				
			
			
			}else if (n == 4) {
				System.out.println("4. 프로그램 종료  ");
				break; 
			}
			
			
		} while ( true );
		
		System.out.println("도달 할 수 없는 코드 -- ");   // 반복문에서 빠져나와야 도달 할 수 있는 코드 
		

	}

}
