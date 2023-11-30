package chap17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ctrl + shift + o   <-- 자동 import

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		     배열 :
		         - 하나의 변수에 많은 값을 저장 : 방번호가 있다. index 0 ~~
		         - 동일한 타입의 자료를 저장할 수 있다. 기본자료형, 참조자료형
		             int[] arr1 = new int[50] ;
		             Student[] arr2 = new Student[50];
		         - 단점 :
                       - 배열의 중간에 값을 삭제할 경우 자동으로 당겨지고 늘어나지 않는다. 
                       - 배열의 방의 크기가 지정되면 수정이 불가능하다.
                       - 새로운 배열의 방크기를 지정하고 기존 배열의 값을 이동해야함.  
		     
		     컬렉션 (프레임워크) : 배열의 단점을 보완해서 만든 클래스
		         - List (인터페이스) : ArrayList, LinkedList, Vector
		              <메소드 선언>  : <메소드 구현>
		         - Set (인터페이스)  : HashSet, LinkedHashSet, TreeSet
		             -- 중복된 값을 넣지 못하도록 만듦.
		         - Map (인터페이스)  : HashMap ....
		         
		         - 하나의 변수에 많은 값을 저장
		         
		         - 장점 : 값을 넣으면 무한히 저장할 수 있다. <--- 방크기를 선언하지 않는다.
		               - 중간에 값을 삭제하면 자동으로 당겨진다. 중간에 값을 넣었을 경우 자동으로 이동이 된다.
		               - 제너릭 타입으로 타입을 지정함.   < >
		 */
		
		// 배열 
		
		String[] arr1 = new String[] { "가", "나", "다", "라", "마", "바", "사" };
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " , ");
		}
		System.out.println();
		System.out.println(arr1.length);
		
		// 특정 방의 값을 삭제 <-- 자동으로 줄어들지 않는다. 방크기도 줄어들지 않는다.
		arr1[2] = null ;
		arr1[3] = null ;
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);
		
		// 컬렉션 : ArrayList   
		// 1. ArrayList 선언 : 
		       // List : 인터페이스 <--- 메소드를 선언
		       // ArrayList : List 인터페이스를 구현한 구현체 <-- 선언만 된 메소드를 구현한 구현체
		       // import 가 필요함.
		List<String> aList = new ArrayList<String>();
		
		List<String> aList2 = new ArrayList<>();           // List<String> 만 집어 넣을 수 있음.
		
		ArrayList<String> aList3 = new ArrayList <>();
		
		// ArrayList : 메소드를 사용해서 값을 넣고 삭제
		// aList.size()   : 방의 갯수를 출력
		// aList.add("가") , aList.add("나")     <-- 값을 넣을 때 
		// aList.remove("나")                   <-- 값을 삭제할 때
		// aList.get(index);
		
		// 방의 크기를 출력
		System.out.println(aList.size());           // 현재 방의 갯수는 0
		
		// 값을 입력
		aList.add("가");                             // 방의 마지막 방에 추가
		System.out.println(aList.size());           // 현재 방의 갯수는 1
		
		// 방의 값을 출력
		System.out.println(aList);           // 컬렉션은 toString() 가 Overriding 되어있다.
		
		// 값을 더 입력
		aList.add("나"); aList.add("다"); aList.add("라"); 
		aList.add("마"); aList.add("바"); aList.add("사");
		
		// 출력 : 객체 자체를 출력
		System.out.println(aList);
		System.out.println(aList.size());
		
		// 중간에 값을 넣기   <-- 방의 크기를 자동으로 늘리고 값을 넣음.
		aList.add(3, "안녕");      // index 3, "안녕"
		System.out.println(aList);
		System.out.println(aList.size());
		
		// 중간에 값 삭제하기
		aList.remove(3);         // index 3, "안녕" 삭제하면 뒤에 있는 값이 자동으로 당겨와짐. 자동으로 최적화 됨.
		System.out.println(aList);
		System.out.println(aList.size());
		
		aList.remove("라");      // "라" 문자를 삭제
		System.out.println(aList);
		System.out.println(aList.size());
		
		// 특정 방의 내용을 출력 : aList.get(index);
		System.out.println("=====================");
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		// 배열의 모든 값 출력 : Arrays.toString(arr);
		// 컬렉션은 객체 자체를 출력 : toString() 메소드가 재정의 됨.
		System.out.println(aList);
		
		System.out.println("=====================");
		
		// 랩퍼 클래스 : 기본자료형을 객체형으로 만들어 놓은 클래스
		// boolean (기본자료형)   --> Boolean (객체)
		// byte (기본자료형)      --> Byte (객체)
		// short (기본자료형)     --> Short (객체)
		// int (기본자료형) 	   --> Integer (객체)
		// double (기본자료형)    --> Double (객체)
		// long (기본자료형)      --> Long (객체)
		// char (기본자료형)      --> Character (객체)
		
		List<Integer> aList4 = new ArrayList<>();         // int 를 넣으면 안 됨!!! Integer 를 넣어줘야 함.
		
		for (int i= 0, a=0; i<100; i++) {
			a += 10;
			aList4.add(a);
		}
		System.out.println("=====================");
		
		for (int i=0; i < aList4.size(); i++) {
			System.out.println(aList4.get(i));
		}

		
		
		
		

	}

}
