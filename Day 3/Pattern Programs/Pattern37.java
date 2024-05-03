package firstjavaproject;

public class Pattern37 {

	public static void main(String[] args) {
		 int n = 5;

	        for (int i = 0; i < n; i++) {
	            
	            for (int j = 0; j < 2 * (n - i - 1); j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i + 1; k++) {
	                System.out.print(k);
	                if (k < i + 1) {
	                    System.out.print(" * ");
	                }
	            }

	            System.out.println();
	        }
}

	}

/*
 
1
1 * 2
1 * 2 * 3
1 * 2 * 3 * 4
1 * 2 * 3 * 4 * 5
*/