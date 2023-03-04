import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lombok.Cleanup;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;

//SubString을 사용하기 전

// | w | e | l | c | o | m | e | t | o | j | a | v | a | 
// 0   1   2   3   4   5   6   7   8   9   10  11  12  13

// 위의 표가 SubString 자르는 기준
@EqualsAndHashCode
@Log4j2
public class Ex_Substring_Comparisons_sol1 {

    private static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";
//===================================================<<<<List에 넣기>>>>>===============================================

//		1 ) "welcometojava" 를 차근차근 3개씩 자른 후에 배열에 추가해보자. ( 사전식 정렬은 나중에 생각 ) 
        {
            @Cleanup("clear")
            List<String> list = new ArrayList<>();
            // 문법적으로는 List는 AutuClosable을 상속하지 않기 때문에 자원객체가 아니다.
            // 하지만 컬렉션프레임워크는 자원을 굉장히 많이 잡아먹기 때문에 사용이 끝나면 전부 비우라고 하셨다.
            // 그리고 문법적인 자원객체가 아니기 때문에 try(list;){;;}는 안된다.

            for (int i = 0; i <= (s.length() - k); i++) {
                String str = s.substring(i, i + k);
//			java.lang.StringIndexOutOfBoundsException 발생
//			Problem  : substring의 문자열을 자를 때 순차적으로 자르는대 , index[12]번에서 index[13] , index[14]번의 값을 원하기 때문이다.
//			Solution : 반복문 count값을 10으로 해준다.

                list.add(str);
//			add를 많이 사용한다. ArrayList의 특성상 밀고당기는 현상이 있어서 시간적으로 LinkedList와 효율차이가 상당히 난다.
            } // end for

//===================================================List => Array 및 정렬================================================

            String[] arr = list.<String>toArray(new String[list.size()]);
//			 1 ) list의 요소 타입은 String 형식이기는 하지만 List의 toArray가 타입파라미터를 갖는다고 Library에 써있어서 명시해줬습니다.
//			 2 ) list를 배열로 다시 변환해준 이유는 Arrays 클래스의 정의된 sort ( 정렬 ) 메소드를 사용하고 싶어서 변환하였습니다.

//		arr.foreach(log::trace); // 오류 

            Arrays.sort(arr); //
//		int i = 0;
//		for (String a : arr) {
//			i++;
//			log.info("{}번째 = {} ", i, a);
//		} // end Enhanced for

            smallest = arr[0];
            largest = arr[(arr.length - 1)];

            return smallest + "\n" + largest;

        } // getSmallestAndLargest
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int k;
        try (scan;) {
            s = scan.next();
            k = scan.nextInt();
        } // try-with-resources

    } // end main

} // end class
