package chap01;
//정사각형 모양을 나타냄

import java.util.Scanner;

public class Square_01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정사각형 모양으로 나타냅니다.");
		System.out.print("단 수 :");
		int a = stdIn.nextInt();

		for(int i = 1; i <= a ; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}