package lab.chap10.car;

public class Car {         // 부모 클래스
	
	// 필드
	String name;
	
	
	// 메소드 [인스턴스 메소드] : 인스턴스 메소드만 Overriding 됨
	
	void run() {      // 자식에서 Overriding 해서 출력
		System.out.println("모든 자동차는 달립니다.");
	}

}
