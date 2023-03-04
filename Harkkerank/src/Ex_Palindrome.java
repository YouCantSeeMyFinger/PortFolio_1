import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ex_Palindrome {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.print("입력 값 : ");
		String name = sc1.nextLine();
		sc1.close();

//		=========================================

		StringBuffer sb1 = new StringBuffer(name);

		String R_name = sb1.reverse().toString();
//		toString() 사용 이유 => R_name 에 저장하기 위해서
//		String은 Char의 배열이다. 그렇기 때문에 for을 이용하여 거꾸로 출력할 수도 있따

//		for(int i = name.length() -1 ; i>=0 ; i--) {
//			charAt(i) 사용
//		} 



		name.equals(R_name);

	} // main

} // end class
