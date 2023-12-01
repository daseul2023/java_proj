package chap10.ex03;

public class Dog extends Animal{
	
	// 부모의 모든 필드와 메소드가 상속된다.
	
	@Override  // 덮어쓴다.
	void cry() {
		
		System.out.println("개는 멍멍하고 짖습니다.");
	}

}
