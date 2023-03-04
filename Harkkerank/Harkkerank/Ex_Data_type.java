import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.Cleanup;

public class Ex_Data_type {

	public static void main(String[] args) throws NumberFormatException, IOException {

		{
			@Cleanup
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
			Long x = 0L;
			String y = null;
			// 문제에 제시된 primitive type : byte , short , int , long
			// byte < short < int < long

			// 문제 풀이방법 : 입력받은 정수가 만약 byte타입의 최대 , 최소 범위라면 해당 정수는
			// 문제에서 제시해준 모든 primitive 타입으로 표현 할 수 가 있다.

			for (int i = 0; i < t; i++) {

				try {
					y = br.readLine();
					x = Long.parseLong(y);
					

					if (Byte.MAX_VALUE >= x && Byte.MIN_VALUE <= x) {
						System.out.println(x + " can be fitted in:");
						System.out.println("* byte");
						System.out.println("* short");
						System.out.println("* int");
						System.out.println("* long");
					} else if (Short.MAX_VALUE >= x && Short.MIN_VALUE <= x) {
						System.out.println(x + " can be fitted in:");
						System.out.println("* short");
						System.out.println("* int");
						System.out.println("* long");
					} else if (Integer.MIN_VALUE <= x && Integer.MAX_VALUE >= x) {
						System.out.println(x + " can be fitted in:");
						System.out.println("* int");
						System.out.println("* long");
					} else if (Long.MAX_VALUE >= x && Long.MIN_VALUE <= x) {
						System.out.println(x + " can be fitted in:");
						System.out.println("* long");
					} // end else if

				} catch (Throwable e) {
					System.out.println(y + " can't be fitted anywhere.");
				} // try - catch

			} // end for

		} // User Defined Block

	} // end main
} // end class