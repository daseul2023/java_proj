package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap17.ex02.Method;
import chap17.ex02.Student;

public class Acoount_Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		List<Account> aList = new ArrayList<>();
		Account a = new Account();
		int select ;
		
		List<Account> aList = new ArrayList<>();
		
   out : 	do {
			System.out.println("==================================");
			System.out.println("0. 계좌이름과 계좌번호 등록");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			System.out.println("==================================");
			System.out.println("위 내용의 정수를 입력하세요");
			select = sc.nextInt();
			switch (select) {
			case 0 : 
				a.nameAccount(aList);
				
			case 1 :
				// 입금
				a.deposit(1);
				
			case 2 : 
				// 출금
			case 3 :
			
				break out;
				
			}
			
			
			
		}while(true);
		
   		System.out.println("프로그램 종료");
		
	}

	

}
