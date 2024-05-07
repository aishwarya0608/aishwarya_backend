package secondproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,20);
		
		int list2	=list.stream().max(Comparator.naturalOrder()).get();
		int list3 =list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(list2);
		System.out.println(list3);
	}

}
