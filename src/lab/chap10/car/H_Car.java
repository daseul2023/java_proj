package lab.chap10.car;

public class H_Car extends Car {

	@Override            // @ (어노테이션), @Override : 부모의 메소드를 오버라이딩 하겠다고 선언 
	                     // 안붙여도 오버라이드 됨, 단 메소드가 오타가 있거나 부모가 가지고 있는 메소드가 아닐 시 오류를 잡을 수 없어서 있는게 좋다.
	void run() {
		System.out.println("현대자동차는 부릉하고 달립니다.");
	}
	
}
