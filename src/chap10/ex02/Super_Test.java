package chap10.ex02;

class A {             // 부모 클래스
	
	A(){
		System.out.println("A 클래스의 기본 생성자 1");
	}
	A(int a){
		System.out.println("A 클래스의 인풋 1개 정수 - 생성자");
	}
	A(String a, int b){
		System.out.println("A 클래스의 인풋 2개 - 문자열, 정수");
	}
}


class B extends A {
	B(){
		System.out.println("B 클래스의 기본 생성자");
		}
	B(int a){
		super(1);
		System.out.println("B 클래스의 인풋 1개 - 정수");
		}
	
	B(String a, int b){
		System.out.println("B 클래스의 인풋 2개 - 문자열, 정수");
		}
}

class C extends B {
	C(){
		System.out.println("C 클래스의 기본 생성자");
	}
	C(String a){
		super(1);
		System.out.println("C 출력");
	}
	
	int a = 22;
	int b = 33;
}


public class Super_Test {

	public static void main(String[] args) {
		// 객체 생성
		C c1 = new C("오늘");
		
		// 호출 : 1. C("오늘")  --> 2. B(1) --> 3. A(1)
		// 생성 : 4. A(1) --> 5. B(1) --> C(1)
		System.out.println(c1.a);
		System.out.println(c1.b);
		

	}

}
