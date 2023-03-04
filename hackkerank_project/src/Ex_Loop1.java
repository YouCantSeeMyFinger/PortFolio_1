import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_Loop1 {
	public static void main(String[] args) throws IOException {

		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());

	        System.out.println(N);
	        
	        bufferedReader.close();
	} // main

} // class

/* BufferedReader 정리 
 * 
 * 1 ) BufferedReader bufferedReader = new BufferedReader() 
 * 2 ) BufferedReader(Reader in) => BufferedReader는 Reader 참초타입의 참조변수를 받는다.
 * 3 )  
 * 4 )  
 * 
 * */

