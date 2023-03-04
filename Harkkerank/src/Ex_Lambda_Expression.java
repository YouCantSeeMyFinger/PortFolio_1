import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	} // checker

	public PerformOperation isOdd() {

		return new PerformOperation() {

			@Override
			public boolean check(int a) {
				return ((a % 2 != 0) ? true : false);
				// 홀수면 true , 짝수면 false
			} // end check
		}; // 익명객체
	} // isOdd

	public PerformOperation isPrime() {

		return new PerformOperation() {

			@Override
			public boolean check(int a) {

				for (int i = 2; i <= (int) Math.sqrt(a); i++) {
					// 위의 count변수 초기를 2로 해준 이유는 소수는 1과 자기자신만 나누어질 경우 소수라고 부른다.
					// 1) 1은 모든 숫자의 약수 이기 때문에 생략해준다. (int i = 2의 이유)
					// 2) 2 < 루트(2) < 3
					// 3) (int)루트(2) 할 경우 2만 뽑힌다.
					// 때문에 i < (int) Math.sqrt(a)를 통해
					// 1과 자기자신의 약수 말고도 다른 약수가 존재하는지 알 수가 있다.
					if (a % i == 0) {
						return false;
					} // if
				} // for
				return true;
			} // check
		}; // 익명객체
	} // isprime

	public PerformOperation isPalindrome() {

		return new PerformOperation() {

			@Override
			public boolean check(int a) {
				
				StringBuffer sb = new StringBuffer(Integer.toString(a));
				
				String reverse = sb.reverse().toString();
				
//				System.out.println(reverse);
//				System.out.println(Integer.toString(a));
				
//				System.out.println(reverse instanceof String);
				
				return Integer.toString(a).equals(reverse) ? true : false;
				
				
			} // check
		}; // 익명객체
	} // isPalindrome

} // end Math

public class Ex_Lambda_Expression {

	public static void main(String[] args) throws Exception {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd(); // PerformOperation 익명객체 생성하면 가능
				ret = MyMath.checker(op, num); //
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		} // while
	} // main
} // Solution
