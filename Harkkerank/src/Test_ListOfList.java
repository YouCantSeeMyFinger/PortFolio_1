import java.util.ArrayList;
import java.util.List;

public class Test_ListOfList {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());
		} // End for

		
		list.get(0).add(1);

		System.out.println(list);
		
	} // End main
} // End class
