package chap01;
//���簢�� ����� ��Ÿ��

import java.util.Scanner;

public class Square_01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���簢�� ������� ��Ÿ���ϴ�.");
		System.out.print("�� �� :");
		int a = stdIn.nextInt();

		for(int i = 1; i <= a ; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}