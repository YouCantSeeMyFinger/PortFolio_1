import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStructures {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<>();

		int TestCase1;
		int TestCase2;
		int list_length;
		int list_number;
		int search_list_index;
		int search_list_value_index;

		TestCase1 = sc.nextInt();
		// 첫번 째 테스트 케이스

		for (int i = 0; i < TestCase1; i++) {
			// 위의 FOR문은 List를 2차원 배열처럼 사용하기 위해 사용하였다.

			list.add(new ArrayList<>());
			// 객체 생성 ( 반복문 따로 만들어서 객체 생성하면 타임리밋 걸림 )

			list_length = sc.nextInt();
			// List 길이 입력받기

			for (int j = 0; j < list_length; j++) {
				list_number = sc.nextInt();
				list.get(i).add(list_number);
				// 입력 받은 리스트의 길이 만큼 반복하면서 값 넣어주기
			}
		}

		TestCase2 = sc.nextInt();
		// 두번 째 테스트 케이스
		try (sc;) {
			// try with resources 이용하여 Sacnner close
			for (int i = 0; i < TestCase2; i++) {

				search_list_index = sc.nextInt() - 1;
				search_list_value_index = sc.nextInt() - 1;
				try {
					System.out.println(list.get(search_list_index).get(search_list_value_index));
				} catch (Exception e) {
					System.out.println("ERROR!");
				}
				// 반복하면서 오류가 발생할 때마다 ERROR가 출력 되어야 하므로 예외처리
			}
		}

	}
}