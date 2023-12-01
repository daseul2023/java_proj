package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {
		/*
		     1. 자식 객체를 생성 후 
		        Apple("사과", 30, 5000) Fruit 타입으로 정의
		        Banana("바나나", 44, 6000)
		        Strawberry("딸기", 55, 7000)
		        
		     2. ArrayList 객체 3개를 저장
		     
		     3. For 문으로 ArrayList의 객체를 끄집어내서 totalPrice() 호출 시 오버라이딩 된 메소드가 출력되게 하라.
		     4. 출력 : " 000 의 전체 가격 : 00 원 입니다.
		     
		     자식 객체를 생성하면서 부모 타입으로 지정하면, 배열이나 컬렉션에 동일한 타입으로 저장
		 */
		// 1. 자식 객체를 생성하면서 부모 타입으로 지정함.  <-- 배열, 컬렉션 안에 동일한 타입으로 저장
		
//		Fruit a = new Apple();
//		a.name = "사과";
//		a.cnt = 30;
//		a.price = 5000;
		
		Fruit a = new Apple("사과", 30, 5000);         // a : Fruit, Apple
		
		a.totalPrice();
		
//		Fruit b = new Banana();
//		b.name= "바나나";
//		b.cnt=44;
//		b.price=6000;
		
		Fruit b = new Banana("바나나", 44, 6000);       // b : Fruit, Banana
		
		b.totalPrice();
		
//		Fruit s = new Strawberry();
//		s.name="딸기";
//		s.cnt=55;
//		s.price=7000;
		
		Fruit s = new Strawberry("딸기", 55, 7000);     // s : Fruit, Strawberry
		
		s.totalPrice();
		
		Apple a1 =new Apple();                // Fruit 이 아닌 Apple 인 자식 객체를 넣었지만 자동으로 업캐스팅 된다.
		
		// 2. ArrayList<Fruit>
		System.out.println("=======================");
		List<Fruit> aList = new ArrayList<>();
		aList.add(a);
		aList.add(b);
		aList.add(s);
		aList.add(a1);                // 자동으로 업캐스팅 이 이루어져 저장됨.
		
		// 3. aList의 각 방의 저장된 객체를 끄집어내서 출력
		
		for (int i=0; i<aList.size(); i++) {
			aList.get(i).totalPrice();
		}
		
		// 자바의 꽃 : 상속을 사용한 다형성
		// 다형성 : 상속, 부모의 메소드를 출력 시 자식의 오버라이딩 된 메소드를 출력
		
	}

}
