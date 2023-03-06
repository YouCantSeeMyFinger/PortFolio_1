import java.util.Arrays;
import java.util.Comparator;

/*
 * 프로그래머스 Compare관련 문제 통과 +9점 */

class Solution {
    public String[] solution(String[] strings, int n) {

        for (String array : strings) {
            System.out.println(array + " ");
        } // End for

        // 기존의 코드를 지우고 다시 새로 짜서..
        // strings에 값이 제대로 들어오는 지 확인
        Arrays.sort(strings, new Comparator<String>() {
                    // Arrays.sort(parmeter1 , parameter2);
                    // 보통 2번쨰 파라미터를 생략하고 쓰는 경우가 많은 대 두번 째 파라미터에는
                    // Comparator 즉 내가 원하는 방법으로 정렬 할 수 있도록 Comparator Interface 사용
                    // Interface이므로 익명자식객체를 이용하고 동시에 Override

                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.charAt(n) > o2.charAt(n)) {
                            return 50;
                            // Int값을 비교할 경우에는 보통 왼쪽이 크면 retrun 값이1 오른쪽이 크면 -1 값이 같으면 0으로 외웠다.
                            // 하지만 위의 return 값은 String을 비교 할 시 return값이 엉뚱항 정수가 나온다. 때문에 왼쪽이 클 때는 양수 값이 같을때는 0 오른쪽이 클 때는 음수로 생각하는 것이 더 좋다.
                            // 때문에 리턴 값을 +-50으로 해주었다.
                        } else if (o1.charAt(n) < o2.charAt(n)) {
                            return -50;
                        } else if (o1.charAt(n) == o2.charAt(n)) {
                            return o1.compareTo(o2);
                            // n번째 인덱스가 같을 경우 판단을 어떻게 할 것인가 ?
                            // CompareTo를 이용하여 나머지를 비교하고 return값 반환 하기 위해
                            // compareTo 메소드를 사용하였다.
                        }
                        return 0;
                    } // End Override
                } // End AnnoymousObject
        );
        return strings;
    } // End solution Method
} // End class


// 번외
//public class CompareTo_Test {
//    public static void main(String[] args) {
//        String[] array = { "abc", "ab", "abcde", "abcd" };
//
//        Arrays.sort(array, new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//
//                if (o1.charAt(1) > o2.charAt(1)) {
//                    return 50;
//                } else if (o1.charAt(1) < o2.charAt(1)) {
//                    return -50;
//                } else if (o1.charAt(1) == o2.charAt(1)) {
//                    return o2.compareTo(o1);
//                }
//                return 0;
//            }
//
//        });
//
//        for (String a : array) {
//            System.out.println(a + " ");
//        }
//
//    } // End main
//} // End class

