import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		int list_value_input_count = sc.nextInt();

		for (int i = 0; i < list_value_input_count; i++) {
			int a = sc.nextInt();
			list.add(a);
		} // 리스트 요소 추가

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {

			String s = sc.next().substring(0, 6);

			if ("Insert".equals(s)) {
				int index = sc.nextInt();
				int num = sc.nextInt();
				list.add(index, num);
			} else {
				int num = sc.nextInt();
				list.remove(num);
			}
		}

		for (int i : list) {
			System.out.print(i + " ");
		}

	} // End main
} // End JavaList