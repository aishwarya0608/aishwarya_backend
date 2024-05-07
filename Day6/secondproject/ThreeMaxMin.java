package secondproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxMin {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,40,5,55,2);
		
		/* min */
		list.stream().sorted().limit(3).forEach(System.out::println);
		
		/* max */
		 
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
