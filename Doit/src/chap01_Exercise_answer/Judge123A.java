package chap01_Exercise_answer;
import java.util.Scanner;
//입력 받은 정수값의 양수/음수/0을 판단

class Judge123A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("이 수는 1입니다.");
		else if (n == 2)
			System.out.println("이 수는 2입니다.");
		else if (n == 3)
			System.out.println("이 수는 3입니다.");
	}
}