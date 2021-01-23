package chap01;
//3개의 정수값 가운데 최댓값을 구하여 출력합니다.

public class Min3 {
	// a, b, c 의 최댓값을 구하여 반환합니다.
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + min3(3, 2, 1));
		System.out.println("max3(3,2,2) = " + min3(3, 2, 2));
		System.out.println("max3(3,1,2) = " + min3(3, 1, 2));
		System.out.println("max3(3,2,3) = " + min3(3, 2, 3));
		System.out.println("max3(2,1,3) = " + min3(2, 1, 3));
	
	}
}
