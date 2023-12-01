package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {
	
	public static void main(String[] args) {
		// 자식객체를 생성하면서 부모타입으로 지정 후 부모의 메소드 호출 시 Overriding 된 자식의 메소드가 작동된다.
		// car.run()   - 다형성
		
		Car c1 = new Car();
		
		c1.name = "붕붕이";
		
		// 부모의 run() 을 호출 시 자식의 Overriding 된 메소드 작동됨.
		c1.run();
		
		Car c2 = new H_Car();
		c2.run();
		
		Car c3 = new K_Car();
		c3.run();
		
		Car c4 = new S_Car();
		c4.run();
		
		// ArrayList<Car> 
		// 선언
		List<Car> aList = new ArrayList<>();
		
		aList.add(c2);
		aList.add(c3);
		aList.add(c4);
		
		// for 문을 사용해서 끄집어내서 출력
		System.out.println("========================");
		
		for (int i=0; i<aList.size(); i++) {
			
			aList.get(i).run();               // run 메소드 안에 이미 print 가 들어가있기 때문에 syso 를 사용하지 않는다!!
		}
		
	}

}
