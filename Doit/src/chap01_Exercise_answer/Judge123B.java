package chap01_Exercise_answer;
import java.util.Scanner;
//�Է� ���� �������� ���/����/0�� �Ǵ�

class Judge123B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.��");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("�� ���� 1�Դϴ�.");
		else if (n == 2)
			System.out.println("�� ���� 2�Դϴ�.");
		else
			System.out.println("�� ���� 3�Դϴ�.");
	}
}
