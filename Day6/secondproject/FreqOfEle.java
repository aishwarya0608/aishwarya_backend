package secondproject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEle {

	public static void main(String[] args) {
	
		
		List<String> list = Arrays.asList("Hello","Welcome","Hello");
	Map<String, Long> s =list.stream().collect(Collectors.groupingBy(Function
        		 .identity(),Collectors.counting()));
	System.out.print(s);
	}

}
