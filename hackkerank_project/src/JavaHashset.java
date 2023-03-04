import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
	public static Scanner sc = new Scanner(System.in);
	public static Set<String> list = new HashSet<String>();

	public static void main(String[] args) throws IOException {
		int test_Count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < test_Count; i++) {
			String temp = sc.nextLine();
			list.add(temp);
			System.out.println(list.size());
		} // End for

	} // End main
} // End class
