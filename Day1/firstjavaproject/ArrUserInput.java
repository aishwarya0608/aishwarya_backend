package firstjavaproject;

import java.util.Scanner;

public class ArrUserInput {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an array");
		
		int s = sc.nextInt();
		
		 System.out.println("Enter the Elements:");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
	}
		 
		 for(int i=0;i<arr.length;i++) {
			 
		 System.out.println(arr[i]);
			 
		 }

	}
}