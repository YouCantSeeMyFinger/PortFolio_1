import java.util.Scanner;

public class Ex_Loop2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc1 = new Scanner(System.in);
		
		int t = sc1.nextInt(); // t는 q를 의미

		for (int i = 0; i < t; i++) {
			int a = sc1.nextInt();
			int b = sc1.nextInt();
			int n = sc1.nextInt();
			
			int sum = a;

			for (int j = 0; j < n; j++) {
				sum += (int)Math.pow(2, j) * b;
				System.out.print(sum+" ");
			}
			
			System.out.println();
		} // for

		sc1.close();

	} // main

} // class
