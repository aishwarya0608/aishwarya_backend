package secondproject;

import java.util.Arrays;
//import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import java.util.Arrays;
//import java.util.List;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		
		int[] a= {1,10,11,4,5,6};
		int[] b= {8,9,5,2,6};
		//int[] list1 = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
				//.sorted().toArray();
		int[] list1 = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
				.sorted().distinct().toArray();
		
		
		for(int num : list1) {
			System.out.print(num+" ");
		}
	}

}
