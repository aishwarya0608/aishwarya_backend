package secondproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeStream {

	public static void main(String[] args) {
			
		
		String s= "Radar";
	boolean list1= IntStream.range(0, s.length()/2).noneMatch(i->s.charAt(i)!=s.length()-i-1);
System.out.println(list1);
	}

}
