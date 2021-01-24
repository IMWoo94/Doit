package chap01;
//1부터 n까지의 합을 구합니다. (양수만 입력받도록)

import java.util.Scanner;

public class SumForPos {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n ;
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		int sum = 0; //합
		
		for (int i =1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");
	
	}
}
