package chap05.ex08;

import java.util.Arrays;

public class NonRactangle_Array {

	public static void main(String[] args) {
		// 2차원 배열 : 비정방형 배열 : 행에 대해서 열의 갯수가 다른 배열
		
		// 1. 비정방형 배열 선언 (행만 정의)
		int [][] arr = new int [3][];  // 행만 정의, 3 행만 넣고 열은 정의하지 않음.
		
		// 2. 행에 대한 열의 방의 크기를 지정
		arr[0] = new int[2];           // 0번 행의 열의 갯수 정의, 2
		arr[1] = new int[3];           // 1번 행의 열의 갯수 정의, 3
		arr[2] = new int[5];           // 2번 행의 열의 갯수 정의, 5
		
		// 3. Arrays.toString() 으로 출력
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

	}

}
