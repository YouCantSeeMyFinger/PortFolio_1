import java.util.Scanner;

// 해결

/*
 * Task
Given an integer, , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5 , print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

// odd >> 홀수 // 
public class Ex_If_Else {
	
	public static void main(String[] args ) {
		
		int N;
		
		Scanner sc1 = new Scanner(System.in);
		
		N = sc1.nextInt();
		sc1.close();
		
		if ( N % 2 != 0) {
			System.out.println("Odd");
			System.out.println("Weird");
		} else {
			System.out.println("Even");
			
			if(N >=2 & N <= 5 ) {
				System.out.println("2 to 5");
				System.out.println("Not Weird");
			} //if
			
			if(N >= 6 & N <= 20) {
				System.out.println("6 to 20");
				System.out.println("Weird");
			} // if
			
			if(N > 20) {
				System.out.println("Not Weird");
			} // if
		} // else
		
		System.exit(0);
		
	} // main
} // class
