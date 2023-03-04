import java.util.Scanner;

import lombok.Cleanup;

public class Ex_OutFormatting {

	public static void main(String[] args) {
		@Cleanup
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
            System.out.printf("%-15s %03d%n", s1 , x);
        }
        System.out.println("================================");

		
	} // end main
} // end class


/* Printf 사용 방법
 * 1 ) %03d => 정수 3자리를 기본적으로 출력합니다.
 *     출력하는 숫자가 3자리수 미만이라면 빈 공간은 0으로 채웁니다.
 * 
 * 2 ) %n   => Enter의 의미와 같습니다.
 * 
 * 3 ) (%7s) => 7칸의 공간을 얻으며 문자열이 그 공간에 맞게 채워집니다.
 *     (-%7s) => '-'가 붙는다면 오른쪽으로 정렬한다.
 * 	
 * */