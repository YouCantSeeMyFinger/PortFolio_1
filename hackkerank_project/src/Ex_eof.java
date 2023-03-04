import java.util.Scanner;

public class Ex_eof {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int line = 1;

		while (sc.hasNext()) {
			System.out.println(line + " " + sc.nextLine());
			line++;
		} // while

	} // main
} // class Solution