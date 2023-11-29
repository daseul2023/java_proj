package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
	 	1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 7의 배수와 8의 배수를 저장후 출력 
	 	2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력 
	 	3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 	 	
	    */
		
		Scanner sc=new Scanner(System.in);
		int n;
		int room;
		int [] arr;
		do {
			System.out.println("1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 7의 배수와 8의 배수를 저장후 출력 ");
			System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력  ");
			System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 ");
			System.out.println("4. 프로그램 종료 ");
			n = sc.nextInt();
			if (n==1) {
				System.out.println("다음 방의 크기를 입력하세요>>>");
				room=sc.nextInt();
				arr = new int[room];
				int a=1;
				for (int i=0; ; a++) {
					if (i==room) {break;}
					if (a%7==0 || a%8==0) {
						arr [i] = a;
						i++;
					}
					
					}
				for (int i=0; i<arr.length; i++) {
					System.out.println("방번호 : " +i + "값 :" + arr[i]);
					
				}
				
			}else if (n==2) {
				System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 1씩 증가하는데 4의 빼고 정장후 출력  ");
				room = sc.nextInt();
				arr = new int[room];
				int a = 1;
				for(int i=0; i<arr.length; a++) {
					
					if(a%4!=0) {
						arr[i]=a;
						i++;
					}
				}
				for (int i =0; i<arr.length; i++) {
				System.out.println("방번호 : "+ i + "값 : " + arr[i]);
				}
				
			}else if(n==3) {
				System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정 하고 3의 배수는 저장하고 6의 배수는 빼고 저장후 출력 ");
				room = sc.nextInt();
				arr = new int[room];
				int a= 3;
				for (int i=0; i<arr.length; i++) {
					if (a%3==0) {
						if (a%6!=0) {
							
						}
					}
				} for (int i=0; i<arr.length; i++) {
					System.out.println("방 크기 : " + i + "값 : "+ arr[i]);
				}
				
				
			}else if (n==4) {
				
			}
			
		}while(true);

	}
	

}
