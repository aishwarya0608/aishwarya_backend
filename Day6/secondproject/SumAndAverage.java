package secondproject;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

	public static void main(String[] args) {
		
		
		int[] arr = {5,10,15,5};
		
	  int arr2 = Arrays.stream(arr).sum();
	OptionalDouble arr3 = Arrays.stream(arr).average();
		System.out.println(arr2);
		System.out.print(arr3);
	}

}
