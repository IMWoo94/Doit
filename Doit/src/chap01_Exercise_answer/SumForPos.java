package chap01_Exercise_answer;
import java.util.Scanner;
//1, 2, ��, n�� ���� ���մϴ�(����� �Է�).

class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1���� n������ �������մϴ�.");

		do {
			System.out.print("n�� ����");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;		// ��

		for (int i = 1; i <= n; i++)
			sum += i;		// sum�� i�� ����

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}