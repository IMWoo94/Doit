package chap01;
//3개의 정수값 가운데 최댓값을 구하여 출력합니다.

import java.util.Scanner;

public class Median {
	// a, b, c 의 최댓값을 구하여 반환합니다.
	
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if (a <= c ) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}

	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 : " + med3(a,b,c) + " 입니다.");
	
	}
}
