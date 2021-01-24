package chap01;
//1부터 n까지의 정수의 합 구하기

import java.util.Scanner;

public class SumWhile {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		int i = 1;
		
		while(i<=n) { //i 가 n 이하면 반복
			sum += i; // sum 에 i 를 더합니다.
			i++;      //i 값은 1만큼 증가시킵니다.
			System.out.println("n의 값 확인 : "+i); // 연습문제 Q6
		}
		
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");
	
	}
}
