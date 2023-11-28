package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {

	public static void main(String[] args) {
		/*
		      	for, 이중 for, if 연산자 ( ==, !=, ||. &&)
		      	arr : 배열 변수명, 2차원 배열, [5] [10], 행은 5행, 10열
		        arr[0] : 짝수만 저장
		        arr[1] : 홀수만 저장, 3의 배수는 빼고 저장.
		        arr[2] : 4, 5의 배수를 저장
		        arr[3] : 10의 배수 저장
		        arr[4] : 8단을 입력값 입력
		        
		        // for 문으로 출력
		        // enhanced for 문
		        // Arrays.toString () 으로 출력
		 */
		
		//내가 한 실습
		int [][] arr = new int [5][10];
		
		for (int i=0; i<arr.length; i++) {      // i는 행
			if (i==0) {       // 짝수만 저장
				int a =2;
				for(int j=0; j<arr[i].length; a++) {   // j는 열
					
					if(a%2==0) {
						arr[i][j] = a;
						j++;
					}
				}
				
		}else if (i==1) {                      // 홀수만 저장, 3의 배수는 빼고 저장.
			int a = 0;
			for(int j=0; j<arr[i].length; a++) {
		
			if (a%1 == 0) {
				if (a%3 != 0 && a%2 !=0) {
					arr[i][j] = a;
					j++;
				}		
				}
				
			}
				
		}else if (i==2) {                     // 4, 5의 배수를 저장
			int a = 1;
			for(int j=0; j<arr[i].length; a++) {
				if (a%4 == 0 || a%5 == 0) {
					arr[i][j] = a;
					j++;
				}
			}
			
		}else if (i==3) {                    // 10의 배수 저장
			int a = 10;
			for(int j=0; j < arr[i].length; a+=10) {
				if(a%10==0) {
					arr[i][j] = a;
					j++;
				}
			}
			
		}else if (i==4) {                    // 8단을 입력값 입력
			int a = 8;
			for(int j=0; j<arr[i].length; a+=8) {
				if(a%8 == 0) {
					arr[i][j] = a;
					j++;
				}
			}
			
		}

		}
		// for 문으로 출력
        // enhanced for 문
        // Arrays.toString () 으로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		// 선생님이 한 실습
		// 1. 배열 선언
		int[][] arr1 = new int[5][10];
		
		System.out.println(arr1.length);             // arr은 2차원 배열 : 행의 갯수
		System.out.println(arr1[0].length);          // arr[0] 의 열의 갯수
		
		
		// 2. 값을 입력 : 이중 for [바깥쪽 for : 행을 이동, 안쪽 for : 열을 이동]
		for (int i=0; i < arr1.length; i++) {        // i :행의 번호
			if(i==0) {                              // 짝수만 저장
				int a=2;
				for (int j=0; j<arr1[i].length; j++) {
					arr1[i][j] = a;
					a+=2;

				}
			}else if (i==1) {                      // 홀수만 저장, 3의 배수는 빼고 저장.
				int a = 1;
				for(int j=0; j<arr1[i].length; a++) {
					if(a%2 == 1) {                 // 혹은 a % 2 !=0 이렇게 처리해도 홀수 처리됨.
						if (a%3 !=0) {             // 3의 배수가 아닐 때
							// 홀수이면서 3의 배수가 아닐 때 실행 블락
							arr1[i][j]= a;	
							j++;
							

						}
					}
					
					
				}
				
			}else if (i==2) {                     // 4, 5의 배수를 저장
				int a=1;                          // 값을 저장하는 변수
				for (int j=0; j<arr1[i].length; a++) {
					if(a%4==0 || a%5==0) {
						// 4의 배수이거나 5의 배수이면 실행
						arr1[i][j] = a;
						j++;                      // 방에 값을 넣어야 방 번호 증가
						

					}
				}
				
			}else if (i==3) {                     // 10의 배수 저장
				int a =1;
				for(int j=0; j<arr1[i].length; a++) {
					if (a% 10==0) {
						arr1[i][j] = a;
						j++;
					}
				}
				
			}else if (i==4) {                      // 8단을 입력값 입력
				int a=8;
				for(int j=0; j<arr1[i].length; j++) {
					arr1[i][j] = a;
					a+=8;
				}
			}
	  }
		
		
		
		
		System.out.println("=======================");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		System.out.println(Arrays.toString(arr1[3]));
		System.out.println(Arrays.toString(arr1[4]));
		
		// for 문을 사용해서 2차원 배열의 각 방의 내용을 출력
		System.out.println("=====for 문으로 출력======");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
				System.out.print("\t");
				
			}
			System.out.println();
		}
		System.out.println("===Enhanced For 문으로 출력====");{
			for(int[] a : arr1) {
				System.out.println(Arrays.toString(a));
					
				}
			System.out.println("===Enhanced For 문으로 출력2====");{
				for (int [] a : arr1) {
					for (int b : a) {
						System.out.print(b);
						System.out.print("\t");
					}
					System.out.println();
				}
			}
		}
	}
}

