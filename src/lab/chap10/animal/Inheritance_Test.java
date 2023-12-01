package lab.chap10.animal;

public class Inheritance_Test {

	public static void main(String[] args) {
			// 상속 설정 후 필드와 메소드 생성
			// Animal
			//       Tiger
			//            TigerChild
			//       Lion
			//       Dog
			
			// 업캐스팅 <-----> 다운캐스팅
		
		Animal a = new Dog();
		
		// Animal
		a.name = "고양이";
		
		Tiger t = (Tiger) a;
		t.dotShape();
		
		TigerChild t1 = (TigerChild) t;
		t1.mom = "tiger";
		
		// 업캐스팅
		Animal a1 = t1;
		
		Animal aa1 = new Tiger();
		
		TigerChild aa2 = (TigerChild) aa1;
		
		Tiger t2 = (aa2 instanceof Tiger) ? (Tiger)aa2 :null; 
	
		System.out.println(t2);

	}

}
