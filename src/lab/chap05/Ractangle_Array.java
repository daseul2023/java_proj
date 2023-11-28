package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
		   // 1. 선언
		     arr[3][10] : 행의 방번호 : 0 ~ 2, 방의 갯수 : 3, arr.length
		                  열의 방번호 : 0 ~ 9, 방의 갯수 : 10, arr[0].length
		     
		   // 2. 배열 방에 값을 저장  
		       < 2중 for 문을 사용해서 값을 저장 >
		                  0번 행에는 1부터 시작해서 1씩 증가
		                  1번 행에는 3의 배수를 저장
		                  2번 행에는 7의 배수, 8의 배수 저장
		   // 3. 출력               
		       2중 for 문을 사용해서 출력
		       Enhanced for 문을 사용해서 출력
		       Arrays.toString () 으로 출력 <---- 1차원 배열을 출력      
		 */
		
		
		// 내가 한 실습
//		int arr[][] = new int[3][10];
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
//		arr[0][5] = 6;
//		arr[0][6] = 7;
//		arr[0][7] = 8;
//		arr[0][8] = 9;
//		arr[0][9] = 10;
//		
//		arr[1][0] = 1;
//		arr[1][1] = 2;
//		arr[1][2] = 3;
//		arr[1][3] = 4;
//		arr[1][4] = 5;
//		arr[1][5] = 6;
//		arr[1][6] = 7;
//		arr[1][7] = 8;
//		arr[1][8] = 9;
//		arr[1][9] = 10;
//		
//		arr[2][0] = 1;
//		arr[2][1] = 2;
//		arr[2][2] = 3;
//		arr[2][3] = 4;
//		arr[2][4] = 5;
//		arr[2][5] = 6;
//		arr[2][6] = 7;
//		arr[2][7] = 8;
//		arr[2][8] = 9;
//		arr[2][9] = 10;
		
//		    0번 행에는 1부터 시작해서 1씩 증가
//          1번 행에는 3의 배수를 저장
//          2번 행에는 7의 배수, 8의 배수 저장
		
//		do {
//			for(int i=0; i<arr.length; i++) {
//				for (int j=0; j<arr[i].length; j++) {
//					System.out.println("arr[" + i + "]" + "[" + j + "] = " + arr[i][j]);
//				
//				if (j % 3==0) {
//					System.out.println("arr[" + i + "]" + "[" + j + "] = " + arr[i][j]);
//					
//				}
//					
//				}
//			}
//			
//		}while(true);
		
		
//		for (int i=0; i < arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.println("arr[" + i + "]" + "[" + j + "] = " + arr[i][j]);{
//					
//				}for (int a=0; a<arr.length; a++) {
//					for(int b=0; b<arr[a].length; b++) {
//						if (b % 3 == 0) {
//							System.out.println("arr[" + a + "]" + "[" + j + "] = " + arr[a][b]);
//							b+=3;
//					}
//				}
//				
//				}
//				
//				
//			
//			{
//		
//						
//					
//						
//					}
//			}
//			System.out.println();
//		}
	
		
		//선생님이 한 실습
		
		// 1. 배열 선언
		int[][] arr = new int[3][10];
		
		System.out.println(arr.length);        // 행의 갯수 : 3
		System.out.println(arr[0].length);     // 열의 갯수 : 10
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		// 2. 이중 for 문을 사용해서 값을 입력
		
		System.out.println("=============2.값을 입력==============");
		for(int i=0; i<arr.length; i++) {      // 행을 반복 <-- 1차원 배열
		//	System.out.println("행의 방번호 : " +i);             // 0,1,2
		//	for (int j=0; j<arr[i].length; j++) {  // 열을 반복함.
				//		System.out.println("i : " + i + ", j : " + j);
						
				if ( i == 0 ) {
					// 배열의 각방에 1씩 증가한다.
					int a = 1;
					for (int j = 0; j<arr[i].length; j++) {
						arr[i][j] = a;
						a++;
					}
					
				}else if ( i == 1 ) {
					// 각 방에 3의 배수 저장
					int a =3;
					for (int j = 0; j<arr[i].length; j++) {
						arr[i][j] = a;
						a+=3;
						
					}
					
				}else if ( i == 2 ) {
					// 7, 8의 배수 저장
					int a=1;
					for (int j = 0; j<arr[i].length; a++) {
						if ( a % 7==0 || a % 8==0) {       // 7의 배수, 8의 배수
							arr[i][j] = a;
							j++;
						}
						
					}
				}
			}
			System.out.println("=========================");
			for(int i =0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
		
		
				
		
		

	}

}
