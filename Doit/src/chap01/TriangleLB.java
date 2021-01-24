package chap01;
//���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.

import java.util.Scanner;

public class TriangleLB {
	
	static void triangleLB(int n) {
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");
		for(int i = 1; i <= n ; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j<= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	static void triangleRU(int n) {
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j<= i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n-i+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void spira(int n) {
		System.out.println("n ���� �Ƕ�̵�");
		
		
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j<= n - i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	static void nspira(int n) {
		System.out.println("n ���� ���� �Ƕ�̵�");
		
		
		for(int i = 1; i <= n ; i++) {
			for (int j = 1; j<= n - i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1 ; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a;
		
		do {
			System.out.print("�� �� �ﰢ���Դϱ�? :");
			a = stdIn.nextInt();
			
		}while(a <= 0);

		triangleLB(a);
		triangleLU(a);
		triangleRB(a);
		triangleRU(a);
		spira(a);
		nspira(a);
	}
}