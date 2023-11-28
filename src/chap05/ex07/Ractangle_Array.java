package chap05.ex07;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
				/*
				     2차원 배열 선언 방법 4가지
				 */
				
				// 1. 가장 많이 사용 
				int [][] arr1 = new int[3][4];    // 선언과 동시에 방의 크기 할당.
				
				int [][] arr2;                    // 선언
				arr2 = new int [3][4];            // 방 크기는 나중에 할당.
				
				// 2. 배열 변수에 [][]
				int arr3[][] = new int[3][4];
				
				int arr4[][];
				arr4 = new int[3][4];
				
				
				// 3. 배열 변수 선언 시 값을 바로 할당 : 방 크기를 지정하면 오류 발생 (주의!)
				int[][] arr5 = new int[][] { {1,2,3,4,5}, {10,20,30,40,50}, {100, 200, 300, 400, 500}};
				
				System.out.println(arr5[2][2]);    // 300
				System.out.println(arr5[1][4]);    // 50
				
				int[][] arr6;    // 선언
				arr6 = new int[][] {{1,2,3,4}, {11, 22, 33, 44}, {111,222,333,444}};
				
				System.out.println(arr6[0][2]);    // 3
				
				System.out.println(Arrays.toString(arr6[0]));
				System.out.println(Arrays.toString(arr6[1]));
				System.out.println(Arrays.toString(arr6[2]));
			//	System.out.println(Arrays.toString(arr6[3]));   // 배열의 방 번호[index] 를 넘김.
				
				// 4. 배열 변수 선언 시 값을 바로 할당 (new int[][] 생략 사용)
				     // 주의 : 선언과 값을 분리할 수 없다. 오류 발생
				
				int [][] arr7 = {{1,2,3},{11,22,33},{111, 222, 333}};
				
				int[][] arr8;
			//	arr8 = {{1,2,3},{11,22,33},{111, 222, 333}};            // 오류 발생
				arr8 = new int[][]{{1,2,3},{11,22,33},{111, 222, 333}};
				
	

	}

}
