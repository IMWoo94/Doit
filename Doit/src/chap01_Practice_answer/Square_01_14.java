package chap01_Practice_answer;
import java.util.Scanner;
//���簢�� ����� ��Ÿ��

public class Square_01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("���簢�� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��£�");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}