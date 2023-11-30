package chap17.ex02;

public class Student {
	// 클래스 : 객체를 만들기 위한 틀,          객체 (인스턴스) : 클래스를 기반으로 메모리에 로드된 것
	
	// 1. 필드 : 속성
	String name;
	String addr;
	int num;
	int kor; int eng; int math;
	
	// 2. 생성자 : 클래스를 기반으로 객체 생성 시 생성자 호출
	      // 2-1 : 기본 생성자 : 다른 생성자가 없을 때는 생략되어 외부에서 호출이 가능
	Student(){}	      
	      // 2-2 : input 값이 1개인 생성자
	Student(String name) {this.name=name;}
	Student (int num){ this.num=num;}
	Student(String name, String addr){this.name=name;this.addr=addr;}
	Student(String name, String addr, int num){this.name = name; this.addr = addr; this.num=num;}
	Student (String name, int kor, int eng, int math){ this.name=name; this.kor = kor; this.eng=eng; this.math=math;}
	
	// 생성자 오버로딩 
	// 메소드 오버로딩 (Overloading) : 메소드 이름이 동일, 시그니처에 따라서 해당 메소드 호출
	         // 식별자 (시그니처) : 인풋 갯수, 인풋 자료형
	// 메소드 오버라이딩 (Overriding) : 상속 관계에서 부모 클래스의 메소드를 새롭게 재정의해서 사용하는 것
	         // 상속 : 중복된 코드를 방지
	         // 다형성 : 하나의 메소드가 여러 형태로 출력
	
	// 3. 메소드 : 기능, 입력 --> 출력 <--
	
	// 메소드 : kor, eng, math 점수를 합계와 평균을 구해서 출력 메소드
	public void hapAvg () {
		int hap = 0;
		hap = kor + eng + math;
		double avg = hap / 3.0;
		
		System.out.println(name + " 님의 점수의 합계는 " + hap + " 이고, 평균은 : "+ avg);
	}

			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddr() {
				return addr;
			}
			public void setAddr(String addr) {
				this.addr = addr;
			}
			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			public int getKor() {
				return kor;
			}
			public void setKor(int kor) {
				this.kor = kor;
			}
			public int getEng() {
				return eng;
			}
			public void setEng(int eng) {
				this.eng = eng;
			}
			public int getMath() {
				return math;
			}
			public void setMath(int math) {
				this.math = math;
			}
			
			// toString () : Object 클래스의 메소드, 객체 자체를 출력 시 힙의 주소가 출력되지 않고 필드의 값을 출력
			
		@Override
		public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
		}
			

	public static void main(String[] args) {


	
	}
	
}
