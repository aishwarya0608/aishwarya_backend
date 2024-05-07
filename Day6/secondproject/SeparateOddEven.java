package secondproject;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddEven {

	public static void main(String[] args) {
	
		 List<Integer> list = Arrays.asList(1,2,3,5,12,8,9,10,7,5);
		 
		List<Integer> evens = (List<Integer>) list.stream().filter(i->i%2==0)
				.collect(Collectors.toList());
		List<Integer> odds = list.stream().filter(i->i%2==1).collect(Collectors.toList());
		
		System.out.println(evens);
		System.out.println(odds);

}
}
