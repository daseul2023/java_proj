package chap10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) {
		/*
		      Method Overriding :        <-- 인스턴스 메소드만 Overriding
		         - 정적 메소드 : 메소드명 앞에 static 키가 붙는 메소드명, 객체 생성없이 클래스명.메소드명으로 호출됨.
		         - 인스턴스 메소드 : 메소드명 앞에 static 키가 붙지않는 메소드.
		                         객체화해서 호출이 가능함.
		         - 상속 관계에서 적용 가능
		         - 부모에서 선언된 인스턴스 메소드를 자식에서 재정의해서 사용하는 것.
		         - 다형성  <-- 자식을 객체화 --> 부모 타입으로 선언 후 부모의 메소드를 호출 시
		               자식의 Overriding 된 메소드가 작동함...     
		               - 부모의 메소드 호출 시 자식의 오버라이딩된 메소드가 작동           
		                         
		 */
		
		// 1. 객체 생성 : Animal
		Animal a1 = new Animal();
		
		// 인스턴스 필드
		a1.name = "동물";
		a1.age =10;
		
		// 정적 필드 
		a1.color = "빨강";
		
		// 인스턴스 메소드
		a1.cry();
		
		// 정적 메소드
		a1.eat();
		
		// 2. 객체 생성없이 클래스명으로 필드, 메소드 호출  <-- static 필드, static 메소드
		
		Animal.color = "노랑";
		Animal.eat();
		
		System.out.println("==========================");
		
		Animal a2 = new Animal();
		
		a2.cry();
		
		// Dog 객체화해서 Animal 타입으로 지정 : a3 : Animal, Dog
		Animal a3 = new Dog();
		a3.cry();                  // Animal 의 cry() 를 호출 시 Dog 의 cry()를 호출함.   <-- 다형성
		
		// Eagle 을 객체화해서 Animal 타입으로 지정
		Animal a4 = new Eagle();
		a4.cry();                  // Animal 의 cry() 를 호출 시 Eagle 의 cry()가 작동됨
		
		// Lion 을 객체화해서 Animal 타입으로 지정
		Animal a5 = new Lion();
		a5.cry();                  // Animal 의 cry() 를 호출 시 Lion 의 cry()가 작동됨
		

	}

}
