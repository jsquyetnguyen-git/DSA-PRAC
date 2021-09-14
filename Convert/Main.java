package Convert;

public class Main {

	public static void main(String[] args) {
//		long binary = 0;
//		binary = convert(10);
//		System.out.println(binary);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonaci(i)+" ");
		}
		
	}

//	public static long convert(long decimal) {
//		long surplus;
//		if (decimal == 0) {
//			return 0;
//		} else {
//			surplus = decimal % 2;
//			return convert(decimal / 2) * 10 + surplus;
//		}
//	}

	public static int fibonaci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}else {
			return fibonaci(n-1)+fibonaci(n-2);
		}
	}

}
