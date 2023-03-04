import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_StaticInitializer {

	public static int B;
	public static int H;
	public static BufferedReader br;

	static {

		Ex_StaticInitializer.br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Ex_StaticInitializer.B = Integer.parseInt(Ex_StaticInitializer.br.readLine());
			Ex_StaticInitializer.H = Integer.parseInt(Ex_StaticInitializer.br.readLine());
		} catch (Throwable e) {
			e.printStackTrace();
		} // end try catch

	}// end static initialize

	public static void main(String[] args) {

		if (Ex_StaticInitializer.B > 0 && Ex_StaticInitializer.H > 0) {
			System.out.println(Ex_StaticInitializer.B * Ex_StaticInitializer.H);
		} else if (Ex_StaticInitializer.B <= 0 || Ex_StaticInitializer.H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} // end if else
	} // end main
} // end class

/*
 * Static initialize를 이해하는게 중요하다.
 * 
 * ~.java 파일은 컴파일 과정을 거쳐서 ~.class로 변환된다. ( 이 과정에서 .class 파일은 binary 파일을 가지고 있다.
 * )
 * 
 * 위의 과정에서 클래스 로더는 바이너리 파일을 읽고 메소드영역에 클래스의 정보를 적재한다.
 * 
 */
