package firstjavaproject;

public class Pattern36 {

	public static void main(String[] args) {
		 int n = 5;

	        for (int i = 0; i < n; i++) {
	            
	            for (int j = 0; j < i * 2; j++) {
	                System.out.print(" ");
	            }

	            
	            for (int k = n - i; k >= 1; k--) {
	                System.out.print(k + " ");
	            }

	       
	            for (int l = 2; l <= n - i; l++) {
	                System.out.print(l + " ");
	            }

	            System.out.println();
	        }
	    }

	}


/*
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
*/