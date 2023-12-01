package lab.chap10.animal;

public class Animal {        // 최상위 부모
	
	String name;
	int leg;
	String cry;
	
	Animal(){
		super();
	}
	
	Animal(String name, int leg){
		this.name = name;
		this.leg = leg;
	}
	
	
	void live() {
		System.out.println("육지에 삽니다.");
	}
	

}
