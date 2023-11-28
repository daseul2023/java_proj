package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition2 {

	public static void main(String[] args) {
		        // arr : 배열 변수 String 값을 저장, 방의 갯수는 6개 , 방번호 : 0 ~ 5 
		
				//		arr[0] = "자바" , arr[1] = "html", arr[2] = "css"
				//		arr[3] = "JavaScript", arr[4] = "Oracle" , arr[5] = "Spring"
				
				// 출력 1 : 방번호를 직접 찍어서 출력 
				// 출력 2 : for 문을 사용해서 출력 
				// 출력 3 : Enhanced for 문을 사용해서 출력 
				// 출력 4 : Arrays.toString(arr)
				Scanner sc = new Scanner(System.in); 
				int selectNum ; 		// 스캐너로 정수 값을 받는 변수 
				
				// 배열 선언과 초기값 입력 : 
				String[] arr = new String[6];  // 0 ~ 5 
				
				arr[0] = "자바" ; arr[1] = "html"; arr[2] = "css" ;
				arr[3] = "JavaScript" ; arr[4] = "Oracle" ; arr[5] = "Spring" ; 			
				
				do {
					
					System.out.println("========================================================");
					System.out.println(" 1 : 방번호를 직접 찍어서 출력");
					System.out.println(" 2 : for 문을 사용해서 출력");
					System.out.println(" 3 : Enhanced for 문을 사용해서 출력");
					System.out.println(" 4 : Arrays.toString(arr)");
					System.out.println(" 5 : 프로그램 종료 ");
					System.out.println("========================================================");
					System.out.println("위의 번호를 입력 하세요 >>>>");
					
					selectNum = sc.nextInt();    
					
					if (selectNum == 1) {
						System.out.println("출력 1 : 방번호를 직접 찍어서 출력");
						System.out.println("================================");
						System.out.println(arr[0]);
						System.out.println(arr[1]);
						System.out.println(arr[2]);
						System.out.println(arr[3]);
						System.out.println(arr[4]);
						System.out.println(arr[5]);			
						
					} else if (selectNum == 2) {
						System.out.println("출력 2 : for 문을 사용해서 출력");
						System.out.println("===============================");
						for ( int i = 0 ; i < arr.length; i++) {
							System.out.println(arr[i]);
						}
						
					} else if (selectNum == 3) {
						System.out.println("출력 3 : Enhanced for 문을 사용해서 출력");
						System.out.println("=====================================");
						for ( String k : arr) {
							System.out.println(k);
						}
						
					}else if ( selectNum == 4 ) {
						System.out.println("출력 4 : Arrays.toString(arr)");
						System.out.println("==============================");
						System.out.println(Arrays.toString(arr));
						
					}else if ( selectNum == 5 ) {
						System.out.println("프로그램을 종료 ");
						break; 
					}
					
					
				}while ( true ); 

	}

}
