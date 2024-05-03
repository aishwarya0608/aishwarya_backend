package firstjavaproject;
import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of the pyramid: ");
	    int size = sc.nextInt();
	    numberPyramid(size);
	   
	    sc.close();
	  }

	  static void numberPyramid(int size) {
	    
	    for (int i = 1; i <= size; i++) {
	      
	      for (int j = 1; j <= size - i; j++) {
	        System.out.print(" ");
	      }
	     
	      for (int k = 1; k <= 2 * i - 1; k++) {
	        System.out.print(k);
	      }
	      System.out.println();
	    }
	  }
	}

/*
    1
   123
  12345
 1234567
123456789
*/

