package secondproject;

import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Radar","Hello","Hi");
String s=list.stream().skip(list.size()-1).findFirst().get();
	
	{
		System.out.println(s);
		
	 }

	}

}
