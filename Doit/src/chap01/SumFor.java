package chap01;
//1부터 n까지의 정수의 합 구하기

import java.util.Scanner;

public class SumFor {
	
	static int sumof(int a, int b) {
		
		int one ;
		int two ;
		int temp ;
		
		one = a;
		two = b;
		
		if (a < b) {
			one = a;
			two = b;
		} else {
			one = b;
			two = a;
		}
		
		int sum = 0; //합
		
		for (int i = one; i<=two; i++) {
			sum += i;
		}
		
		return (sum);
	}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//연습문제Q9
		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println(sumof(a,b));
		
		//실습1-5
		/*System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		
		for (int i =1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");*/
		
		//연습문제Q7
		//n 의 값이 7인 경우 1 + 2 + 3 + 4 + 5 + 6 + 7  = 28 로 출력하도록 만드시오
		
		/*for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum에 i를 더함
		}
		System.out.println(" = " + sum);*/
		
		//연습문제Q8
		//1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
		
		/*int gsum = 0;
		
		if(n <= 0) { //입력받은 값이 0보다 작거나 0인 경우 다시 입력
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}else if (n%2 == 0) { //입력받은 n의 값이 짝수인가
			gsum = (1+n)*(n/2);
			System.out.println("1부터 " + n + " 까지의 합은 " + gsum + " 입니다.");
		}else { //홀수 인가
			gsum = (1+(n-1))*((n-1)/2)+n;
			System.out.println("1부터 " + n + " 까지의 합은 " + gsum + " 입니다.");
		}
		
		//gsum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
		
		*/
		


		
	
	}
}
