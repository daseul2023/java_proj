package lab.chap17.account;

public class Account_Teacher {
	
	String name; 				// 이름 
	int account; 				// 계좌 번호
	int money = 10000 ; 		// 자신 돈 
	

	void deposit (int money) {   // 입금 <== 00 입금되었습니다. 계좌의 총금액 00 입니다. 
		this.money = this.money + money; 
		System.out.println(money + "원 입금 되었습니다. " );
		System.out.println(name + "님 계좌의 총액은 " + this.money + "원 입니다.");
	}
	
	void withdraw ( int money ) {   // 출금  <== 00원 출금 했습니다. 잔고는 00 원 있습니다. 
		this.money = this.money - money; 
		System.out.println(money + "원 출금 되었습니다. " );
		System.out.println(name + "님 계좌의 잔고는 " + this.money + "원 입니다.");
	}

	// setter : name, account
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	

}