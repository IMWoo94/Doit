package chap01;
//3���� ������ ��� �ִ��� ���Ͽ� ����մϴ�.

public class Max4 {
	// a, b, c �� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max4(3, 2, 1, 0));
		System.out.println("max3(3,2,2) = " + max4(3, 2, 2, 2));
		System.out.println("max3(3,1,2) = " + max4(3, 1, 2, 4));
		System.out.println("max3(3,2,3) = " + max4(3, 2, 3, 1));
		System.out.println("max3(2,1,3) = " + max4(2, 1, 3, 5));
	
	}
}
