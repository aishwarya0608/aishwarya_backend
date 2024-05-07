package secondproject;

import java.util.Arrays;
import java.util.List;

public class PrintMultiplesOf5 {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(2,5,10,8,15);
		list.stream().filter(c->c%5==0).forEach(System.out::println);

	}

}
