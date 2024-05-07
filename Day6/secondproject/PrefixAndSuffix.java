package secondproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixAndSuffix {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("remuneration","acquiesce");
		 String s =list.stream().collect(Collectors.joining("Delimeter","Prefix","Suffix"));
		 System.out.println(s+"  ");
				 
	}

}
