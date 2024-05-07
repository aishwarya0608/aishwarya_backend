package secondproject;

import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		
	List<Integer> list1 = Arrays.asList(2,2,5,8);
	List<Integer> list2 = Arrays.asList(2,5,10,8);
	
	list1.stream().filter(list2::contains).forEach(System.out::println);
	
		
		

	}
}
