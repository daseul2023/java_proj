package chap05.ex02;

public class Array_Definition2 {

	public static void main(String[] args) {
		// 배열 : 방의 갯수를 선언 해야함. 방의 갯수를 수정 할 수 없다. 
		// 배열 방에 들어갈 자료형을 선언 해야 함. 

		//실수 배열 
		double[] arr1 = new double[10];     // 방 번호(index) : 0 ~ 9 
		
		//초기 값이 없는 상태에서 출력  : 0.0 자동으로 들어감. 
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		System.out.println(arr1[7]);
		System.out.println(arr1[8]);
		System.out.println(arr1[9]);
		//System.out.println(arr1[10]);       // 런타임 오류 발생류 : 실행시 오류 발생 
		
		// 2. 배열의 각 방에 값을 넣음 
		arr1[0] = 10.1; 
		arr1[1] = 11.1; 
		arr1[2] = 12.1; 
		arr1[3] = 13.1; 
		arr1[4] = 14.1; 
		arr1[5] = 15.1; 
		arr1[6] = 16.1; 
		arr1[7] = 17.1; 
		arr1[8] = 18.1; 
		arr1[9] = 19.1; 
		
		// 3. 출력 : 
		System.out.println(arr1[6]);     // arr1[0]   : arr1[방번호] 
		
			//배열의 값을 입력 / 출력 for 문을 사용해서 입력 하고 출력함. 
		System.out.println("== For 문을 사용해서 출력 ==");
		
		for (int i = 0 ; i < 10 ; i++) {	// i : index 방번호 
			System.out.println(arr1[i]);
		}
		
		// arr1.length     : 배열의 방의 갯수를 출력 
		System.out.println(arr1.length);        //배열의 방의 갯수를 출력 
		
		System.out.println("==== for 출력 : arr1.length ===를 사용해서 출력 =====");
		for ( int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("===============================================");
		
		// 배열 arr2 선언 : 100개의 정수 할당. 
		int[] arr2 = new int[100];       // arr2 : 배열 , 0 ~ 99번 방까지 , 100개의 정수를 넣을 수 있음. 
		
		//for 문을 사용해서 배열의 각 방에 값을 입력 
		for ( int i = 0 , j = 1 ; i < arr2.length ; i++) {    // for 문을 사용해서 0 
		//	int j = 1; 			//  초기화시 루프를 돌때 마다 초기화됨 
			
			arr2[i] = j; 
			j++; 
		}
		
		System.out.println("=======for 문을 사용해서 출력 ========");
		// for 문을 사용해서 각방의 내용을 출력 
		for ( int i =0 ; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		//문자열 배열 

	}

}
