package secondproject;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachCharInStr {

	
	public static void main(String[] args) {

		String input ="Frequencyofeachcharacter";
		
		 Map<Character, Long> character = input.chars().mapToObj(c->(char) c)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 
		 System.out.println(character);
	}

}
