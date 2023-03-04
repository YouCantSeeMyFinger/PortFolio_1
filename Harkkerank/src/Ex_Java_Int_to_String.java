import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_Java_Int_to_String {

	private final BufferedReader br;

	public Ex_Java_Int_to_String() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	} // end constructor

	public static void main(String... args) {
		Ex_Java_Int_to_String example = new Ex_Java_Int_to_String();

		example.check(example);

	} // end main

	private void check(Ex_Java_Int_to_String example) {
		try {
			try (example.br) {
				Integer.parseInt(example.br.readLine());
			}
		} catch (Exception e) {
			System.out.println("Wrong answer");
			System.exit(0);
		} // try-with-resources
		System.out.println("Good job");

	} // end check
} // end class
