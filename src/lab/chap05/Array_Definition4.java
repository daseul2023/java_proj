package lab.chap05;

import java.util.Arrays;

public class Array_Definition4 {

	public static void main(String[] args) {
		/*
		     변수 : 1개의 값만 저장. Stack : 변수명, 변수값, == <-- 기본 자료형을 사용
		     배열 : 여러개의 값을 한꺼번에 저장. <--참조 자료형을 사용, Stack : 변수명, 참조주소, Heap : 값
		              equals() <-- Heap에 있는 값을 equals를 사용
		              초기값 : 정수 : 0, 실수 : 0.0, boolean : false가 자동으로 들어간다.
		 */
		
		int a ;   // 변수
		
		int [] b = new int[10];  // 배열 선언, Heap 공간에는 초기값이 반드시 들어가야 한다.
		           // index : 0 ~ 9
		
	//	System.out.println(a);   // 변수기 때문에 초기값을 반드시 넣어야 사용할 수 있음.
		System.out.println(b[0]);
		
		// b 배열에 값을 할당.
		b[0] = 3;
		b[1] = 6;
		b[9] = 10;
		
		// 배열의 각 방의 내용을 출력
		System.out.println(b[9]);
		
		// for 문을 사용해서 배열의 0번째 방 ~ 9번째 방
		for(int i =0; i <10; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println(b.length);  // 배열 방의 갯수
		System.out.println("==========for============");
		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// Enhanced for : 배열의 0 ~ 마지막 방까지 모두 출력
		System.out.println("=======Enhanced For========");
		for(int k : b) {
			System.out.println(k);
		}
		
		// Arrays.toString (배열변수)
		System.out.println("=======Arrays.toString(b)======");
		
		System.out.println(Arrays.toString(b));
		

	}

}
