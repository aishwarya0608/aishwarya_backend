package secondproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(5,10,15,25);
		Integer list2	=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(list2);
	}

}
