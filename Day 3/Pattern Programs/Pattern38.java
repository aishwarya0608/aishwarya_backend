package firstjavaproject;

public class Pattern38 {

	public static void main(String[] args) {
		  int n = 5;
	        char letters = 'A';

	        for (int i = 0; i < n; i++) {
	           
	            for (int j = 0; j < 2 * (n - i - 1); j++) {
	                System.out.print(" ");
	            }
	            
	            for (int k = 0; k <= i; k++) {
	                System.out.print((char)(letters + k));
	                if (k < i) {
	                    System.out.print(" ");
	                }
	            }
	            
	            
	            for (int l = i - 1; l >= 0; l--) {
	                System.out.print(" " + (char)(letters + l));
	            }

	            System.out.println();
	        }
	    }

	}


