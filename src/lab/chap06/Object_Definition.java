package lab.chap06;

class Animal {
	
	// 1. 필드 
	String aName;
	String aColor;
	int aLeg;              // 팔다리 갯수
	int aSpeed;
	String aCry;
	
	// 생성자 : 필드의 기본 값을 입력하는 생성자
	Animal(){}
	
	Animal (String aName, String aColor, int aLeg, int aSpeed, String aCry){
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
		
	}
	
	// 메소드 : 필드의 모든 값을 출력하는 메소드
	void printAll() {
		System.out.println("이름 : " + aName);
		System.out.println("색깔 : " + aColor);
		System.out.println("다리 갯수 : " + aLeg);
		System.out.println("속도 : " + aSpeed);
		System.out.println("울음소리 : " + aCry);
	}
	
	// 메소드 : int abc(){ return aLeg + aSpeed ;} 
	int plus(int aLeg, int aSpeed) {
		int abc = aLeg + aSpeed;
		return abc;
	}
	
	
}

public class Object_Definition {

	public static void main(String[] args) {
		// 객체 생성 및 테스트
		Animal a = new Animal();
		
		a.printAll();
		
		// 호랑이, 독수리, 사자, 개
		System.out.println("=====================");
		Animal t = new Animal("호랑이", "줄무늬", 4, 60, "어흥");
		t.printAll();
		System.out.println("=====================");
		Animal e = new Animal("독수리", "흰색과 검정색",2, 80, "날카로운");
		e.printAll();
		System.out.println("====================");
		Animal l = new Animal("사자", "갈색", 4, 50, "어흥");
		l.printAll();
		System.out.println("====================");
		Animal d = new Animal("개", "흰색",4,10,"멍멍");
		d.printAll();

	}

}
