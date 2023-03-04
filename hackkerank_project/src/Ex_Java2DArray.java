import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Ex_Java2DArray {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {

			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}

		});

		bufferedReader.close();
		System.out.println("\n\n");

//		문제 : 모래시계의 값들을 모두 더해서 최대 값이 나오는 모래시계를 구하기

//		System.out.println(arr.get(0).size());
//		System.out.println(arr.get(0).get(0));
		// 리스트에서 리스트 꺼내기 확인

		int sum1;
		int sum2;
		int sum3;
		int result;
		int temp = Integer.MIN_VALUE;
		// temp는 if 조건문에 들어간다. 때문에 미리 초기화

//		각 for문에 -2를 해준 이유는 ArrayOutOfBound를 피하기 위해서 그리고 모래시계의 규격만 뽑기 위해서이다.

		for (int i = 0; i < arr.size() - 2; i++) {

			for (int j = 0; j < (arr.get(i).size()) - 2; j++) {

				sum1 = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
				// 모래시계 맨 윗 부분 즉 , 3개씩 짜른 후 더한 모래시계 윗 부분 값

				sum2 = arr.get(i + 1).get(j + 1);
				// 모래시계에서 모래가 떨어지는 통로 값

				sum3 = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				// 모래시계 바닥부분 즉 , 3개씩 짜른 후 더한 모래시계 아래 부분 값

				result = sum1 + sum2 + sum3;
				// 모래시계의 합

				if (temp < result) {
					temp = result;
				} // 모래시계의 값이 더 큰 값으로 갱신
			} // inner for

			System.out.println();
		} // outter for

		System.out.println(temp);

	} // End main
} // end class
