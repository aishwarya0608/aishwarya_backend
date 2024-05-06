package secondproject;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i->(i<18);
		
		System.out.println(predicate.negate().test(10));
	}

}
