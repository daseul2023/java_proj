package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) {
		/*
		     // 배열 :       arr         : 100 번 방, 10의 배수만 저장 후 출력  <-- for 문 사용, Arrays.toString
		             // 
		     // 컬렉션 :      aList       : 100 번 방, 20의 배수만 저장 후 출력  <-- for 문 사용 
		 */
		
		// 내가 한 실습
		// 배열
//		int[] arr = new int [100];
//		
//		int a = 10;
//		for (int i=0; i < arr.length; a++) {
//			if (a % 10==0) {
//				arr[i] = a;
//				
//			}
//		}
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		// 컬렉션
		System.out.println("=============================");
//		List<Integer> aList = new ArrayList<>();
		
//		for (int i=0; i < 100; i++ ) {
//			a += 20;
//			aList.add(a);
//			}
//			for (int i=0; i< aList.size(); i++) {
//				System.out.println(aList.get(i));
//			}
//				
		// 선생님이 한 실습
				
		// 배열 : 참조자료형
		    // 1. 자료형 [] 변수 = new 자료형 [방갯수];
			int [] arr1 = new int[100];        // index : 0 ~ 99
				
			// 배열 각 방에 값을 넣기
			for (int i = 0, b=0; i <arr1.length; i++) {
				b +=10;
				arr1[i] = b;
			}
		
			// 출력
			for (int i=0; i<arr1.length; i++) {
				System.out.print(arr1[i] + ",");
			}
			System.out.println();
			for (int k: arr1) {
				System.out.print(k + ",");
			}
			System.out.println();                           // 얘가 없으면 밑에 Arrays.toString이 작동하지 않음
			System.out.println(Arrays.toString(arr1));
			
			
			// 컬렉션 : ArrayList , 자동으로 방 크기가 늘어나고 줄어든다. 제너릭 타입으로 선언 : <Integer>
			      // import 해서 사용
			      // ArrayList 선언
			      // 메소드를 사용해서 값을 넣고, 삭제, 출력
			      // aList.add(값)           // 마지막 방에 값을 추가
			      // aList.add(index, 값)    // index 방번호에 값을 넣음
			      // aList.size()           // 방의 갯수
			      // aList.remove(index), aList.remove(값)  // 삭제
			      // aList.get(index)       // index 의 값을 출력
			
			List <Integer> aList = new ArrayList <>();              // 
			ArrayList<Integer> aList2 = new ArrayList<>();
			
			System.out.println(aList.size());
			
			for (int i=0, a=0; i<100; i++) {
				a+= 20;
				aList.add(a);            // 마지막 방에 값을 저장함.
			}
			
			// 각 방에 내용을 출력
			System.out.println("컬렉션의 방의 크기 : " + aList.size());
			for (int i=0; i<aList.size(); i++) {
				System.out.print(aList.get(i) + ", ");                    // i 번째 방의 값을 출력
				
			}
			System.out.println();                                         // aList 만 적용시키려면 공백이 반드시 필요함!!!
			
			System.out.println(aList);
			
			
			
			
		}
	       
	}


