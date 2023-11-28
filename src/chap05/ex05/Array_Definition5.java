package chap05.ex05;

public class Array_Definition5 {

	public static void main(String[] args) {
		/*
		    기본 데이터 타입(8가지) 변수명 vs 참조 데이터 타입[] 참조 변수명
		 */
		
		// 1. 기본 데이터 타입에서 대입 연산 ( = ) : stack의 값을 복사
		int val1 = 3;
		int val2 = val1;  // = : Stack에 저장된 값을 대입
		val2 = 7;
		
		System.out.println(val1);   // 3
		System.out.println(val2);   // 3 -> 7
		
		// 2. 참조 데이터 타입에서 대입 연산 ( = ) : stack의 Heap의 주소를 복사
		System.out.println("======================");
		int [] arr1 = new int[] {3,4,5};       // 배열 선언과 동시에 값 할당.
		int [] arr2 = arr1;  // arr2 에는 arr1의 참조 주소가 복사
		
		System.out.println(arr1);   // (arr1)객체 Heap의 주소가 출력됨. I@515f550a
		System.out.println(arr2);   // Heap의 주소가 출력됨. I@515f550a
		
		arr1[0] = 7;
		
		System.out.println(arr1[0]);   // 3 ->7
		System.out.println(arr2[0]);   // 3 ->7
		

	}

}
