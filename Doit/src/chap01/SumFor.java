package chap01;
//1���� n������ ������ �� ���ϱ�

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
		
		int sum = 0; //��
		
		for (int i = one; i<=two; i++) {
			sum += i;
		}
		
		return (sum);
	}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//��������Q9
		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		
		System.out.println(sumof(a,b));
		
		//�ǽ�1-5
		/*System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //��
		
		for (int i =1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + n + " ������ ���� " + sum + " �Դϴ�.");*/
		
		//��������Q7
		//n �� ���� 7�� ��� 1 + 2 + 3 + 4 + 5 + 6 + 7  = 28 �� ����ϵ��� ����ÿ�
		
		/*for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum�� i�� ����
		}
		System.out.println(" = " + sum);*/
		
		//��������Q8
		//1���� 10������ ���� (1+10)*5�� ���� ������� ���� �� �ֽ��ϴ�. ���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		/*int gsum = 0;
		
		if(n <= 0) { //�Է¹��� ���� 0���� �۰ų� 0�� ��� �ٽ� �Է�
			System.out.print("n�� �� : ");
			n = stdIn.nextInt();
		}else if (n%2 == 0) { //�Է¹��� n�� ���� ¦���ΰ�
			gsum = (1+n)*(n/2);
			System.out.println("1���� " + n + " ������ ���� " + gsum + " �Դϴ�.");
		}else { //Ȧ�� �ΰ�
			gsum = (1+(n-1))*((n-1)/2)+n;
			System.out.println("1���� " + n + " ������ ���� " + gsum + " �Դϴ�.");
		}
		
		//gsum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��
		
		*/
		


		
	
	}
}
