package secondproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListReverseOrder {

	public static void main(String[] args) {
		   
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);
			 list.stream().sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	}
	}


