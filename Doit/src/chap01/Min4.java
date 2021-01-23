package chap01;
//3개의 정수값 가운데 최댓값을 구하여 출력합니다.

public class Min4 {
	// a, b, c 의 최댓값을 구하여 반환합니다.
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		if(d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + min4(3, 2, 1, 0));
		System.out.println("max3(3,2,2) = " + min4(3, 2, 2, 0));
		System.out.println("max3(3,1,2) = " + min4(3, 1, 2, 0));
		System.out.println("max3(3,2,3) = " + min4(3, 2, 3, 0));
		System.out.println("max3(2,1,3) = " + min4(2, 1, 3, 0));
	
	}
}
