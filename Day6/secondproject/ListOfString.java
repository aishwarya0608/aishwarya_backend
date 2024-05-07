package secondproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOfString {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("sam", "Rashmi"," Aishu");
		 list.stream().sorted(Comparator.comparing(String::length))
		 .forEach(System.out::println);
		 
	}

}
