import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ex_Substring_Comparisons_sol2 {

//	비교당하는단어 < 비교할단어  , return  음수 (Stri
//	비교당하는단어 == 비교할단어 , return  0
//	비교당하는단어 > 비교할단어  , return  양수 (String)

	private static String getSmallestAndLargest(String s, int k) {


		String smallest = "";
		String largest = "";

		String temp = s.substring(0, k); // wel
//		초기 비교값 설정

		smallest = temp; // wel
		largest = temp; // wel
//		값의 변경과 비교를 위해 만들어 놓았다.
//========================================================================

		for (int i = 0; i <= s.length() - k; i++) {

			temp = s.substring(i, i + k);
//			1) 카운터 변수 i는 최대 10까지 가능하다.그리고 s.length()는 13이다.
//			2) if( i = 10 ) => substring은 10 부터 13까지 되어야하므로
//			   => s.substring(i, i + k)
//			3) 2번의 내용으로 인해
//			   if ( i > 10 ) =>  java.lang.StringIndexOutOfBoundsException 발생
//			
//			| w | e | l | c | o | m | e | t | o | j | a | v | a | 
//			0   1   2   3   4   5   6   7   8   9   10  11  12  13

			if (smallest.compareTo(temp) > 0) {

				smallest = temp;
			} else if (largest.compareTo(temp) < 0) {

				largest = temp;
			} else {

//				int i = 0 으로 인해 처음에 동일한 문자를 비교한다. 
//				때문에 continue로 처리해줬다.
				continue;
			} // if-elseif-else
		} // end for

		return smallest + "\n" + largest;
	}// end Substring_Comparisons_sol2

//========================================================================
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s;
		int k;

		try (scan;) {
			s = scan.next();
			k = scan.nextInt();
		} // try-with-resources
		
		
//		 Scanner는 AutoClosable을 상속 받기때문에 문법적으로 자원객체 이다. 
//		 때문에 위의 문법이 정상적으로 된다.
		
	} // end main
} // end class
